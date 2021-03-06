package com.cmct.ysq.model.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 初期支护与二次衬砌接触压力
 *
 * @author shen
 * @email 1292@qq.com
 * @date 2018-07-26 16:22:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "t_tunnel_ini_support_two_pressure")
public class TunnelIniSupportTwoPressurePo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    private String iniSupportTwoPressureId;
    /**
     * 位置
     */
    @Column
    private String locName;
    /**
     * 位置编码
     */
    @Column
    private String locCode;
    /**
     * 仪器编号
     */
    @Column
    private String equipNo;
    /**
     * 标定系数
     */
    @Column
    private BigDecimal ratio;
    /**
     * 量测值
     */
    @Column
    private BigDecimal measurementValue;
    /**
     * 换算值
     */
    @Column
    private BigDecimal conversionValue;
    /**
     * 破坏,0没有破坏，1破坏
     */
    @Column
    private Integer destroy;
    /**
     * 修复,0修复，1没有修复
     */
    @Column
    private Integer repaire;
    /**
     * 删除状态,默认是0，0是未删除，1是已删除
     */
    @Column
    private Integer deleteStatus;
    /**
     * 创建人
     */
    @Column
    private String createBy;
    /**
     * 修改人
     */
    @Column
    private String modifyBy;
    /**
     * 创建时间
     */
    @Column
    private Date createDate;
    /**
     * 修改时间
     */
    @Column
    private Date modifyDate;
    /**
     * 记录id
     */
    @Column
    private String recordId;

}
