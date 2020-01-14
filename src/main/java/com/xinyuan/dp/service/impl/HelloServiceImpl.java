package com.xinyuan.dp.service.impl;

import com.xinyuan.dp.entity.Cron;
import com.xinyuan.dp.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author qly
 * @date 2020/1/14
 * @description
 */
@Service
public class HelloServiceImpl implements IHelloService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Map<String, Object>> queryForList(){
        String query = "select * FROM eco_schedule_job";
        RowMapper<Cron> rowMapper = new BeanPropertyRowMapper<>(Cron.class);
        List<Cron> result = jdbcTemplate.query(query, rowMapper);
        return jdbcTemplate.queryForList("select * FROM eco_schedule_job");
    }
}