/**
 * @Description
 * @Author everforcc
 * @Date 2022-07-07 22:14
 * Copyright
 */

package cn.cc.appadmin.controller.system;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class SystemController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/port")
    public String port(){
        return port;
    }

}
