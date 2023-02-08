package com.example.mobilelele.repositories;

import com.example.mobilelele.domain.entities.UserRole;
import com.example.mobilelele.domain.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<UserRole, String> {
    Optional<UserRole> findByRole(Role role);
}
