package com.dto.jpaproject.projection.interfacebased.open;

import org.springframework.beans.factory.annotation.Value;

public interface ILocalOpenView {

    @Value("#{target.name + ' ' + target.floor}")
    String getNameAndFloor();
}
