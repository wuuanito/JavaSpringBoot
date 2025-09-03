package com.dto.jpaproject.service;

import com.dto.jpaproject.models.ProductModel;
import com.dto.jpaproject.projection.classbased.ProductDTO;
import com.dto.jpaproject.projection.interfacebased.closed.IProductClosedView;

import java.util.List;
import java.util.Optional;

public interface IProductService {


    List<ProductModel> findAll();

    List<IProductClosedView> findBy();

    Optional<IProductClosedView> findProductById(Long id); // id, no id_product

    List<ProductDTO> findProductBy();

}
