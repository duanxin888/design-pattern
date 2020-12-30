package com.duanxin.metrics.reporter;

import com.duanxin.metrics.aggregator.Aggregator;
import com.duanxin.metrics.storage.MetricsStorage;

/**
 * @author duanxin
 * @version 1.0
 * @className EmailReporter
 * @date 2020/12/30 17:09
 */
public class EmailReporter {

    private final MetricsStorage metricsStorage;
    private final Aggregator aggregator;
    private final StatViewer statViewer;

    public EmailReporter(MetricsStorage metricsStorage, Aggregator aggregator, StatViewer statViewer) {
        this.aggregator = aggregator;
        this.metricsStorage = metricsStorage;
        this.statViewer = statViewer;
    }

    public void startDailyReporter() {

    }
}
