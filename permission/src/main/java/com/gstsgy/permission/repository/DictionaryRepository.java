package com.gstsgy.permission.repository;

import com.gstsgy.permission.bean.db.Dictionary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DictionaryRepository extends JpaRepository<Dictionary, Long> {
}