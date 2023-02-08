package com.example.mobilelele.services.brand;


import com.example.mobilelele.repositories.BrandRepository;
import com.example.mobilelele.services.init.DataBaseInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService, DataBaseInitService {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void dbInit() {
    }

    @Override
    public boolean isDbInit() {
        return this.brandRepository.count() > 0;
    }
}
