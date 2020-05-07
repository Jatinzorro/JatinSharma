package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Product;
import com.cg.service.ProductServiceI;

/* This is the Controller class. It is asking the data from Services.
 * ---Mapping is Already Done with the angular. Angular is asking for required features from this class.And it is 
 * asking for the same from the Services.
 * it is containing following functionalities
 * 1.Add new Product
 * 2.Update the Existing product
 * 3.Delete the Existing Product
 * 4.View all the Products residing in database */


@CrossOrigin("*")
@RestController
public class ProductController {
	
	@Autowired
	ProductServiceI productService;
	
	
	@PostMapping(value="/product/new",consumes= {"application/json"})
	public String addProduct(@RequestBody Product product)
	{
		productService.create(product);
		return "Product Added Seccessfully";
	}
	
	
	@PutMapping(value ="product/update", consumes= {"application/json"})
	public boolean updateProduct(@RequestBody Product product)
	{
		
		return productService.updateProduct(product);
	}
	
	
	@DeleteMapping(value = "product/delete/{productId}")
	public String deleteProduct(@PathVariable int productId)
	{
		productService.deleteProduct(productId);
		return "Product deleted Successfully";
	}
	
	
	@GetMapping(value="/product/{id}")
	public Product findProduct(@PathVariable int id) {
		return productService.findProductById(id);
	}
	
	
	@GetMapping(value="/product")
	public List<Product> viewProducts(){
		return productService.retrieve();
	}
	
	
	
	
}
