package com.edianelalopezdev.springbootthymeleafresume.service;

import com.edianelalopezdev.springbootthymeleafresume.request.ProfileForm;
import com.edianelalopezdev.springbootthymeleafresume.response.ProfileResource;

public interface ProfileService {

    ProfileResource getProfile();

    String createOrUpdateProfile(ProfileForm profileForm);
}
