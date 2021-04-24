package com.example.jpa.demojpa.repo;

import com.example.jpa.demojpa.model.Table3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Table3Repository extends JpaRepository<Table3,Long> {
}
