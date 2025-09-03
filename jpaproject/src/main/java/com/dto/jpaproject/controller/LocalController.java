package com.dto.jpaproject.controller;


import com.dto.jpaproject.models.LocalModel;
import com.dto.jpaproject.projection.interfacebased.open.ILocalOpenView;
import com.dto.jpaproject.service.ILocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/local")
public class LocalController {

    @Autowired
    ILocalService localService;

    @GetMapping("/findAll")
    public List<LocalModel> findAll(){
        return localService.findAll();
    }

    @GetMapping("/findAllLocalOpenView")
    public List<ILocalOpenView> findBy(){
        return localService.findBy();
    }
}
