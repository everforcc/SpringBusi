/**
 * @Description
 * @Author everforcc
 * @Date 2022-07-08 10:34
 * Copyright
 */

package cn.cc.appuser.open;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/open")
public class OpenController {

    @GetMapping("/sleep")
    public String sleep(){
        log.info("暴露给外部");
        return "暴露给外部";
    }

}
