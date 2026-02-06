package com.gstsgy.permission.repository;

import com.gstsgy.permission.bean.db.Operator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperatorRepository extends JpaRepository<Operator, Long> {
}