package com.edianelalopezdev.springbootthymeleafresume.mapper;

import com.edianelalopezdev.springbootthymeleafresume.entity.EducationEntity;
import com.edianelalopezdev.springbootthymeleafresume.model.Education;

public interface EducationMapper {

    Education mapEntityToModel(EducationEntity educationEntity);
    EducationEntity mapModelToEntity(Education education);
}
