package com.dto.jpaproject.repository;

import com.dto.jpaproject.models.LocalModel;
import com.dto.jpaproject.projection.interfacebased.open.ILocalOpenView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILocalRepository extends JpaRepository<LocalModel,Long> {

    List<ILocalOpenView> findBy();
}
