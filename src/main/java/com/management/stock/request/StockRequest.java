package com.management.stock.request;

import java.sql.Date;

public class StockRequest {
    private String stockName;
    private String quantity;
    private Date purchasingDate;
    private Integer purchasingPraise;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Date getPurchasingDate() {
        return purchasingDate;
    }

    public void setPurchasingDate(Date purchasingDate) {
        this.purchasingDate = purchasingDate;
    }

    public Integer getPurchasingPraise() {
        return purchasingPraise;
    }

    public void setPurchasingPraise(Integer purchasingPraise) {
        this.purchasingPraise = purchasingPraise;
    }
}
