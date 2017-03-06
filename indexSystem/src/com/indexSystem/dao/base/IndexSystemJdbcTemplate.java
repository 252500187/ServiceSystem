package com.indexSystem.dao.base;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by lijunbo on 2017/3/6.
 */
public class IndexSystemJdbcTemplate extends JdbcTemplate {

    public IndexSystemJdbcTemplate(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public <T> T queryForObject(String sql, RowMapper<T> rowMapper, Object... args) {
        List<T> results = query(sql, args, new RowMapperResultSetExtractor<T>(rowMapper, 1));
        if (results == null || results.size() != 1) {
            return null;
        }
        return results.iterator().next();
    }
}
