package com.izdebski.SpringBootProfilesApp.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class DevProfileBean implements EnvBasedConfig {
    @Override
    public void setup() {
        System.out.println("Dev config is setup..");

    }
}