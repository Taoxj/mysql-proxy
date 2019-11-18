package com.xjt.proxy.dynamicdatasource;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author luoping
 */
@Getter
@AllArgsConstructor
public enum DynamicDataSourceEnum {
    /**
     * 主库
     */
    MASTER("master"),
    /**
     * 从库
     */
    SLAVE("slave");

    private final String dataSourceName;
}
