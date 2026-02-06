package com.gstsgy.permission.repository;

import com.gstsgy.permission.bean.db.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}