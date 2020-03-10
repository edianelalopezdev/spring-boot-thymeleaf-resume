package com.edianelalopezdev.springbootthymeleafresume.mapper;

import com.edianelalopezdev.springbootthymeleafresume.entity.EducationEntity;
import com.edianelalopezdev.springbootthymeleafresume.model.Education;
import org.springframework.stereotype.Service;

@Service
public class EducationMapperImpl implements EducationMapper{

    @Override
    public Education mapEntityToModel(EducationEntity educationEntity) {
        Education education = new Education();
        education.setId(educationEntity.getId());
        education.setSchool(educationEntity.getSchool());
        education.setDescription(educationEntity.getDescription());
        education.setAddress(educationEntity.getAddress());
        return education;
    }

    @Override
    public EducationEntity mapModelToEntity(Education education) {
        EducationEntity educationEntity = new EducationEntity();
        educationEntity.setId(education.getId());
        educationEntity.setSchool(education.getSchool());
        educationEntity.setDescription(education.getDescription());
        educationEntity.setAddress(education.getAddress());
        return educationEntity;
    }
}
