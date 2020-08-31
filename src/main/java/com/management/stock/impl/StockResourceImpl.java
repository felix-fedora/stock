package com.management.stock.impl;

import com.management.stock.api.StockResource;
import com.management.stock.db.entities.StockDO;
import com.management.stock.db.service.StockService;
import com.management.stock.request.StockRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;

@Component
@Scope("request")
public class StockResourceImpl extends StockResource {
    @Autowired
    StockService stockService;

    @Override
    public Response getStock(String id) {

        StockDO stockDO = stockService.getStock(id);
        return Response.accepted(stockDO).status(Response.Status.ACCEPTED).build();
    }

    @Override
    public Response createStock(StockRequest stockRequest) {
        StockDO stockDO = stockService.createStock(stockRequest);
        return Response.accepted(stockDO).status(Response.Status.CREATED).build();
    }

    @Override
    public Response updateStock(StockRequest stockRequest, String id) {
        stockService.updateStock(stockRequest, id);
        return Response.accepted().status(Response.Status.NO_CONTENT).build();
    }
}
