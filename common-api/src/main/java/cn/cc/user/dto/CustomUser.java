/**
 * @Description
 * @Author everforcc
 * @Date 2022-07-07 21:40
 * Copyright
 */

package cn.cc.user.dto;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;

/**
 * 应用用户
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomUser {

    private String name;
    private String pas;
    private HashSet<String> funcSet;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}