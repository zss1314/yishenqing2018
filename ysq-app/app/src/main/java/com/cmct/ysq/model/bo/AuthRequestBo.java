package com.cmct.ysq.model.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * @author shen
 * @date 2018/7/13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("登陆")
public class AuthRequestBo {

    @NotEmpty(message = "用户名不能为空")
    @ApiModelProperty("用户名")
    private String userName;
    @NotEmpty(message = "密码不能为空")
    @ApiModelProperty("密码")
    private String password;
}
