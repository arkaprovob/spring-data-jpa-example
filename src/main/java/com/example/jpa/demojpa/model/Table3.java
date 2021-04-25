package com.example.jpa.demojpa.model;

import javax.persistence.*;

@Entity
@Table(name = "table3",schema = "public")
public class Table3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "table3_id")
    private Long id;
    @Column(name = "mapping")
    private String mapping;
    private String functionBody;

    public Table3() {
    }

    public Table3(String mapping, String functionBody) {
        this.mapping = mapping;
        this.functionBody = functionBody;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMapping() {
        return mapping;
    }

    public void setMapping(String mapping) {
        this.mapping = mapping;
    }

    public String getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(String functionBody) {
        this.functionBody = functionBody;
    }
}
