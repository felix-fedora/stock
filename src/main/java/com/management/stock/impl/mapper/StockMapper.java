package com.management.stock.impl.mapper;

import com.management.stock.db.entities.StockDO;
import com.management.stock.request.StockRequest;

public class StockMapper {
    public static StockDO mapStock(StockRequest stockRequest){
        StockDO stockDO = new StockDO();
        stockDO.setStockName(stockRequest.getStockName());
        stockDO.setQuantity(stockRequest.getQuantity());
        stockDO.setPurchasingDate(stockRequest.getPurchasingDate());
        stockDO.setPurchasingPraise(stockRequest.getPurchasingPraise());
        return stockDO;
    }
    public static void mapStockUpdate(StockRequest stockRequest,StockDO stockDO){
        stockDO.setStockName(stockRequest.getStockName());
        stockDO.setQuantity(stockRequest.getQuantity());
        stockDO.setPurchasingDate(stockRequest.getPurchasingDate());
        stockDO.setPurchasingPraise(stockRequest.getPurchasingPraise());
    }
}
