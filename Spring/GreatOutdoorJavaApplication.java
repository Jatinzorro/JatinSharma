package com.cg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cg.dao.ProductDaoI;
import com.cg.entity.Product;


/*This is main class. it is initiating the program. At development time implement the CommandlineRunner and check the working of 
 * spring boot application by adding a new product in method which is overridden frcommandLineRunner
 * Autowiring is already done.*/



@SpringBootApplication
public class GreatOutdoorJavaApplication implements CommandLineRunner{
	
	@Autowired
	ProductDaoI produc;
	
	public static void main(String[] args) {
		SpringApplication.run(GreatOutdoorJavaApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		//produc.updateProduct(new Product(11,"hello",22,89,"rock",3,"nahi"));
		
	}
	
	

}
