package com.springdiexample.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("com")
public class SfgConstructorConfig {

    private final String superuser;
    private final String password;
    private final String jdbcurl;


    public SfgConstructorConfig(String superuser, String password, String jdbcurl) {
        this.superuser = superuser;
        this.password = password;
        this.jdbcurl = jdbcurl;
    }

    public String getSuperuser() {
        return superuser;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }

}
