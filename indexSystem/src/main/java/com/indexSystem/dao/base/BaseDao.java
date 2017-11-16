package com.indexSystem.dao.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;

/**
 * Created by Noce_ on 2017/2/28.
 */
@Repository("baseDao")
public class BaseDao {

    @Autowired
    private DriverManagerDataSource datasource;

    public JdbcTemplate jdbcTemplate;

    public SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public DriverManagerDataSource getDatasource() {
        return datasource;
    }

    public void setDatasource(DriverManagerDataSource datasource) {
        this.datasource = datasource;
        jdbcTemplate = new IndexSystemJdbcTemplate(datasource);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }
}
