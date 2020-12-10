package Tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.Configuration;

public class task {
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {	
		try {
		Setup();
		TranslateToEnglish();
		DisplayBidDetails();
	    TearDown();
		}
		catch (Exception e ) 
		{
			e.printStackTrace();
			TearDown();
		}
	}
	
	public static void Setup()
	{
		 System.setProperty(Configuration.chromedriverSetup, Configuration.driverPath);
		 ChromeOptions options = new ChromeOptions();
		 driver =  new ChromeDriver();
		 driver.get(Configuration.Url);
		 driver.manage().window().maximize();
	}
	public static void TranslateToEnglish()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Locators.English));
		driver.findElement(Locators.Locators.English).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Locators.PublicationDate));
	}
	public static void DisplayBidDetails()
	{
		String publicationdate = driver.findElement(Locators.Locators.PublicationDate).getText();
		System.out.println("Publication Date : " + publicationdate);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Locators.Object));
		String object = driver.findElement(Locators.Locators.Object).getText();
		System.out.println("Object : " + object);
		
		String FileNumber = driver.findElement(Locators.Locators.FileNumber).getText();
		String Information = driver.findElement(Locators.Locators.Information).getText();
		System.out.println("Additional Information : " + FileNumber );
		System.out.println(Information);
		
		String modality = driver.findElement(Locators.Locators.Modality).getText();
		System.out.println("Modality : " + modality);
		
		String situation = driver.findElement(Locators.Locators.Situation).getText();
		System.out.println("Situation : " + situation);
		
		String BiddingDate = driver.findElement(Locators.Locators.BiddingDate).getText();
		System.out.println("BiddingDate : " + BiddingDate);
	}
	public static void TearDown()
	 {
	    driver.close();
	 }
	
}
