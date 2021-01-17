package com.github.chenmingq.rpc.demo.provider;


import com.github.chenmingq.rpc.provider.context.ApplicationContext;

/**
 * @author : cmq
 * date : 2021/1
 * description : 提供者启动
 */

public class Provider {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext();
        applicationContext.start(Provider.class);
    }
}
