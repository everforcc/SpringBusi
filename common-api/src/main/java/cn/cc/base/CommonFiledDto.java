/**
 * @Description
 * @Author everforcc
 * @Date 2022-07-08 17:14
 * Copyright
 */

package cn.cc.base;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommonFiledDto {

    private Long id;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

}
