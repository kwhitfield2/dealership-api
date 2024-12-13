package com.pluralsight.dealershipAPI.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class DatabaseConfiguration {
    private BasicDataSource basicDataSource;

    public DatabaseConfiguration(
            @Value("${datasource.url}") String url,
            @Value("${datasource.username}")String username,
            @Value("${datasource.password}")String password
    ) {
        basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
    }
    @Bean
    public DataSource dataSource(){
        return basicDataSource;
    }
}
