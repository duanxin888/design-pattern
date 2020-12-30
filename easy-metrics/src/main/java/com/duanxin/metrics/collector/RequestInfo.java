package com.duanxin.metrics.collector;

import lombok.Getter;
import lombok.Setter;

/**
 * 接口请求信息
 * @author duanxin
 * @version 1.0
 * @className RequestInfo
 * @date 2020/12/27 15:06
 */
@Getter
@Setter
public class RequestInfo {

    private String apiName;

    private double responseTime;

    private long timestamp;
}
