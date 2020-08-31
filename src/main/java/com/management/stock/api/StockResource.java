package com.management.stock.api;

import com.management.stock.request.StockRequest;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static com.management.stock.util.StockConstant.*;


@Path(STOCK)
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public abstract class StockResource {


    @GET
    @Path(ID)
    public abstract Response getStock(@PathParam(QUERY_PARAM_ID) String id);

    @POST
    @Path(CREATE)
    public abstract Response createStock(@Valid StockRequest stockRequest);

    @PUT
    @Path(ID)
    public abstract Response updateStock(@Valid StockRequest stockRequest, @PathParam(QUERY_PARAM_ID) String id);

}
