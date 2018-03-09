package com.xzy.springboot.repository;
import com.xzy.springboot.entity.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author XuZiyu
 * @date 2018-3-116:35
 * @description
 */
@CacheConfig(cacheNames = "users")
public interface UserRepository extends JpaRepository<User, Long>{
    @Cacheable(key = "#p0")
    User findByName(String name);

    @CachePut(key = "#p0.name")
    User save(User user);
}