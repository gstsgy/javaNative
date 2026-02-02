package com.gstsgy.base.repository;

import com.gstsgy.base.bean.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository extends JpaRepository<BaseEntity, Long> {
}
