package com.indexSystem.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

/**
 * Created by Noce_ on 2017/2/28.
 */
@Repository("baseDao")
public class BaseDao {

    @Autowired
    DriverManagerDataSource datasource;

    JdbcTemplate jdbcTemplate;

    public DriverManagerDataSource getDatasource() {
        return datasource;
    }

    public void setDatasource(DriverManagerDataSource datasource) {
        this.datasource = datasource;
        jdbcTemplate = new JdbcTemplate(datasource);
    }
}
