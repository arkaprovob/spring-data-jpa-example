package com.example.jpa.demojpa.repo;

import com.example.jpa.demojpa.model.Table2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Table2Repository extends JpaRepository<Table2,Long> {
}
