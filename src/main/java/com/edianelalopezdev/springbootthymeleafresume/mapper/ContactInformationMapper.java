package com.edianelalopezdev.springbootthymeleafresume.mapper;

import com.edianelalopezdev.springbootthymeleafresume.entity.ContactInformationEntity;
import com.edianelalopezdev.springbootthymeleafresume.model.ContactInformation;

public interface ContactInformationMapper {

    ContactInformation mapEntityToModel(ContactInformationEntity contactInformationEntity);
    ContactInformationEntity mapModelToEntity(ContactInformation contactInformation);
}
