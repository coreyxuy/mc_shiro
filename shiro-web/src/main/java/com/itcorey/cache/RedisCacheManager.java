package com.itcorey.cache;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;

import javax.annotation.Resource;

/**
 * Created by ：Corey
 * 11:25 2018/12/14
 */
public class RedisCacheManager implements CacheManager {

    @Resource
    private  RedisCache redisCache;

    @Override
    public <K, V> Cache<K, V> getCache(String s) throws CacheException {

        return redisCache;
    }
}
