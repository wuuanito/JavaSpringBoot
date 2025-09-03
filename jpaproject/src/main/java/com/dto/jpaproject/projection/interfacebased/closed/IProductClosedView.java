package com.dto.jpaproject.projection.interfacebased.closed;

public interface IProductClosedView {

    String getName();
    String getBrand();

    ILocalClosedView getLocalModel();
}
