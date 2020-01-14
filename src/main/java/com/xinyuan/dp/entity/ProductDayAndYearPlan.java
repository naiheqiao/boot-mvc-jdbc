package com.xinyuan.dp.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

/**
 * @author qly
 * @date 2020/1/14
 * @description
 */
@Data
public class ProductDayAndYearPlan {
    private String periodId;
    private String orgzCde;
    private String measureCode;
    private BigDecimal measureValue;
}