package com.cg.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;

/*This is the bean class, it is containing all the properties of Product.
 * Table Annotations are Done And working fine.
 * ProductId is the Primary key.*/




@Entity
@Table(name="Product10")
@DynamicUpdate(true)
@DynamicInsert(true)
@SequenceGenerator(name="ProductIdGenerator", initialValue=100)
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ProductIdGenerator")
	int productId;
	
	@Column
	String productName;
	
	@Column
	int productQuantity;
	
	@Column
	int productMRP;
	
	@Column
	String productManufacturer;
	
	@Column
	int productSize;
	
	
	public Product() {
		
	}
	public Product(String name, int quantity, int mRP, String manufacturer, int product_size) {
		super();
		
		productName = name;
		productQuantity = quantity;
		productMRP = mRP;
		productManufacturer = manufacturer;
		productSize = product_size;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int product_ID) {
		productId = product_ID;
	}

	public String getName() {
		return productName;
	}

	public void setName(String name) {
		productName = name;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int quantity) {
		productQuantity = quantity;
	}

	public int getProductMRP() {
		return productMRP;
	}

	public void setProductMRP(int mRP) {
		productMRP = mRP;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String manufacturer) {
		productManufacturer = manufacturer;
	}

	public int getProductSize() {
		return productSize;
	}

	public void setProductSize(int product_size) {
		productSize = product_size;
	}

	
	
	
		
	
}
