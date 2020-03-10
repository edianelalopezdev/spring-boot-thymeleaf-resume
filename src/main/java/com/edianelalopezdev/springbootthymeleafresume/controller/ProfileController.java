package com.edianelalopezdev.springbootthymeleafresume.controller;

import com.edianelalopezdev.springbootthymeleafresume.request.ProfileForm;
import com.edianelalopezdev.springbootthymeleafresume.response.ProfileResource;
import com.edianelalopezdev.springbootthymeleafresume.service.ProfileService;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
@RequestMapping
@Slf4j
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping(value = "/profile")
    public String getProfile(Model model) {
        try {
            ProfileResource profile = profileService.getProfile();
            model.addAttribute("profile", profile);
            return "view-profile";

        } catch (RuntimeException e) {

            log.info("{}", e.getMessage());
            return "view-profile";
        }
    }

    @GetMapping(value = "/create-update-profile")
    public String showCreateUpdateProfileForm(Model model) {
        model.addAttribute("profileForm", new ProfileForm());
        return "create-update-profile";
    }

    @PostMapping(value = "/profile")
    public String createUpdateProfile(@Valid ProfileForm profileForm, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "create-update-profile";
        }

        profileService.createOrUpdateProfile(profileForm);
        ProfileResource profile = profileService.getProfile();
        model.addAttribute("profile", profile);
        return "view-profile";
    }
}
