package com.example.mobilelele.repositories;

import com.example.mobilelele.domain.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<UserRole, String> {
    Optional<UserRole> findByRole(String role);
}
