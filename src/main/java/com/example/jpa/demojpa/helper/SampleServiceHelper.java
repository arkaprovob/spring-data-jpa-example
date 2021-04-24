package com.example.jpa.demojpa.helper;

import com.example.jpa.demojpa.model.Table1;
import com.example.jpa.demojpa.model.Table2;
import com.example.jpa.demojpa.model.Table3;

public class SampleServiceHelper {


    private static Table3  table3Entry= new Table3("sampleMapping","fun(a,b):int{return a+b}");
    private static Table2 table2Entry= new Table2("default","skylake");
    private static Table1 table1Entry =  new Table1("first sample",table2Entry,table3Entry);

    public static Table1 getSampleEntry(){
        return table1Entry;
    }

}
