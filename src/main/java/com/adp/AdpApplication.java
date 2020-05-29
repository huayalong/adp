package com.adp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author adp
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class AdpApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(AdpApplication.class, args);
        System.out.println("系统启动成功!!");
    }
}