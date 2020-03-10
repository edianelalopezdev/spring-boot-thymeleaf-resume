package com.edianelalopezdev.springbootthymeleafresume.mapper;

import com.edianelalopezdev.springbootthymeleafresume.entity.ContactInformationEntity;
import com.edianelalopezdev.springbootthymeleafresume.model.ContactInformation;
import org.springframework.stereotype.Service;

@Service
public class ContactInformationMapperImpl implements ContactInformationMapper {

    @Override
    public ContactInformation mapEntityToModel(ContactInformationEntity contactInformationEntity) {
        ContactInformation contactInformation = new ContactInformation();
        contactInformation.setId(contactInformationEntity.getId());
        contactInformation.setPhoneNumber(contactInformationEntity.getPhoneNumber());
        contactInformation.setEmailAddress(contactInformationEntity.getEmailAddress());
        contactInformation.setCurrentAddress(contactInformationEntity.getCurrentAddress());
        contactInformation.setPermanentAddress(contactInformationEntity.getPermanentAddress());
        return contactInformation;
    }

    @Override
    public ContactInformationEntity mapModelToEntity(ContactInformation contactInformation) {
        ContactInformationEntity contactInformationEntity = new ContactInformationEntity();
        contactInformationEntity.setId(contactInformationEntity.getId());
        contactInformationEntity.setPhoneNumber(contactInformationEntity.getPhoneNumber());
        contactInformationEntity.setEmailAddress(contactInformationEntity.getEmailAddress());
        contactInformationEntity.setCurrentAddress(contactInformationEntity.getCurrentAddress());
        contactInformationEntity.setPermanentAddress(contactInformationEntity.getPermanentAddress());
        return contactInformationEntity;
    }
}
