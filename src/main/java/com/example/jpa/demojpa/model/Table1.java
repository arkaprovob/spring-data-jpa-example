package com.example.jpa.demojpa.model;

import javax.persistence.*;

@Entity
@Table(name = "table1",schema = "public")
public class Table1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "fk0_table2", referencedColumnName = "arc_type"),
            @JoinColumn(name = "fk1_table2", referencedColumnName = "gen")
    })
    private Table2 table2;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_table3", referencedColumnName = "mapping")
    private Table3 table3;

    public Table1() {
    }

    public Table1(String name, Table2 table2, Table3 table3) {
        this.name = name;
        this.table2 = table2;
        this.table3 = table3;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Table2 getTable2() {
        return table2;
    }

    public void setTable2(Table2 table2) {
        this.table2 = table2;
    }

    public Table3 getTable3() {
        return table3;
    }

    public void setTable3(Table3 table3) {
        this.table3 = table3;
    }
}
