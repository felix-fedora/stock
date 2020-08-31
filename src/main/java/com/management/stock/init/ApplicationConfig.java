package com.management.stock.init;

import com.management.stock.util.StockConstant;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath(StockConstant.BASE_PATH)
@Component
public class ApplicationConfig extends Application {

}
