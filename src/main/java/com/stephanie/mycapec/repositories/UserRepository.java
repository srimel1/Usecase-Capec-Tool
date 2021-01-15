package com.stephanie.mycapec.repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.stephanie.mycapec.models.User;

import java.util.Collection;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(final String email);


}
