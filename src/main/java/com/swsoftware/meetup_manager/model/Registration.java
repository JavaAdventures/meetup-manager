package com.swsoftware.meetup_manager.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Registration {
  
  @Id
  @Column(name = "registration_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "person_name")
  private String name;

  @Column(name = "date_of_registration")
  private String dateOfRegistration;

  @Column
  private String registration;

  @OneToMany(mappedBy = "registration")
  private List<Meetup> meetups;

}
