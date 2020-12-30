package com.duanxin.metrics.reporter;

import com.duanxin.metrics.aggregator.RequestStat;

import java.util.Map;

/**
 * display statistics to the terminal
 * @author duanxin
 * @version 1.0
 * @className StatViewer
 * @date 2020/12/30 16:59
 */
public interface StatViewer {

    void output(Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMillis);
}
