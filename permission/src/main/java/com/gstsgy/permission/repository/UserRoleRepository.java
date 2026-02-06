package com.gstsgy.permission.repository;

import com.gstsgy.permission.bean.db.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}