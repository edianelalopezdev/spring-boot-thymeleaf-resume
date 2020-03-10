package com.edianelalopezdev.springbootthymeleafresume.mapper;

import com.edianelalopezdev.springbootthymeleafresume.entity.TechnicalSkillEntity;
import com.edianelalopezdev.springbootthymeleafresume.model.TechnicalSkill;

public interface TechnicalSkillMapper {

    TechnicalSkill mapEntityToModel(TechnicalSkillEntity technicalSkillEntity);
    TechnicalSkillEntity mapModelToEntity(TechnicalSkill technicalSkill);
}
