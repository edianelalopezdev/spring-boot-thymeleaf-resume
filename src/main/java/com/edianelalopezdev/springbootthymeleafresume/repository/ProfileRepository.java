package com.edianelalopezdev.springbootthymeleafresume.repository;

import com.edianelalopezdev.springbootthymeleafresume.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {
}
