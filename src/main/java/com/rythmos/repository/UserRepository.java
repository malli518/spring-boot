package com.rythmos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rythmos.entity.User;

import java.util.List;
import java.util.Optional;

/**
 * Created by NagamalleswaraRao.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    List<User> findByIdIn(List<Long> userIds);

    Optional<User> findByUsername(String username);
    @Query
    Boolean existsByUsername(String username);
    @Query
    Boolean existsByEmail(String email);
}
