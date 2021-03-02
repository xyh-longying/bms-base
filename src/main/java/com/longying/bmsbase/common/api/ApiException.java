package com.longying.bmsbase.common.api;

import lombok.Builder;
import lombok.Data;

/**
 * Create by chenglong on 2021/2/23
 */
@Data
@Builder
public class ApiException extends RuntimeException{

    private String code;
    private String message;
    private String loginfo;

}
