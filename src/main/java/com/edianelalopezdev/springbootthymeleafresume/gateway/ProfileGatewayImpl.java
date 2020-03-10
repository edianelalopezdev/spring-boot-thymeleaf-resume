package com.edianelalopezdev.springbootthymeleafresume.gateway;

import com.edianelalopezdev.springbootthymeleafresume.entity.ProfileEntity;
import com.edianelalopezdev.springbootthymeleafresume.mapper.ProfileMapper;
import com.edianelalopezdev.springbootthymeleafresume.model.Profile;
import com.edianelalopezdev.springbootthymeleafresume.repository.ProfileRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class ProfileGatewayImpl implements ProfileGateway {

    private final ProfileRepository profileRepository;
    private final ProfileMapper profileMapper;

    @Override
    public Optional<Profile> getProfile() {
        return profileRepository.findAll()
                .stream()
                .findFirst()
                .map(profileMapper::mapEntityToModel);
    }

    @Override
    public void createOrUpdateProfile(Profile profile) {
        ProfileEntity profileEntity = profileMapper.mapModelToEntity(profile);
        profileRepository.save(profileEntity);
    }
}
