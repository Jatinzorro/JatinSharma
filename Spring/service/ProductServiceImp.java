package com.cg.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ProductDaoI;
import com.cg.dao.ProductDaoImp;
import com.cg.entity.Product;
import com.cg.exception.ProductDuplicacyException;

/*This is the service Class it is implementing ProductServiceI interface.
 * Controller is asking for the Services from it, and it is providing it from ProductDao class
 * it has the methods:
 * 1.Create the product
 * 2.Delete the product
 * 3.Update the existing product
 * 4.View All Products*/
@Service
public class ProductServiceImp implements ProductServiceI {
	
	@PersistenceContext
	EntityManager em;
	
	@Autowired
	ProductDaoI productdao;

	@Override
	public void create(Product p) {
		int modelNum=p.getProductSize();
		
		productdao.create(p);
	}

	@Override
	public Product findProductById(int id) {
		return productdao.findProductById(id);
	}

	@Override
	public List retrieve() {
		return productdao.retrieve();
	}

	@Override
	public boolean updateProduct(Product p) {
		return productdao.updateProduct(p);	
	}

	@Override
	public void deleteProduct(int productId) {
		productdao.deleteProduct(productId);
		
	}

}
