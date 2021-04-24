package com.example.jpa.demojpa.service;

import com.example.jpa.demojpa.helper.SampleServiceHelper;
import com.example.jpa.demojpa.model.Table1;
import com.example.jpa.demojpa.repo.Table1Repository;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class SampleService {

    private final Table1Repository table1Repository;

    public SampleService(Table1Repository table1Repository) {
        this.table1Repository = table1Repository;
    }


    public Table1 saveEntry(Table1 table1){

        if(Objects.isNull(table1))
            return table1Repository.save(SampleServiceHelper.getSampleEntry());
        return table1Repository.save(table1);
    }

}
