package com.edianelalopezdev.springbootthymeleafresume.controller;

import com.edianelalopezdev.springbootthymeleafresume.response.ProfileResource;
import com.edianelalopezdev.springbootthymeleafresume.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping
    public ProfileResource getProfile() {
        return profileService.getProfile();
    }

    @RequestMapping(value = "/")
    public String createOrUpdateProfile() {

        return "add-profile";
    }
}
