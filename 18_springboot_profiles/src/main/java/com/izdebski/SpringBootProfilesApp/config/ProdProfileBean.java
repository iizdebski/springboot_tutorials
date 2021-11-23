package com.izdebski.SpringBootProfilesApp.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class ProdProfileBean implements EnvBasedConfig {
    @Override
    public void setup() {
        System.out.println("Prod config is setup..");

    }
}
