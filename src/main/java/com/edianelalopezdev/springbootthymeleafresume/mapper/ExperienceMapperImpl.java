package com.edianelalopezdev.springbootthymeleafresume.mapper;

import com.edianelalopezdev.springbootthymeleafresume.entity.ExperienceEntity;
import com.edianelalopezdev.springbootthymeleafresume.model.Experience;
import org.springframework.stereotype.Service;

@Service
public class ExperienceMapperImpl implements ExperienceMapper{

    @Override
    public Experience mapEntityToModel(ExperienceEntity experienceEntity) {
        Experience experience = new Experience();
        experience.setId(experienceEntity.getId());
        experience.setRole(experienceEntity.getRole());
        experience.setCompany(experienceEntity.getCompany());
        experience.setProject(experienceEntity.getProject());
        return experience;
    }

    @Override
    public ExperienceEntity mapModelToEntity(Experience experience) {
        ExperienceEntity experienceEntity = new ExperienceEntity();
        experienceEntity.setId(experience.getId());
        experienceEntity.setRole(experience.getRole());
        experienceEntity.setCompany(experience.getCompany());
        experienceEntity.setProject(experience.getProject());
        return experienceEntity;
    }
}
