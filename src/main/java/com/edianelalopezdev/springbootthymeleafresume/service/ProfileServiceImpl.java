package com.edianelalopezdev.springbootthymeleafresume.service;

import com.edianelalopezdev.springbootthymeleafresume.gateway.ProfileGateway;
import com.edianelalopezdev.springbootthymeleafresume.mapper.ProfileMapper;
import com.edianelalopezdev.springbootthymeleafresume.model.Profile;
import com.edianelalopezdev.springbootthymeleafresume.request.ProfileForm;
import com.edianelalopezdev.springbootthymeleafresume.response.ProfileResource;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class ProfileServiceImpl implements ProfileService {

    private final ProfileGateway profileGateway;
    private final ProfileMapper profileMapper;

    @Override
    public ProfileResource getProfile() {

        Optional<Profile> _profile = profileGateway.getProfile();

        if (!_profile.isPresent()) {
            throw new RuntimeException("profile_not_exists");
        }

        return profileMapper.mapModelToResource(_profile.get());
    }

    @Override
    public String createOrUpdateProfile(ProfileForm profileForm) {
        Optional<Profile> _profile = profileGateway.getProfile();

        Profile profile = profileMapper.mapFormToModel(profileForm);

        if (_profile.isPresent()) {
            profile.setId(_profile.get().getId());
            profileGateway.createOrUpdateProfile(profile);
            return "view-profile";
        }

        profileGateway.createOrUpdateProfile(profile);
        return "view-profile";
    }
}
