package com.vt.generic_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


    public class generic_methods {
	public WebDriver driver;

	public void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
 
		}

	}
	public void openUrl(String openUrl ) {
		driver.get(openUrl);
		
	}
	public static void mySendkeys( WebElement we, String inputvalu, String elementName) {
		we.sendKeys(inputvalu);
		System.out.println(elementName+"fill the data"+inputvalu);
	}

	public static void  myClick( WebElement we, String element) {
		we.click();
		
	}


}
