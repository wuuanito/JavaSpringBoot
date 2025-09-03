package com.dto.jpaproject.repository;

import com.dto.jpaproject.models.ProductModel;
import com.dto.jpaproject.projection.classbased.ProductDTO;
import com.dto.jpaproject.projection.interfacebased.closed.IProductClosedView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IProductRepository extends JpaRepository<ProductModel,Long> {

    //Vista Cerrada Interfaz
    List<IProductClosedView> findBy();

    Optional<IProductClosedView> findProjectedById(Long id);

    //Vista de vista basada en clases

    List<ProductDTO> findProductBy();


}
