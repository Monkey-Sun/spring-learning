package com.sample.demo.v1.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("SELECT DISTINCT user FROM User user WHERE user.phoneNum LIKE :phoneNum%")
    @Transactional(readOnly = true)
    User findUserByPhone(@Param("phoneNum") String phoneNum);

}
