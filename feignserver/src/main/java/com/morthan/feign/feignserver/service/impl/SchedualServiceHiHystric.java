package com.morthan.feign.feignserver.service.impl;

import com.morthan.feign.feignserver.service.SchedualServiceHi;
import org.springframework.stereotype.Service;

/**
 * <p>名称 :  </p>
 * <p>版本 : 1.0 </p>
 * <p>作者 : M.chen </p>
 * <p>日期 : 2018/12/4 </p>
 */
@Service
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
