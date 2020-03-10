package com.edianelalopezdev.springbootthymeleafresume.gateway;

import com.edianelalopezdev.springbootthymeleafresume.model.Profile;
import java.util.Optional;

public interface ProfileGateway {

    Optional<Profile> getProfile();

    void createOrUpdateProfile(Profile profile);
}
