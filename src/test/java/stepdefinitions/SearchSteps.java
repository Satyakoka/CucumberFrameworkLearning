package stepdefinitions;

import AmazonImplementation.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
//This below method are taken from the console output when we ran the search feature file,but even we run this we will get an exception so we need to write our own code
Product product;// we created a class variable
	@Given("I have a search page on Amazon")
	
public void i_have_a_search_page_on_amazon()
{
	System.out.println("Step1 : I am on a search page");
	
   }

   @When("I search for a product with name {string} and price {int}")
   public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
   
	System.out.println("Step2: search the product name:"+productName +"price:" + price );
	 product = new Product(productName,price);//the product class is not avil implementation is missing so create a 
	 //product class
}

     @Then("Product with name {string} should be displayed")

public void product_with_name_should_be_displayed(String productName)

{
   
	System.out.println("Step 3 :product"+ productName + "isdisplayed");//these are simple print statements but for the TDD 
	//approach we need to write some logic so create a class variable above
}


}
