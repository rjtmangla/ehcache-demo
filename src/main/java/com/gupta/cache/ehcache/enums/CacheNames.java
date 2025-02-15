package com.gupta.cache.ehcache.enums;

public enum CacheNames {

    MY_CACHE("myCache");
    private final String name;

    CacheNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
