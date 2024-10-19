package com.swsoftware.meetup_manager.controller.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class RegistrationDTO {
  
  private Integer id;

  @NotEmpty
  private String name;

  @NotEmpty
  private String dateOfRegistration;

  @NotEmpty
  private String registration;
}
