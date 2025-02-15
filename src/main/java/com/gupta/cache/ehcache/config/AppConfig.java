package com.gupta.cache.ehcache.config;

import com.gupta.cache.ehcache.enums.CacheNames;
import org.ehcache.CacheManager;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.cache.configuration.MutableConfiguration;

@Configuration
public class AppConfig {


    @Bean
    public CacheManager cacheManagerCustomizer() {
        CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder().
                withCache(CacheNames.MY_CACHE.getName(),
                        CacheConfigurationBuilder.newCacheConfigurationBuilder(Integer.class,
                                String.class, ResourcePoolsBuilder.heap(100))).build();
        cacheManager.init();
        return cacheManager;
    }
}

