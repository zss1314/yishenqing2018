package com.cmct.ysq.model.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author shen
 * @email 1292@qq.com
 * @date 2018-07-25 08:05:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("周边收敛")
public class TunnelSurrConForUpdateBo implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("周边收敛id")
    private String surrConId;
    @ApiModelProperty("测线")
    private String testLineCode;
    @ApiModelProperty("记录id")
    private String recordId;
    @ApiModelProperty("基点位置")
    private String basePointLoc;
    @ApiModelProperty("读数(mm)")
    private BigDecimal value;
    @ApiModelProperty("第一次差值")
    private BigDecimal firstValue;
    @ApiModelProperty("破坏,0没有破坏，1破坏")
    private Integer destroy;
    @ApiModelProperty("修复,0修复，1没有修复")
    private Integer repaire;

}
