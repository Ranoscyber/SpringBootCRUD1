package com.sonar.java.phoneshop_night.impl;

import com.sonar.java.phoneshop_night.entity.Brand;
import com.sonar.java.phoneshop_night.repository.BrandRepository;
import com.sonar.java.phoneshop_night.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public Brand create(Brand brand) {
        return brandRepository.save(brand);
    }
}
