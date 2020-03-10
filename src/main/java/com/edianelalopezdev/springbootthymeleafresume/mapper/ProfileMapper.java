package com.edianelalopezdev.springbootthymeleafresume.mapper;

import com.edianelalopezdev.springbootthymeleafresume.entity.ProfileEntity;
import com.edianelalopezdev.springbootthymeleafresume.model.Profile;
import com.edianelalopezdev.springbootthymeleafresume.request.ProfileForm;
import com.edianelalopezdev.springbootthymeleafresume.response.ProfileResource;

public interface ProfileMapper {

    Profile mapEntityToModel(ProfileEntity profileEntity);
    ProfileEntity mapModelToEntity(Profile profile);
    ProfileResource mapModelToResource(Profile profile);
    Profile mapFormToModel(ProfileForm profileForm);
}
