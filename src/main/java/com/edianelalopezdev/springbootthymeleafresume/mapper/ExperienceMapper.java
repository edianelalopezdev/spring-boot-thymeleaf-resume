package com.edianelalopezdev.springbootthymeleafresume.mapper;

import com.edianelalopezdev.springbootthymeleafresume.entity.ExperienceEntity;
import com.edianelalopezdev.springbootthymeleafresume.model.Experience;

public interface ExperienceMapper {

    Experience mapEntityToModel(ExperienceEntity experienceEntity);
    ExperienceEntity mapModelToEntity(Experience experience);
}
