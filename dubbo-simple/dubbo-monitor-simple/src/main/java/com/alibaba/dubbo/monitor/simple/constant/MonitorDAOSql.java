package com.alibaba.dubbo.monitor.simple.constant;

/**
 * Created by nt on 2016-07-01.
 */
public class MonitorDAOSql {

    public static final String MONITOR_SAVE_SQL = "INSERT INTO %s (address,type,elapsed,concurrent,application,service,method,success,failure,input,output,max_input,max_output) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

}
