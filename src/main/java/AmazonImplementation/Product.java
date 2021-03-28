package AmazonImplementation;

import java.util.List;
import java.util.ArrayList;



public class Product {
	
	
	private String productName;//made it private bcoz we can use encapsulation
	 private int price;
	public Product(String productName, int price) {//we got this my going to source==gene construct with fields
			//super();
			this.productName = productName;
			this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getPrice() {//we created getter&setter methods 
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public List<String> getProductList(){
		List<String>productList = new ArrayList<>();
		return productList;
	}
	
		
		System.out.println("I am adding this statement to check the pull request ");
		
		
	}
		

