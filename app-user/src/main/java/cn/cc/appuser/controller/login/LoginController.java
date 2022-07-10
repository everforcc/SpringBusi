/**
 * @Description
 * @Author everforcc
 * @Date 2022-07-08 10:32
 * Copyright
 */

package cn.cc.appuser.controller.login;

import cn.cc.busiservice.config.token.IUserToken;
import cn.cc.busiservice.config.token.UserTokenJSON;
import cn.cc.user.dto.CustomUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/login")
public class LoginController {
    IUserToken iUserToken = new UserTokenJSON();
    @PostMapping
    public String login(@RequestBody CustomUser customUser){
        log.info("登录用户 {}", customUser.toString());
        return iUserToken.userToString(customUser);
    }

}
