package com.binance.client.examples.market;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;
import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.enums.PeriodType;

/**
 * 顶级交易者多头/空头比率（账户）（市场数据
 */
public class GetTopTraderAccountRatio {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);
        System.out.println(syncRequestClient.getTopTraderAccountRatio("BTCUSDT", PeriodType._5m,null,null,10));


    }
}
