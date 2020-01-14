package com.xinyuan.dp.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author qly
 * @date 2020/1/14
 * @description
 */
@Data
public class Cron {
    private int jobId;
    private String className;
    private String cron;
    private String status;
}