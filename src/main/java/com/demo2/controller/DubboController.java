package com.demo2.controller;

import com.alibaba.fastjson.JSONObject;
import com.demo2.util.AjaxResult;
import demo.dubbo.service.DemoService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author SkyWalker
 * @date 2019/10/15.
 */
@Controller
public class DubboController implements ApplicationContextAware{
    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Autowired
    private DemoService demoService;

    @ResponseBody
    @RequestMapping(value = "/simpleDubbo",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public AjaxResult simpleDubbo(HttpServletRequest request, HttpServletResponse response){
        String result = demoService.simpleService("dubbo.api");
        return AjaxResult.success(result);
    }

    @ResponseBody
    @RequestMapping(value = "/simpleRpcDubbo",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public AjaxResult simpleRpcDubbo(HttpServletRequest request, HttpServletResponse response){
        JSONObject result = demoService.simpleRpcService(new JSONObject());
        return AjaxResult.success(result);
    }
}
