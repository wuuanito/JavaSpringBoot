package com.dto.jpaproject.service;

import com.dto.jpaproject.models.LocalModel;
import com.dto.jpaproject.projection.interfacebased.open.ILocalOpenView;

import java.util.List;

public interface ILocalService {

    List<LocalModel> findAll();
    List<ILocalOpenView> findBy();

}
