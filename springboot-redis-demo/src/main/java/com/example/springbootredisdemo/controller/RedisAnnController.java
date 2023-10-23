package com.example.springbootredisdemo.controller;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-23
 * Time: 17:26
 */
@RestController
public class RedisAnnController {
    /**
     * 存入或者读取缓存
     *
     * @param name
     * @param phone
     * @return
     */
    @RequestMapping("/annget")
    @Cacheable(value = "spring.cache", key = "#name+'-'+#phone")
    public String annGet(String name, String phone) {
        if (!StringUtils.hasLength(name) || !StringUtils.hasLength(phone)) {
            return null;
        }
        System.out.println("执行了，annGet");
        return "name=" + name + " | phone=" + phone;
    }

    /**
     * 缓存删除
     * @param name
     * @param phone
     */
    @RequestMapping("/anndel")
    @CacheEvict(value = "spring.cache", key = "#name+'-'+#phone")
    public void anndel(String name, String phone) {
        System.out.println("执行了缓存删除");
    }

    @RequestMapping("/annupdate")
    @CachePut(value = "spring.cache", key = "#name+'-'+#phone")
    public String annupdate(String name, String phone) {
        if (!StringUtils.hasLength(name) || !StringUtils.hasLength(phone)) {
            return null;
        }
        System.out.println("执行了缓存更新");
        return "[name=" + name + "<-> phone=" + phone + "]";
    }


}
