package com.longying.bmsbase.base;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * Create by chenglong on 2021/2/23
 */
@Data
@Builder
public class BaseModel<T> {

    private String uuid;

    private String createdBy;

    private Date createTime;

    private String updatedBy;

    private Date updateTime;

    private String isDelete;

    public static <T> T createModel(T t){
        return createModel(t, null);
    }

    public static <T> T createModel(T t, String operator){
        JSONObject jsonObject = JSONUtil.parseObj(t);
        jsonObject.put("uuid", IdUtil.simpleUUID())
                .put("createBy", StrUtil.isNotBlank(operator)?operator:"system")
                .put("createTime", DateUtil.now())
                .put("updateBy", StrUtil.isNotBlank(operator)?operator:"system")
                .put("updateTime", DateUtil.now())
                .put("isDelete",BaseConstants.DEL_NO);
        t = (T) JSONUtil.toBean(jsonObject, t.getClass());
        return t;
    }

    public static <T> T updateModel(T t){
        return updateModel(t, null);
    }

    public static <T> T updateModel(T t, String operator){
        JSONObject jsonObject = JSONUtil.parseObj(t);
        jsonObject
                .put("updateBy", StrUtil.isNotBlank(operator)?operator:"system")
                .put("updateTime", DateUtil.now());
        t = (T) JSONUtil.toBean(jsonObject, t.getClass());
        return t;
    }
}
