package com.edianelalopezdev.springbootthymeleafresume.mapper;

import com.edianelalopezdev.springbootthymeleafresume.entity.ResponsibilityEntity;
import com.edianelalopezdev.springbootthymeleafresume.model.Responsibility;

public interface ResponsibilityMapper {

    Responsibility mapEntityToModel(ResponsibilityEntity responsibilityEntity);

    ResponsibilityEntity mapModelToEntity(Responsibility responsibility);
}
