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
    private int crew_set_id;
    private String score;
    private BigDecimal measure_value;
    private Date time_stamp;
    private Date start_time;
    private Date expiration_time;
}