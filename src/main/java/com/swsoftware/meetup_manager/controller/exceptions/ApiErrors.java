package com.swsoftware.meetup_manager.controller.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.web.server.ResponseStatusException;

import com.swsoftware.meetup_manager.exception.BusinessException;

public class ApiErrors {
  private final List<String> errors;

  public ApiErrors(BindingResult bindingResult) {
    this.errors = new ArrayList<>();
    bindingResult.getAllErrors().forEach(error -> this.errors.add(error.getDefaultMessage()));
  }

  public ApiErrors(BusinessException e){
    this.errors = Arrays.asList(e.getMessage());
  }

  public ApiErrors(ResponseStatusException e){
    this.errors = Arrays.asList(e.getReason());
  }

  public List<String> getErrors() {
    return errors;
  }
}
