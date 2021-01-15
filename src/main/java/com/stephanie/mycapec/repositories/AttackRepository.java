package com.stephanie.mycapec.repositories;

import com.stephanie.mycapec.models.Attack;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface AttackRepository extends JpaRepository<Attack, Integer>, JpaSpecificationExecutor<Attack> {

//    @Query("SELECT u.Mitigations FROM apdb u WHERE u.ID = 1")
//    Collection<Apdb> findMitigation();
//

//
    @Query("SELECT u FROM apdb u WHERE u.id = ?1")
    Attack findApdbByID(Integer id);
    
    

//
//
//    @Query(value = "SELECT u FROM Apdb u WHERE u.Name IN :names")
//    List<Apdb> findApdbByNameList(@Param("names") Collection<String> names);


//    @Query("SELECT u FROM Apdb u WHERE u.name = :name")
//    Apdb findUserByNameNamedParams(
//            @Param("name") String name);

//    @Query("SELECT u FROM User u WHERE u.name LIKE :name")
//    Apdb findApdbByName(@Param("name") String name);

//    @Query("SELECT u FROM User u WHERE u.status = :status and u.name = :name")
//    User findUserByStatusAndNameNamedParams(
//            @Param("status") Integer status,
//            @Param("name") String name);


//    @Query("SELECT u FROM Apdb u WHERE u.Name = ?1")
//    Apdb findApdbByName(String name);

//    @Query("SELECT u FROM Apdb u WHERE u.Name LIKE ?1")
//    Apdb findApdbByName(String name);

//    @Query("SELECT u FROM Apdb u WHERE u.id = ?1 and u.name = ?2")
//    Apdb findApdbByIDAndName(Integer id, String name);

//    @Query("SELECT u FROM Apdb u WHERE u.Name = ?1")
//    Apdb findApdbByName(String name);

//    @Query("SELECT u.Name FROM Apdb u WHERE u.ID = ?1")
//    String findApdbByMitigations(Integer id);


//    @Query(value = "SELECT u FROM Apdb u WHERE u.Description LIKE ?1 OR u.Name LIKE '%authenticate%'")
//    List<Apdb> findApdbByNameAndDescription(String name);



}