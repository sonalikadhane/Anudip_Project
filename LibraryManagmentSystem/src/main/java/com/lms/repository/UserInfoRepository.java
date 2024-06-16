package com.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.entities.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo,Integer>{

}
