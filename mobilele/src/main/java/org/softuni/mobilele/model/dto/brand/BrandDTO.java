package org.softuni.mobilele.model.dto.brand;

import org.softuni.mobilele.model.dto.model.ModelDTO;

import java.util.List;

public record BrandDTO(String name, List<ModelDTO> models) {
}
