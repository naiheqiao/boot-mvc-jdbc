package com.xinyuan.dp.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author qly
 * @date 2020/1/14
 * @description
 */
@Data
public class Score {
    private int crewSetId;
    private String score;
    private BigDecimal partsCode;
    private Date timeStamp;
    private Date startTime;
    private Date expirationTime;
}