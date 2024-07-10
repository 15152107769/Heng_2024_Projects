package com.heng.comprehensive.entities.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @FileName PayDto
 * @Description
 * @Author zhaoheng
 * @date 2024-07-10 00:24
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PayDto implements Serializable {
    private Integer id;

    /**
     * 支付流水号
     */
    private String payNo;

    /**
     * 订单流水号
     */
    private String orderNo;

    /**
     * 用户账号ID
     */
    private Integer userId;

    /**
     * 交易金额
     */
    private BigDecimal amount;
}