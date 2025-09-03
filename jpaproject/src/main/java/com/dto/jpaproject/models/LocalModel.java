package com.dto.jpaproject.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_local")
public class LocalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_local")
    private Long id;

    @Column
    private String name;

    @Column
    private String floor;
}
