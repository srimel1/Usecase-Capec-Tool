package com.stephanie.mycapec.repositories;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.stephanie.mycapec.models.UseCase;
import org.springframework.data.repository.query.Param;

public interface UseCaseRepository extends JpaRepository<UseCase, Long> {

    UseCase findByTitle(final String title);



}
