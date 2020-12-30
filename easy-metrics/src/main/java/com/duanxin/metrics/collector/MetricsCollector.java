package com.duanxin.metrics.collector;

import com.duanxin.metrics.storage.MetricsStorage;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * @author duanxin
 * @version 1.0
 * @className MetricsCollector
 * @date 2020/12/27 15:10
 */
@AllArgsConstructor
public class MetricsCollector {

    private final MetricsStorage metricsStorage;

    public void recordRequestInfo(RequestInfo requestInfo) {
        if (Objects.isNull(requestInfo) || StringUtils.isBlank(requestInfo.getApiName())) {
            return ;
        }
        metricsStorage.saveRequestInfo(requestInfo);
    }
}
