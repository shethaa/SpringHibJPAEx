/**
 * 
 */
package com.prac.core.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.prac.core.modal.Stock;

/**
 * @author asheth
 *
 */
@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class StockDao {

		@PersistenceContext
		private EntityManager entityManager;
		
		public EntityManager getEntityManager() {
			return entityManager;
		}
		
		public void setEntityManager(EntityManager entityManager) {
			this.entityManager = entityManager;
		}
		
		public void insert(Stock stock) {
			entityManager.persist(stock);
		}
		
		public List<Stock> getAllList() {
			Query query = entityManager.createQuery("SELECT S FROM Stock S");
			List<Stock> sto = (List<Stock>)query.getResultList();
			return sto;
		}
		
		/*public Stock findByStockCode(String stockCode){
			Query query = entityManager.createQuery("Select S from Stock S where S.stockCode = " + stockCode);
			List<Stock> sto = (List<Stock>)query.getResultList();
			return (Stock)sto.get(0);
		}*/
}
