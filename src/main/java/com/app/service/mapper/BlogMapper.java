package com.app.service.mapper;

import com.app.domain.*;
import com.app.service.dto.BlogDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Blog and its DTO BlogDTO.
 */
@Mapper(componentModel = "spring", uses = {CategoryMapper.class, })
public interface BlogMapper extends EntityMapper <BlogDTO, Blog> {

    @Mapping(source = "category.id", target = "categoryId")
    @Mapping(source = "category.name", target = "categoryName")
    BlogDTO toDto(Blog blog); 

    @Mapping(source = "categoryId", target = "category")
    Blog toEntity(BlogDTO blogDTO); 
    default Blog fromId(Long id) {
        if (id == null) {
            return null;
        }
        Blog blog = new Blog();
        blog.setId(id);
        return blog;
    }
}
