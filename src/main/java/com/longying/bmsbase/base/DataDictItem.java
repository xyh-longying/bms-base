package com.longying.bmsbase.base;

import lombok.Builder;
import lombok.Data;

/**
 * Create by chenglong on 2021/2/28
 */
@Data
@Builder
public class DataDictItem {
    private String itemName;
    private String itemValue;
    private Boolean chooseable;
}
