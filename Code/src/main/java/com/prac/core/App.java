package com.prac.core;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prac.core.modal.Stock;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
	        //System.out.println( "Hello World!" );
	    	System.out.println("************** BEGINNING PROGRAM **************");
	    	ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
	    	StockService stockService = (StockService) context.getBean("stockService");
	    	
	    	Stock stock = new Stock();
	    	stock.setStockCode("A1");
	    	stock.setStockName("Amar");
	    	
	    	stockService.addStock(stock);
	    	System.out.println("Stock : " + stock + " added successfully");
	    	 
	    	List<Stock> stockList = stockService.getAllStock();
	    	System.out.println("The list of all Stock = " + stockList);
	    	 
	    	System.out.println("************** ENDING PROGRAM *****************");
    	} catch(Exception e) {
    		System.out.println("*********************** ERROR ****************************");
    		e.printStackTrace();
    	}
    }
}
