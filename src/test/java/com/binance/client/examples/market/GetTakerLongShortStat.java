package com.binance.client.examples.market;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;
import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.enums.PeriodType;

/**
 * 未平仓合约统计（市场数据）
 */
public class GetTakerLongShortStat {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);
        System.out.println(syncRequestClient.getOpenInterestStat("BTCUSDT", PeriodType._5m,null,null,10));


    }
}
