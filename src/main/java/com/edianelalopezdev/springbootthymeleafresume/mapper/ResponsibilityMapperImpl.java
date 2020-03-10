package com.edianelalopezdev.springbootthymeleafresume.mapper;

import com.edianelalopezdev.springbootthymeleafresume.entity.ResponsibilityEntity;
import com.edianelalopezdev.springbootthymeleafresume.model.Responsibility;
import org.springframework.stereotype.Service;

@Service
public class ResponsibilityMapperImpl implements ResponsibilityMapper {

    @Override
    public Responsibility mapEntityToModel(ResponsibilityEntity responsibilityEntity) {
        Responsibility responsibility = new Responsibility();
        responsibility.setId(responsibilityEntity.getId());
        responsibility.setRole(responsibilityEntity.getRole());
        return responsibility;
    }

    @Override
    public ResponsibilityEntity mapModelToEntity(Responsibility responsibility) {
        ResponsibilityEntity responsibilityEntity = new ResponsibilityEntity();
        responsibilityEntity.setId(responsibility.getId());
        responsibilityEntity.setRole(responsibility.getRole());
        return responsibilityEntity;
    }
}
