package com.example.jpa.demojpa.util;

import com.example.jpa.demojpa.model.Table1;
import com.example.jpa.demojpa.model.Table2;
import com.example.jpa.demojpa.model.Table3;

import java.util.ArrayList;
import java.util.List;

public class SampleEntry {

    private static Table3 table3Entry0 = new Table3("sampleMapping",
            "fun(a,b):int{return a+b}");
    private static Table3 table3Entry1 = new Table3("newMapping",
            "fun(b):int{return b+b}");
    private static Table3 table3Entry2 = new Table3("negativeInteger",
            "fun(a):int{return -a}");
    private static Table3 table3Entry3 = new Table3("randomMapping",
            "fun(0):int{return rand(5)}");


    private static Table2 table2Entry0 = new Table2("default", "skylake");
    private static Table2 table2Entry1 = new Table2("alpha", "m1");
    private static Table2 table2Entry2 = new Table2("beta", "arm");
    private static Table2 table2Entry3 = new Table2("rc", "x86");


    private static Table1 table1Entry0 = new Table1("first sample", table2Entry0, table3Entry0);
    private static Table1 table1Entry1 = new Table1("second sample", table2Entry1, table3Entry1);
    private static Table1 table1Entry2 = new Table1("Third sample", table2Entry2, table3Entry2);
    private static Table1 table1Entry3 = new Table1("Fourth sample", table2Entry3, table3Entry3);


    public static Table1 getSampleEntry() {
        return table1Entry0;
    }

    public static List<Table1> getSampleEntries() {

        List<Table1> listOfEntries = new ArrayList<>();
        listOfEntries.add(table1Entry0);
        listOfEntries.add(table1Entry1);
        listOfEntries.add(table1Entry2);
        listOfEntries.add(table1Entry3);
        return listOfEntries;
    }
}
