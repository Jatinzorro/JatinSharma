package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import com.cg.entity.Product;

/* this class is implementing ProductDaoI Interface
 * This is the Data access Object class. It is fetching data from database and providing the results to Services.
 * persisting,finding,updating,deleting the product from database.
 * It has following functionalities
 * 1.Add new Product to database
 * 2.Update the Existing product in database
 * 3.Delete the Existing Product from database
 * 4.View all the Products residing in database*/


@Transactional
@Repository
public class ProductDaoImp implements ProductDaoI {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(Product p) {
		em.persist(p);
	}

	@Override
	public Product findProductById(int id) {
		return em.find(Product.class, id);
	}

	@Override
	public List retrieve() {
		
		Query q=em.createQuery("from Product p");
		return q.getResultList();
	}

	@Override
	public boolean updateProduct(Product product) {
		//Product newProduct = em.find(Product.class, product.getProductId());
		
		
			em.merge(product);
			return true;
			
		
		
	}

	@Override
	public void deleteProduct(int productId) {
		Product product = em.find(Product.class, productId);
		em.remove(product);
		
	}

}
