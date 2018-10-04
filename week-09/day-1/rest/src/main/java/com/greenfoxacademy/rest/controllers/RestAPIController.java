package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.*;
import com.greenfoxacademy.rest.services.RestAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestAPIController {

  @Autowired
  RestAPIService restAPIService;

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input == null) {
      return restAPIService.getNoInputErrorMessage();
    }

    return restAPIService.getDoubling(input);
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return new RestError("Please provide a name!");
    } else if (title == null) {
      return new RestError("Please provide a title!");
    }

    return new Greeter("Oh, hi there " + name + ", my dear " + title + "!");
  }

  @GetMapping("/appenda/{appendable}")
  public Object appendable(@PathVariable(value = "appendable") String appendable) {
    return new AppendA(appendable + "a");
  }

  @PostMapping("/dountil/{action}")
  public Object dountil(@RequestBody Until until,
                        @PathVariable(value = "action") String action) {

    if (action.equals("sum")) {
      int sum = 0;
      for (int i = 1; i <= until.getUntil(); i++) {
        sum = sum + i;
      }

      return new Dountil(sum);
    }

    int fact = 1;
    for (int i = 1; i <= until.getUntil(); i++) {
      fact = fact * i;
    }

    return new Dountil(fact);
  }

  @PostMapping("/arrays")
  public Object arrays(@RequestBody What what) {
    if (what.getWhat() == null || what.getNumbers() == null) {
      return new RestError("Please provide what to do with the numbers!");
    }

    if (what.getWhat().equals("sum") || what.getWhat().equals("multiply")) {
      return new WhatSumMultiply(what);
    }

    return new WhatDouble(what);
  }
}