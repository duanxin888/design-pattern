package com.duanxin.metrics.reporter;

import com.duanxin.metrics.aggregator.RequestStat;

import java.util.Map;

/**
 * @author duanxin
 * @version 1.0
 * @className EmailStatViewer
 * @date 2020/12/30 17:04
 */
public class EmailStatViewer implements StatViewer{
    @Override
    public void output(Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMillis) {

    }
}
