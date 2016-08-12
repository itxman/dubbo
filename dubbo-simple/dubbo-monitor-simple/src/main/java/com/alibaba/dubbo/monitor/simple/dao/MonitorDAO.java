package com.alibaba.dubbo.monitor.simple.dao;

import com.alibaba.dubbo.monitor.simple.constant.MonitorDAOSql;
import com.alibaba.dubbo.monitor.simple.entity.CollectMessage;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by nt on 2016-07-01.
 */
public class MonitorDAO {

    private JdbcTemplate jdbcTemplate;

    /**
     * 保存message
     *
     * @param message
     */
    public void saveMessage(CollectMessage message) {
        Object[] param = {message.getAddress(),
                message.getType(),
                message.getElapsed(),
                message.getConcurrent(),
                message.getApplication(),
                message.getService(),
                message.getMethod(),
                message.getSuccess(),
                message.getFailure(),
                message.getInput(),
                message.getOutput(),
                message.getMaxInput(),
                message.getMaxOutput()};
        jdbcTemplate.update(MonitorDAOSql.MONITOR_SAVE_SQL, param);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
