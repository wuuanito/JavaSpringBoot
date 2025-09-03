package com.dto.jpaproject.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "tbl_product")
public class ProductModel {


    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Long id;

    @Column
    private String name;

    @Column
    private String brand;

    @Column
    private boolean expired;

    @Column
    private float price;

    @ManyToOne
    @JoinColumn(
            name = "id_local",
            referencedColumnName = "id_local"
    )
    private LocalModel localModel;
}
