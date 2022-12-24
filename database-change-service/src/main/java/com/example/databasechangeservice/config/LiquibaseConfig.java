package com.example.databasechangeservice.config;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author NhatPA
 * @since 23/12/2022 - 20:57
 */
@Configuration
public class LiquibaseConfig {

    @Bean
    @ConfigurationProperties(prefix = "datasource.auth.liquibase")
    LiquibaseProperties authLiquibaseProperties() {
        return new LiquibaseProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "datasource.mission.liquibase")
    LiquibaseProperties missionLiquibaseProperties() {
        return new LiquibaseProperties();
    }

    @Bean
    SpringLiquibase authLiquibase(DataSource authDataSource) {
        return springLiquibase(authDataSource, authLiquibaseProperties());
    }

    @Bean
    SpringLiquibase missionLiquibase(DataSource missionDataSource) {
        return springLiquibase(missionDataSource, missionLiquibaseProperties());
    }

    private SpringLiquibase springLiquibase(DataSource dataSource, LiquibaseProperties properties) {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(dataSource);
        liquibase.setChangeLog(properties.getChangeLog());
        liquibase.setContexts(properties.getContexts());
        liquibase.setDefaultSchema(properties.getDefaultSchema());
        liquibase.setDropFirst(properties.isDropFirst());
        liquibase.setShouldRun(properties.isEnabled());
        liquibase.setLabels(properties.getLabels());
        liquibase.setChangeLogParameters(properties.getParameters());
        liquibase.setRollbackFile(properties.getRollbackFile());
        return liquibase;
    }
}
