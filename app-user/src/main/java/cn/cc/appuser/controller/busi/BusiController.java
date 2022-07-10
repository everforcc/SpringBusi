/**
 * @Description
 * @Author everforcc
 * @Date 2022-07-08 10:33
 * Copyright
 */

package cn.cc.appuser.controller.busi;

import cn.cc.busi.dto.BusinessDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/somebusi")
public class BusiController {

    @GetMapping("/sleep")
    public String sleep(){
        log.info("睡觉");
        return "睡觉";
    }

    @PostMapping("/postdto")
    public String dto(@RequestBody BusinessDto businessDto){
        log.info("业务数据打印 {}", businessDto.toString());
        return "完毕";
    }

}
