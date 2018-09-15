package com.thrift.server;

import org.apache.thrift.TException;
import org.springframework.stereotype.Controller;

/**
 * @author qiaoyu
 */
@Controller
public class HelloServiceImpl implements HelloService.Iface {

    @Override
    public String helloString(String param) throws TException {
        return "hello: " + param;
    }
}
