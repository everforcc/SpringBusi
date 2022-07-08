/**
 * @Description
 * @Author everforcc
 * @Date 2022-07-08 10:33
 * Copyright
 */

package cn.cc.appuser.busi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/somebusi")
public class BusiController {

    @GetMapping("/sleep")
    public String sleep(){
        log.info("睡觉");
        return "睡觉";
    }

}
