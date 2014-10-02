package com.softserveinc.softtour.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softserveinc.softtour.entity.Password;

public interface PasswordRepository extends JpaRepository<Password, Long> {

}
