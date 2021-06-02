package pages;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrappers.ProjectWrappers;

public class DetailsPage  extends ProjectWrappers {

	public DetailsPage(AndroidDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	
	}

	
public DetailsPage clickDetailsExpandButton(){
		
		clickByXpathExplict(prop.getProperty("click.detail.expand.button.xpath"));
	
		return this;
	}

public DetailsPage singleScroll() throws InterruptedException{
	//scrolldown();
	//scrolldown();
	//Thread.sleep(3000);
	bottomverticalSwipeByPercentages();
	//Thread.sleep(1000);
	reportStep("Scrolled successfully", "PASS");		  
	return this;
}

public DetailsPage clickMoreDetails(){
		
		clickByXpathExplict(prop.getProperty("click.show.details.xpath"));
		return this;
	}
	
public DetailsPage clickAccback() throws InterruptedException{

	clickByXpathExplict(prop.getProperty("click.Managebene.Back.button.xpath"));


return this;	
	
}	
	
	
	
}
