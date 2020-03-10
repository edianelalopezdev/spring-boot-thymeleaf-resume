package com.edianelalopezdev.springbootthymeleafresume.mapper;

import com.edianelalopezdev.springbootthymeleafresume.entity.ProfileEntity;
import com.edianelalopezdev.springbootthymeleafresume.model.Profile;
import com.edianelalopezdev.springbootthymeleafresume.request.ProfileForm;
import com.edianelalopezdev.springbootthymeleafresume.response.ProfileResource;
import org.springframework.stereotype.Service;

@Service
public class ProfileMapperImpl implements ProfileMapper {

    @Override
    public Profile mapEntityToModel(ProfileEntity profileEntity) {
        Profile profile = new Profile();
        profile.setId(profileEntity.getId());
        profile.setFirstName(profileEntity.getFirstName());
        profile.setMiddleName(profileEntity.getMiddleName());
        profile.setLastName(profileEntity.getLastName());
        profile.setObjective(profileEntity.getObjective());
        profile.setRole(profileEntity.getRole());
        return profile;
    }

    @Override
    public ProfileEntity mapModelToEntity(Profile profile) {
        ProfileEntity profileEntity = new ProfileEntity();
        profileEntity.setId(profile.getId());
        profileEntity.setFirstName(profile.getFirstName());
        profileEntity.setMiddleName(profile.getMiddleName());
        profileEntity.setLastName(profile.getLastName());
        profileEntity.setObjective(profile.getObjective());
        profileEntity.setRole(profile.getRole());
        return profileEntity;
    }

    @Override
    public ProfileResource mapModelToResource(Profile profile) {
        ProfileResource profileResource = new ProfileResource();
        profileResource.setId(profile.getId());
        profileResource.setFirstName(profile.getFirstName());
        profileResource.setMiddleName(profile.getMiddleName());
        profileResource.setLastName(profile.getLastName());
        profileResource.setObjective(profile.getObjective());
        profileResource.setRole(profile.getRole());
        return profileResource;
    }

    @Override
    public Profile mapFormToModel(ProfileForm profileForm) {
        Profile profile = new Profile();
        profile.setFirstName(profileForm.getFirstName());
        profile.setMiddleName(profileForm.getMiddleName());
        profile.setLastName(profileForm.getLastName());
        profile.setObjective(profileForm.getObjective());
        profile.setRole(profileForm.getRole());
        return profile;
    }
}
