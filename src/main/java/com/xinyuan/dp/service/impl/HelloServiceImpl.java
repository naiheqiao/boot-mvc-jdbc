package com.xinyuan.dp.service.impl;

import com.xinyuan.dp.entity.ProductDayAndYearPlan;
import com.xinyuan.dp.entity.Score;
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
        String query = "select * from t05_product_day_table";
        RowMapper<ProductDayAndYearPlan> rowMapper = new BeanPropertyRowMapper<>(ProductDayAndYearPlan.class);
        List<ProductDayAndYearPlan> result = jdbcTemplate.query(query, rowMapper);
        String query1 = "select * from t05_product_year_plan";
        RowMapper<ProductDayAndYearPlan> rowMapper1 = new BeanPropertyRowMapper<>(ProductDayAndYearPlan.class);
        List<ProductDayAndYearPlan> result1 = jdbcTemplate.query(query1, rowMapper1);
        String query2 = "select * from t05_score";
        RowMapper<Score> rowMapper2 = new BeanPropertyRowMapper<>(Score.class);
        List<Score> result2 = jdbcTemplate.query(query2, rowMapper2);
        return jdbcTemplate.queryForList("select * FROM eco_schedule_job");
    }
}