package com.longying.bmsbase.common.api;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.util.List;

/**
 * Create by chenglong on 2021/2/23
 */
@Data
public class CommonPage<T> {

    private Long pageNum;
    private Long pageSize;
    private Long totalPages;
    private Long total;
    private List<T> list;

    public static <T> CommonPage<T> restPage(Page<T> pageList){
        CommonPage<T> result = new CommonPage<>();
        result.setList(pageList.getRecords());
        result.setPageNum(pageList.getCurrent());
        result.setPageSize(pageList.getSize());
        result.setTotalPages(pageList.getPages());
        result.setTotal(pageList.getTotal());
        return result;
    }
}
