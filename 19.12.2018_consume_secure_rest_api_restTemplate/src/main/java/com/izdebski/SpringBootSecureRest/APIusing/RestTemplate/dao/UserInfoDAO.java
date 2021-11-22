package com.izdebski.SpringBootSecureRest.APIusing.RestTemplate.dao;

import com.izdebski.SpringBootSecureRest.APIusing.RestTemplate.entity.UserInfo;

public interface UserInfoDAO {
    public abstract UserInfo getActiveUser(String userName);
}