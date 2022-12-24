package com.example.databasechangeservice.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author NhatPA
 * @since 23/12/2022 - 16:53
 */
@Configuration
public class DatasourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.auth")
    DataSourceProperties authDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    DataSource authDataSource() {
        return authDataSourceProperties()
                .initializeDataSourceBuilder()
                .build();
    }

//    @Bean
//    JdbcTemplate authJdbcTemplate(@Qualifier("authDataSource") DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }

//    @Bean
//    public TransactionManager authTransaction() {
//        return new DataSourceTransactionManager(authDataSource());
//    }


    @Bean
    @ConfigurationProperties("spring.datasource.mission")
    DataSourceProperties missionDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    DataSource missionDataSource() {
        return missionDataSourceProperties()
                .initializeDataSourceBuilder()
                .build();
    }

//    @Bean
//    JdbcTemplate missionJdbcTemplate(@Qualifier("missionDataSource") DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }

//    @Bean
//    public TransactionManager missionTransaction() {
//        return new DataSourceTransactionManager(missionDataSource());
//    }
}
