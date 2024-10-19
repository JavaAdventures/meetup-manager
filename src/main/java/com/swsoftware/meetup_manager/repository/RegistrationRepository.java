package com.swsoftware.meetup_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swsoftware.meetup_manager.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer>{
  
}
