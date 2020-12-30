package com.duanxin.metrics.aggregator;

import com.duanxin.metrics.collector.RequestInfo;
import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author duanxin
 * @version 1.0
 * @className Aggregator
 * @date 2020/12/27 15:28
 */
@AllArgsConstructor
public class Aggregator {

    public Map<String, RequestStat> aggregate(Map<String, List<RequestInfo>> requestInfos, long durationInMillis) {
        Map<String, RequestStat> requestStats = new HashMap<>();
        requestInfos.forEach((apiName, requestInfosPerApi) -> {
            RequestStat requestStat = doAggregate(requestInfosPerApi, durationInMillis);
            requestStats.put(apiName, requestStat);
        });
        return requestStats;
    }

    private RequestStat doAggregate(List<RequestInfo> requestInfosPerApi, long durationInMillis) {
        List<Double> respTimes = requestInfosPerApi.stream().
                map(RequestInfo::getResponseTime).collect(Collectors.toList());

        RequestStat requestStat = new RequestStat();
        requestStat.setMaxResponseTime(max(respTimes));
        requestStat.setMinResponseTime(min(respTimes));
        requestStat.setAvgResponseTime(avg(respTimes));
        requestStat.setP99ResponseTime(percentile999(respTimes));
        requestStat.setP99ResponseTime(percentile99(respTimes));
        requestStat.setCount(respTimes.size());
        requestStat.setTps((long) tps(respTimes.size(), (double) durationInMillis / 1000));
        return requestStat;
    }

    private int tps(int count, double duration) {
        return 0;
    }

    private double max(List<Double> respTimes) {
        return 0.0d;
    }

    private double min(List<Double> respTimes) {
        return 0.0d;
    }

    private double avg(List<Double> respTimes) {
        return 0.0d;
    }

    private double percentile999(List<Double> respTimes) {
        return 0.0d;
    }

    private double percentile99(List<Double> respTimes) {
        return 0.0d;
    }
}
