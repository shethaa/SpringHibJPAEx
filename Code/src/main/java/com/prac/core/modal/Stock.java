/**
 * 
 */
package com.prac.core.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author asheth
 *
 */
@Entity
@Table(name = "Stock")
public class Stock {

	@Id
	@GeneratedValue
	@Column(name = "Stock_Id")
	private Integer stockId;
	
	@Column(name = "Stock_Code")
	private String stockCode;
	
	@Column(name = "Stock_Name")
	private String stockName;
	
	public Integer getStockId() {
		return stockId;
	}
	
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	
	public String getStockCode() {
		return stockCode;
	}
	
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	
	public String getStockName() {
		return stockName;
	}
	
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
	@Override
	public String toString() {
		return "Stock [StockId =" + stockId + ", stockCode =" + stockCode + ", stockName =" + stockName + "]";
	}
}
