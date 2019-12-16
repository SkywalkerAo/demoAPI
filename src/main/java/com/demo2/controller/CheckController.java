package com.demo2.controller;

import com.demo2.util.AjaxResult;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author SkyWalker
 * @date 2019/7/14.
 */
@Controller
public class CheckController {
    /**
     * 服务验证接口
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/check",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public AjaxResult check(HttpServletRequest request, HttpServletResponse response){
        return AjaxResult.success();
    }
}
