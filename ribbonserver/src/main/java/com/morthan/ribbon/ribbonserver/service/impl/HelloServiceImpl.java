package com.morthan.ribbon.ribbonserver.service.impl;

import com.morthan.ribbon.ribbonserver.service.HelloService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * <p>名称 :  </p>
 * <p>版本 : 1.0 </p>
 * <p>作者 : M.chen </p>
 * <p>日期 : 2018/12/3 </p>
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Resource
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
