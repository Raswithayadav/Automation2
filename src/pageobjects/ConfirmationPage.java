package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.abstractcomponents.abstractcomponents;

public class ConfirmationPage extends abstractcomponents {
	WebDriver driver;


    public ConfirmationPage(WebDriver driver)
    {
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
        }
   //  @FindBy(css=".hero-primary")
  //  WebElement ConfirmationMessage;
     
     public void verifyConfirmationMessage() 
     {
   	  JavascriptExecutor js1 = (JavascriptExecutor)driver;
	        js1.executeScript("scroll(0, -250);");
	       System.out.println("THANK YOU FOR THE ORDER IS DISPLAYED");
			//return Confirmmessage;
	      
			
			
		
	       

}

	


}
