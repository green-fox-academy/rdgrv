package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.Doubling;
import com.greenfoxacademy.rest.models.RestError;

public interface RestAPIService {

  Doubling getDoubling(int input);
  RestError getNoInputErrorMessage();
}
