package com.duanxin.metrics.reporter;

import com.duanxin.metrics.aggregator.Aggregator;
import com.duanxin.metrics.storage.MetricsStorage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author duanxin
 * @version 1.0
 * @className ConsoleReporter
 * @date 2020/12/30 17:05
 */
public class ConsoleReporter {

    private final MetricsStorage metricsStorage;
    private final Aggregator aggregator;
    private final StatViewer statViewer;
    private final ScheduledExecutorService executor;

    public ConsoleReporter(MetricsStorage metricsStorage, Aggregator aggregator, StatViewer statViewer) {
        this.aggregator = aggregator;
        this.metricsStorage = metricsStorage;
        this.statViewer = statViewer;
        executor = Executors.newSingleThreadScheduledExecutor();
    }

    public void startRepeatedReporter(long periodInSeconds, long durationInSeconds) {

    }
}
