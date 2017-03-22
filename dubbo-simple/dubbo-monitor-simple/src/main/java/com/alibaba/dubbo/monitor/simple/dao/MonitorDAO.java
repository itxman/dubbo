package com.alibaba.dubbo.monitor.simple.dao;

import com.alibaba.dubbo.monitor.simple.constant.MonitorDAOSql;
import com.alibaba.dubbo.monitor.simple.entity.CollectMessage;
import com.xkeshi.core.utils.StringUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by nt on 2016-07-01.
 */
public class MonitorDAO {

    private JdbcTemplate jdbcTemplate;

    private String messageSaveTable;

    private String saveSql;

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
        jdbcTemplate.update(getSaveSql(), param);
    }

    /**
     * 获取操作sql
     *
     * @return
     */
    private String getSaveSql() {
        if (StringUtils.isNotEmpty(saveSql)) {
            return saveSql;
        }
        saveSql = String.format(MonitorDAOSql.MONITOR_SAVE_SQL, messageSaveTable);
        return saveSql;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String getMessageSaveTable() {
        return messageSaveTable;
    }

    public void setMessageSaveTable(String messageSaveTable) {
        this.messageSaveTable = messageSaveTable;
    }
}
