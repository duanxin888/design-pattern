package com.duanxin.metrics.reporter;

import com.duanxin.metrics.aggregator.RequestStat;

import java.util.Map;

/**
 * @author duanxin
 * @version 1.0
 * @className ConsoleStatViewer
 * @date 2020/12/30 17:04
 */
public class ConsoleStatViewer implements StatViewer{
    @Override
    public void output(Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMillis) {

    }
}
