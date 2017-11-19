package com.hk.blog.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by kang on 2017/11/18.
 */
@EnableJpaRepositories(basePackages = "com.hk.blog.dao")
@EntityScan(basePackages = "com.hk.blog.entity")
public class JpaConfig {
}
