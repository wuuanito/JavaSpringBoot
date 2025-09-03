package com.dto.jpaproject.service;

import com.dto.jpaproject.models.LocalModel;
import com.dto.jpaproject.projection.interfacebased.open.ILocalOpenView;
import com.dto.jpaproject.repository.ILocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LocalServiceImpl implements ILocalService {

    @Autowired
    ILocalRepository repository;



    @Override
    public List<LocalModel> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ILocalOpenView> findBy() {
        return repository.findBy();
    }
}
