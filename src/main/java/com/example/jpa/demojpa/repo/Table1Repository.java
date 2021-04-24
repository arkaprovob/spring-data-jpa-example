package com.example.jpa.demojpa.repo;

import com.example.jpa.demojpa.model.Table1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Table1Repository extends JpaRepository<Table1,Long> {
}
