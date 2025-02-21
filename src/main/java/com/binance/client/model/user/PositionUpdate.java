package com.binance.client.model.user;

import com.binance.client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;
import java.math.BigDecimal;

/**
 * 持仓更新
 */
public class PositionUpdate {
    /**
     * 交易对
     */
    private String symbol;

    /**
     * 数量
     */
    private BigDecimal amount;

    /**
     *  开仓均价
     */
    private BigDecimal entryPrice;
    /**
     * 预审费?
     */
    private BigDecimal preFee;
    /**
     * 未实现Pnl
     */
    private BigDecimal unrealizedPnl;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(BigDecimal entryPrice) {
        this.entryPrice = entryPrice;
    }

    public BigDecimal getPreFee() {
        return preFee;
    }

    public void setPreFee(BigDecimal preFee) {
        this.preFee = preFee;
    }

    public BigDecimal getUnrealizedPnl() {
        return unrealizedPnl;
    }

    public void setUnrealizedPnl(BigDecimal unrealizedPnl) {
        this.unrealizedPnl = unrealizedPnl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("symbol", symbol)
                .append("amount", amount).append("entryPrice", entryPrice).append("preFee", preFee)
                .append("unrealizedPnl", unrealizedPnl).toString();
    }
}
