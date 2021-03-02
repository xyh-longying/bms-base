package com.longying.bmsbase.common.api;

import lombok.Data;

/**
 * Create by chenglong on 2021/2/23
 */
@Data
public class ApiLog {

    /**
     * 操作描述
     */
    private String description;

    /**
     * 操作用户
     */
    private String username;

    /**
     * 操作时间
     */
    private String startTime;

    /**
     * 消耗时间
     */
    private String spendTime;

    /**
     * 根路径
     */
    private String basePath;

    /**
     * URI
     */
    private String uri;

    /**
     * URL
     */
    private String url;

    /**
     * 请求方法
     */
    private String method;

    /**
     * 请求IP
     */
    private String ip;

    /**
     * 请求参数
     */
    private Object parameter;

    /**
     * 返回结果
     */
    private Object result;
}
