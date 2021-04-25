package com.example.jpa.demojpa.service;

import com.example.jpa.demojpa.model.Table1;
import com.example.jpa.demojpa.repo.Table1Repository;
import com.example.jpa.demojpa.util.SampleEntry;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class SampleService {

    private final Table1Repository table1Repository;

    public SampleService(Table1Repository table1Repository) {
        this.table1Repository = table1Repository;
    }


    public Table1 saveEntry(Table1 table1) {
        if (Objects.isNull(table1))
            return table1Repository.save(SampleEntry.getSampleEntry());
        return table1Repository.save(table1);
    }

    public List<Table1> saveEntries(List<Table1> table1) {
        if (Objects.isNull(table1))
            return table1Repository.saveAll(SampleEntry.getSampleEntries());
        return table1Repository.saveAll(table1);
    }

}
