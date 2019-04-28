package com.sample.demo.v1.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
// https://docs.spring.io/spring-data/jpa/docs/1.8.0.RELEASE/reference/html/#jpa.named-parameters  jpa的文档，支持分页查询等
public interface UserRepository extends CrudRepository<User, Integer> {
    @Transactional(readOnly = true)
    // = :name   Using named parameters
    // = ?12     value
    @Query("SELECT user FROM User user WHERE user.phoneNum = :phoneNum")
    User findUserByPhone(@Param("phoneNum") String phoneNum);
}
