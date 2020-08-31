package com.management.stock.db.service;

import com.management.stock.db.entities.StockDO;
import com.management.stock.db.repository.StockRepository;
import com.management.stock.impl.mapper.StockMapper;
import com.management.stock.request.StockRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public StockDO getStock(final String id) {
        Optional<StockDO> stockDO = stockRepository.findById(new BigInteger(id));
        return stockDO.orElseThrow(EntityNotFoundException::new);
    }

    public List<StockDO> getStockDetails() {
        List<StockDO> stockDO = stockRepository.findAll();
        return stockDO;
    }

    public StockDO createStock(StockRequest stockRequest) {
        StockDO stockDO1 = stockRepository.save(StockMapper.mapStock(stockRequest));
        return stockDO1;
    }

    public void updateStock(StockRequest stockRequest, String id) {
        StockDO stockDO = getStock(id);
        StockMapper.mapStockUpdate(stockRequest, stockDO);
        stockRepository.save(stockDO);
    }
}
