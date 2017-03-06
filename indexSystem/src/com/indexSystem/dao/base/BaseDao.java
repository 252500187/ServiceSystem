package com.indexSystem.dao.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created by Noce_ on 2017/2/28.
 */
public class BaseDao {

    @Autowired
    private DriverManagerDataSource datasource;

    public JdbcTemplate jdbcTemplate;

    public DriverManagerDataSource getDatasource() {
        return datasource;
    }

    public void setDatasource(DriverManagerDataSource datasource) {
        this.datasource = datasource;
        jdbcTemplate = new IndexSystemJdbcTemplate(datasource);
    }
}
