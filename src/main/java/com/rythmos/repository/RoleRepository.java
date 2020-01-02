package com.rythmos.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rythmos.entity.Role;
import com.rythmos.entity.RoleName;

import java.util.Optional;

/**
 * Created by NagamalleswaraRao.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
