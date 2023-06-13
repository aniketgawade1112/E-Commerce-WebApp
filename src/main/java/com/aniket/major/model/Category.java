package com.aniket.major.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cateogry_id")
    private int id;

    private String name;
}
