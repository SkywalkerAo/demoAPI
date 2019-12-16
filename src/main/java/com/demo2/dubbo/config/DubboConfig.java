package com.demo2.dubbo.config;

import java.io.*;
import java.util.Properties;

/**
 * @author SkyWalker
 * @date 2019/10/6.
 */
public class DubboConfig extends Properties {
    public DubboConfig(){

        try {
            String path = "classpath:/dubboConfig.properties";
            File file = new File(path);
            InputStream inputStream = new FileInputStream(file);
            load(new InputStreamReader(inputStream,"utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        this.setProperty("dubbo.registry.address", String.valueOf(ApolloConfigManager.getDubbo("dubbo.registry.address")));
//        this.setProperty("dubbo.protocol.port", String.valueOf(ApolloConfigManager.getDubbo("dubbo.protocol.port")));
//        this.setProperty("dubbo.application.owner", String.valueOf(ApolloConfigManager.getDubbo("dubbo.application.owner")));
//        this.setProperty("dubbo.cache.path", String.valueOf(ApolloConfigManager.getDubbo("dubbo.cache.path")));
//        this.setProperty("dubbo.provider.group", String.valueOf(ApolloConfigManager.getDubbo("dubbo.provider.group")));
//        this.setProperty("dubbo.provider.version", String.valueOf(ApolloConfigManager.getDubbo("dubbo.provider.version")));
//
//        this.setProperty("dubbo.content.group", String.valueOf(ApolloConfigManager.getDubbo("dubbo.content.group")));
//        this.setProperty("dubbo.content.version", String.valueOf(ApolloConfigManager.getDubbo("dubbo.content.version")));
    }


}
