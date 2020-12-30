package com.duanxin.metrics.aggregator;

import lombok.Getter;
import lombok.Setter;

/**
 * request aggregator result
 * @author duanxin
 * @version 1.0
 * @className RequestStat
 * @date 2020/12/30 16:41
 */
@Getter
@Setter
public class RequestStat {

    private double maxResponseTime;

    private double minResponseTime;

    private double avgResponseTime;

    private double p999ResponseTime;

    private double p99ResponseTime;

    private int count;

    private long tps;
}
