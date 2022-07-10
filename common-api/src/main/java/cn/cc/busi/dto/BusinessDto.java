/**
 * @Description
 * @Author everforcc
 * @Date 2022-07-08 16:51
 * Copyright
 */

package cn.cc.busi.dto;

import cn.cc.base.CommonFiledDto;
import cn.cc.busi.enums.BillStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 业务中用到的对象,这边列下常用的字段
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BusinessDto extends CommonFiledDto {

    private BillStatus status;

}
