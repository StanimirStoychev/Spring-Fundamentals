package com.example.mobilelele.services.model;

import com.example.mobilelele.repositories.ModelRepository;
import com.example.mobilelele.services.init.DataBaseInitService;
import org.springframework.stereotype.Service;

@Service
public class ModelServiceImpl implements ModelService, DataBaseInitService {

    private final ModelRepository modelRepository;

    public ModelServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return this.modelRepository.count() > 0;
    }
}
