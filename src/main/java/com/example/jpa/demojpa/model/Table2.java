package com.example.jpa.demojpa.model;

import javax.persistence.*;

@Entity
@Table(name = "table2",schema = "public")
public class Table2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "table2_id")
    private Long id;
    @Column(name = "arc_type")
    private String arcType;
    private String gen;

    public Table2() {
    }

    public Table2(String arcType, String gen) {
        this.arcType = arcType;
        this.gen = gen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArcType() {
        return arcType;
    }

    public void setArcType(String arcType) {
        this.arcType = arcType;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }
}
