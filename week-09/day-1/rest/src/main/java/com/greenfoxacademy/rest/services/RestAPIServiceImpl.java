package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.Doubling;
import com.greenfoxacademy.rest.models.RestError;
import org.springframework.stereotype.Service;

@Service
public class RestAPIServiceImpl implements RestAPIService {

  @Override
  public Doubling getDoubling(int input) {
    Doubling doubling = new Doubling();
    doubling.setReceived(input);
    doubling.setResult(input * 2);
    return doubling;
  }

  @Override
  public RestError getNoInputErrorMessage() {
    return new RestError("Please provide an input!");
  }
}
