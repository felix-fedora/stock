package com.management.stock.db.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;

@Entity
@Table(name = "stack")
public class StockDO implements Serializable {

    private static final long serialVersionUID = -141141241234L;
    @Id
    @SequenceGenerator(name = "stock_seq", sequenceName = "stock_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stock_seq")
    @Column(name = "stock_number")
    private BigInteger stockNumber;
    @Column(name = "stock_name")
    private String stockName;
    @Column(name = "purchasing_praice")
    private Integer purchasingPraise;
    @Column(name = "purchasing_date")
    private Date purchasingDate;
    @Column(name = "quantity")
    private String quantity;
    @Column(name = "created_date", updatable = false)
    private long createdDate;
        @Column(name = "modified_date")
    private long modifiedDate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public BigInteger getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(BigInteger stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Integer getPurchasingPraise() {
        return purchasingPraise;
    }

    public void setPurchasingPraise(Integer purchasingPraice) {
        this.purchasingPraise = purchasingPraice;
    }

    public Date getPurchasingDate() {
        return purchasingDate;
    }

    public void setPurchasingDate(Date purchasingDate) {
        this.purchasingDate = purchasingDate;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }

    public long getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(long modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public StockDO() {
    }

    public StockDO(BigInteger stockNumber, String stockName, Integer purchasingPraise, Date purchasingDate, String quantity, long createdDate, long modifiedDate, BigInteger createdBy, BigInteger modifiedBy) {
        this.stockNumber = stockNumber;
        this.stockName = stockName;
        this.purchasingPraise = purchasingPraise;
        this.purchasingDate = purchasingDate;
        this.quantity = quantity;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;

    }
}
