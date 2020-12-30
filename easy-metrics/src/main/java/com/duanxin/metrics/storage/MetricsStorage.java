package com.duanxin.metrics.storage;

import com.duanxin.metrics.collector.RequestInfo;

import java.util.List;
import java.util.Map;

/**
 * @author duanxin
 * @version 1.0
 * @className MetricsStorage
 * @date 2020/12/27 15:11
 */
public interface MetricsStorage {

    void saveRequestInfo(RequestInfo requestInfo);

    List<RequestInfo> getRequestInfosByDuration(String apiName, long startTimestamp, long endTimestamp);

    Map<String, List<RequestInfo>> getAllRequestInfosByDuration(long startTimestamp, long endTimestamp);
}
