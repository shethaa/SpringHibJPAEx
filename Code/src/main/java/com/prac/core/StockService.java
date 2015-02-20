/**
 * 
 */
package com.prac.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prac.core.dao.StockDao;
import com.prac.core.modal.Stock;

/**
 * @author asheth
 *
 */
@Component
public class StockService {
	
	@Autowired
	private StockDao stockDao;
	
	public void addStock(Stock stock) {
		stockDao.insert(stock);
	}
	
	public List<Stock> getAllStock() {
		return stockDao.getAllList();
	}
	
	/*public Stock getByStockCode(String stockCode) {
		return stockDao.findByStockCode(stockCode);
	}*/
}
