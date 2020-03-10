package com.edianelalopezdev.springbootthymeleafresume.mapper;

import com.edianelalopezdev.springbootthymeleafresume.entity.TechnicalSkillEntity;
import com.edianelalopezdev.springbootthymeleafresume.model.TechnicalSkill;
import org.springframework.stereotype.Service;

@Service
public class TechnicalSkillMapperImpl implements TechnicalSkillMapper {

    @Override
    public TechnicalSkill mapEntityToModel(TechnicalSkillEntity technicalSkillEntity) {
        TechnicalSkill technicalSkill = new TechnicalSkill();
        technicalSkill.setId(technicalSkillEntity.getId());
        technicalSkill.setSkill(technicalSkillEntity.getSkill());
        technicalSkill.setGroup(technicalSkillEntity.getCategory());
        return technicalSkill;
    }

    @Override
    public TechnicalSkillEntity mapModelToEntity(TechnicalSkill technicalSkill) {
        TechnicalSkillEntity technicalSkillEntity = new TechnicalSkillEntity();
        technicalSkillEntity.setId(technicalSkill.getId());
        technicalSkillEntity.setSkill(technicalSkill.getSkill());
        technicalSkillEntity.setCategory(technicalSkill.getGroup());
        return technicalSkillEntity;
    }
}
