package com.stephanie.mycapec.repositories;

import com.stephanie.mycapec.models.User;
import groovy.util.logging.Log;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.stephanie.mycapec.models.Apdb;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface ApdbRepository extends JpaRepository<Apdb, Integer>, JpaSpecificationExecutor<Apdb> {

//    @Query("SELECT u.Mitigations FROM apdb u WHERE u.ID = 1")
//    Collection<Apdb> findMitigation();
//

//
    @Query("SELECT u.Name FROM Apdb u WHERE u.ID = ?1")
    Apdb findApdbByID(Integer id);

//    @Query("SELECT u.Name FROM Apdb u WHERE u.ID = ?1")
//    String findApdbByMitigations(Integer id);




}