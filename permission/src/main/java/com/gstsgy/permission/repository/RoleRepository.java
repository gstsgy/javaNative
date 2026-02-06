package com.gstsgy.permission.repository;

import com.gstsgy.permission.bean.db.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}