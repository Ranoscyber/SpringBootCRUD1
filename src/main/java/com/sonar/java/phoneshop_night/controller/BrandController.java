package com.sonar.java.phoneshop_night.controller;

import com.sonar.java.phoneshop_night.dto.BrandDTO;
import com.sonar.java.phoneshop_night.entity.Brand;
import com.sonar.java.phoneshop_night.service.BrandService;
import com.sonar.java.phoneshop_night.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping
    public ResponseEntity<?> Create(@RequestBody BrandDTO brandDTO){
        Brand brand = Mapper.toBrand(brandDTO);
        brand = brandService.create(brand);

        return ResponseEntity.ok(Mapper.toBrandDTO(brand));
    }

    @GetMapping("{id}")
    public ResponseEntity<?> Getone(@PathVariable Integer id){
        Brand brand = brandService.getById(id);
        return ResponseEntity.ok(Mapper.toBrandDTO(brand));
    }

}
