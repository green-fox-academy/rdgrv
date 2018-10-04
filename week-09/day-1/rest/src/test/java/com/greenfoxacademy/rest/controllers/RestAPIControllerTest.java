package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.Doubling;
import com.greenfoxacademy.rest.models.RestError;
import com.greenfoxacademy.rest.services.RestAPIService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(RestAPIController.class)
public class RestAPIControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private RestAPIService restAPIService;

  @Test
  public void doublingShouldReturnProperResult_when_inputIsGiven() throws Exception {
    int input = 15;
    int result = 30;

    when(restAPIService.getDoubling(input)).thenReturn(new Doubling(input, result));

    mockMvc.perform(get("/doubling?input=" + input))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.received", is(input)))
        .andExpect(jsonPath("$.result", is(result)))
        .andDo(print());
  }

  @Test
  public void doublingShouldReturnErrorMessage_when_noInput() throws Exception {

    String expectedErrorMessage = "Please provide an input!";

    when(restAPIService.getNoInputErrorMessage()).thenReturn(new RestError(expectedErrorMessage));

    mockMvc.perform(get("/doubling"))
        .andExpect(status().is(200))
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.error", is(expectedErrorMessage)))
        .andDo(print());
  }
}