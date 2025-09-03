package com.dto.jpaproject.service;

import com.dto.jpaproject.models.ProductModel;
import com.dto.jpaproject.projection.classbased.ProductDTO;
import com.dto.jpaproject.projection.interfacebased.closed.IProductClosedView;
import com.dto.jpaproject.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductServiceImpl implements IProductService{

    @Autowired
    IProductRepository repository;

    @Override
    public List<ProductModel> findAll() {
        return repository.findAll();
    }

    @Override
    public List<IProductClosedView> findBy() {
        return repository.findBy();
    }

    @Override
    public Optional<IProductClosedView> findProductById(Long id) {
        return repository.findProjectedById(id);
    }

    @Override
    public List<ProductDTO> findProductBy() {
        return repository.findProductBy();
    }


}
