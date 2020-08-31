package com.management.stock.db.repository;

import com.management.stock.db.entities.StockDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface StockRepository extends JpaRepository<StockDO, BigInteger> {


}
