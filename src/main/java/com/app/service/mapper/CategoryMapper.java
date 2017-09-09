package com.app.service.mapper;

import com.app.domain.*;
import com.app.service.dto.CategoryDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Category and its DTO CategoryDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface CategoryMapper extends EntityMapper <CategoryDTO, Category> {
    
    @Mapping(target = "categoryBlogs", ignore = true)
    Category toEntity(CategoryDTO categoryDTO); 
    default Category fromId(Long id) {
        if (id == null) {
            return null;
        }
        Category category = new Category();
        category.setId(id);
        return category;
    }
}
