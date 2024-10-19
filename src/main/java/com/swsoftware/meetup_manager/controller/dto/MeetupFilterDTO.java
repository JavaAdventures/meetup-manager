package com.swsoftware.meetup_manager.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MeetupFilterDTO {
  
  private String registration;

  private String event;
}
