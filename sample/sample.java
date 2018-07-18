/**
 * Copyright 1997-2018 Sample Group.
 */
package com.sample.api;

import com.sample.RpcResult;
import com.sample.ConfigDTO;

import java.util.List;
import java.util.Map;

/**
 * Custom config service
 *
 */
public interface CustomConfigRpcService {
    /**
     * 添加配置
     *
     * @param key   配置项名称
     * @param value 配置项内容
     * @param json  是否是json
     * @return 添加是否成功
     */
    RpcResult<Boolean> addConfig(String key, String value, boolean json);

    /**
     * 删除配置
     *
     * @param id id
     * @return 是否删除成功
     */
    RpcResult<Boolean> deleteConfigById(long id);

    /**
     * 获取配置内容
     *
     * @param key 配置型名称
     * @return 配置项内容
     */
    RpcResult<String> getConfigValue(String key);

    /**
     * 获取所有的配置项
     *
     * @return 配置项
     */
    RpcResult<Map<String, String>> getAllConfigs();

    /**
     * 获取所有的配置
     *
     * @return 配置
     */
    RpcResult<List<ConfigDTO>> getAllConfigList();

    /**
     * 获取配置项列表，按添加时间排序
     *
     * @param limit  limit
     * @param offset offset
     * @return 配置项列表
     */
    RpcResult<List<ConfigDTO>> listForBackend(int limit, long offset);

    /**
     * 更新配置内容
     *
     * @param id        id
     * @param newConfig 新的配置内容
     * @param json      是否是json
     * @return 是否更新成功
     */
    RpcResult<Boolean> updateConfig(long id, String newConfig, boolean json);

    /**
     * load所有数据到cache中
     */
    RpcResult<Void> loadAllConfigToCacheInBackend();
}