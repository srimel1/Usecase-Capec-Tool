package com.stephanie.mycapec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.stephanie.mycapec.models.Apdb;

public interface ApdbRepository extends JpaRepository<Apdb, Integer>, JpaSpecificationExecutor<Apdb> {

}