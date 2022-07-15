package com.g1rna.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/*
使用com.alibaba.boot包下的dubbo需要以下三个注解
@Service//可以被扫描到，在项目一启动就自动注册到注册中心
@DubboComponentScan//新版需要添加DubboComponentScan注解否则无法被Dubbo监听到
@Component//使用dubbo后不要使用错误的@Service注解，如果要使用请使用dubbo包下的@Service*/
/*使用org.apache.dubbo包下的dubbo只需要以下两个注解，新版本使用@DubboService*/
@Component//参考上方注释
@DubboService
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "provider提供的票";
    }
}
