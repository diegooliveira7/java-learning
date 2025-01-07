package com.test.test_spring_app.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, String>  {
}
