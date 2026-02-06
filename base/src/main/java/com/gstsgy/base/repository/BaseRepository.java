package com.gstsgy.base.repository;

import com.gstsgy.base.bean.db.BaseTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository extends JpaRepository<BaseTable, Long> {
}
