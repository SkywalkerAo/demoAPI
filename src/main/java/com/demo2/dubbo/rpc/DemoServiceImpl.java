package com.demo2.dubbo.rpc;

import com.alibaba.fastjson.JSONObject;
import demo.dubbo.service.DemoService;


/**
 * @author SkyWalker
 * @date 2019/10/8.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String simpleService(String s) {
        return "recive message: "+ s;
    }

    @Override
    public JSONObject simpleRpcService(JSONObject jsonObject) {
        System.out.println(jsonObject);
        JSONObject json = new JSONObject();
        json.put("method","simpleRpcService");
        json.put("status","200");
        json.put("message","success");
        return json;
    }
}
