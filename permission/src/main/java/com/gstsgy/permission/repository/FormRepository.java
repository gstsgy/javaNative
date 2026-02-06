package com.gstsgy.permission.repository;

import com.gstsgy.permission.bean.db.Form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<Form, Long> {
}