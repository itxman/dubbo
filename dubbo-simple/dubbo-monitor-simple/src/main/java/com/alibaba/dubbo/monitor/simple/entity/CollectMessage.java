package com.alibaba.dubbo.monitor.simple.entity;

/**
 * 信息搜集实体类
 *
 * Created by nt on 2016-07-01.
 */
public class CollectMessage {

    /**
     * 服务类型（provider,consumer）
     */
    private String type;

    /**
     * 服务提供信息
     */
    private String address;

    /**
     * 调用耗时
     */
    private Long elapsed;

    /**
     * 当前并发数
     */
    private Integer concurrent;

    /**
     * 应用名称
     */
    private String application;

    /**
     * service名称
     */
    private String service;

    /**
     * 方法名称
     */
    private String method;

    /**
     * 入参大小
     */
    private String input;

    /**
     * 出参大小
     */
    private String output;


    /**
     * 最大输入
     */
    private String maxInput;

    /**
     * 最大输出
     */
    private String maxOutput;

    /**
     * 调用成功次数
     */
    private Integer success;

    /**
     * 调用失败次数
     */
    private Integer failure;

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public Integer getFailure() {
        return failure;
    }

    public void setFailure(Integer failure) {
        this.failure = failure;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public Long getElapsed() {
        return elapsed;
    }

    public void setElapsed(Long elapsed) {
        this.elapsed = elapsed;
    }

    public Integer getConcurrent() {
        return concurrent;
    }

    public void setConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMaxInput() {
        return maxInput;
    }

    public void setMaxInput(String maxInput) {
        this.maxInput = maxInput;
    }

    public String getMaxOutput() {
        return maxOutput;
    }

    public void setMaxOutput(String maxOutput) {
        this.maxOutput = maxOutput;
    }
}
