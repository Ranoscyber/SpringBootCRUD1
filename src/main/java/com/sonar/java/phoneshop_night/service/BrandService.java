package com.sonar.java.phoneshop_night.service;

import com.sonar.java.phoneshop_night.entity.Brand;

public interface BrandService {
    Brand create(Brand brand);
    Brand getById(Integer id);
}
