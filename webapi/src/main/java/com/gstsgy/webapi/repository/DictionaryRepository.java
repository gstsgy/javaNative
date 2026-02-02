package com.gstsgy.webapi.repository;

import com.gstsgy.webapi.bean.Dictionary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DictionaryRepository extends JpaRepository<Dictionary, Long> {
}
