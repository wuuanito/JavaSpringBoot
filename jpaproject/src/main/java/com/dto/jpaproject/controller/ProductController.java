package com.dto.jpaproject.controller;

import com.dto.jpaproject.models.ProductModel;
import com.dto.jpaproject.projection.classbased.ProductDTO;
import com.dto.jpaproject.projection.interfacebased.closed.IProductClosedView;
import com.dto.jpaproject.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @Autowired
    IProductService productService;

    @GetMapping("/findAll")
    public List<ProductModel> findAll(){
        return  productService.findAll();
    }

    @GetMapping("/findAllProductClosedView")
    public List<IProductClosedView> findAllProductClosedView(){
        return productService.findBy();
    }

    @GetMapping("/findById/{id}")
    public Optional<IProductClosedView> findProductById(@PathVariable Long id){
        return productService.findProductById(id);
    }
    @GetMapping("/findProductClassBased")
    public List<ProductDTO> findProductClassBased(){
        return productService.findProductBy();
    }
}
