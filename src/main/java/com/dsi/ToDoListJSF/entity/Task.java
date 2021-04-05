package com.dsi.ToDoListJSF.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private BigDecimal price;

    public Task() {
    }

    public Task(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
