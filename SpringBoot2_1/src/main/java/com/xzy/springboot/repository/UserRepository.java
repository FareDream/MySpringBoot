package com.xzy.springboot.repository;

import com.xzy.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author XuZiyu
 * @date 2018-3-116:35
 * @description
 */
public interface UserRepository extends JpaRepository<User, Long>{

    User findByName(String name);

    User findByNameAndAge(String name, Integer age);

    @Query("from User u where u.name=:name")
    User findUser(@Param("name") String name);
}