package cn.cc.appadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 多模块的情况下不写路径,别的模块扫描不到
@SpringBootApplication(scanBasePackages = {"cn.cc"})
public class AppAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppAdminApplication.class, args);
    }

}
