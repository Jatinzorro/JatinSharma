package com.cg.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.entity.Product;


@Repository
public interface ProductDaoI {
	
	public void create(Product p);
	
	public Product findProductById(int id);
	
	public List retrieve();
	
	public boolean updateProduct(Product product); 
	
	public void deleteProduct(int productId);

}
