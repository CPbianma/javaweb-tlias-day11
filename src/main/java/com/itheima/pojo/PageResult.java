package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页结果封装类
 */
@Data
@NoArgsConstructor
// @AllArgsConstructor // Removed due to conflict with manual constructor
public class PageResult<T> {
    private Long total;
    private List<T> rows;

    // Manually added constructor, getters and setters due to Lombok issues
    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }
    // No-args constructor might also be needed if @NoArgsConstructor isn't working
    // public PageResult() {} // Add if new PageResult<>() fails

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
