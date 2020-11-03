package com.jbk.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest {
	public static WebDriver wd;
	  public Properties prop;
	  
	public WebDriver initializedriver() throws IOException {
		
		//System.getProperty("user.dir");
		 prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\resources\\data.properties");
		prop.load(fis);
		//String browserName=System.getProperty("browser");
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\drivers\\chromedriver.exe");
			
		     wd=new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\geckodriver.exe");
			wd=new FirefoxDriver();
		}
		else if(browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Program Files\\IEDriverServer.exe");
			wd=new InternetExplorerDriver();
		}
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return wd;
	}
}

