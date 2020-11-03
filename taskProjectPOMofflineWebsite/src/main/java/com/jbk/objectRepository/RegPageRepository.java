package com.jbk.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPageRepository {

	public WebDriver driver;
	 String namvalue;
	public RegPageRepository(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[contains(text(),'Register a new membership')]")
	public WebElement newRegLink;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	public WebElement signbtn;
	
	@FindBy(xpath="//b[contains(text(),'Java By Kiran')]")
	public WebElement jbktxt;
	
	@FindBy(xpath="//p[contains(text(),'Register a new membership')]")
	public WebElement newmwmtxt;
	
	@FindBy(xpath="	//a[contains(text(),'I already have a membership')]")
	public WebElement alredymemtxt;
	
	
	//place holder
	@FindBy(id="name")
	public WebElement unamePlctxt;
 
	@FindBy(id="mobile")
	public WebElement mobilePlctxt;
	
	@FindBy(id="password")
	public WebElement passPlctxt;
	
	@FindBy(id="email")
	public WebElement emailPlctxt;

	
	@FindBy(xpath="//div[@id='name_error']")
	public WebElement namerr;
	
	@FindBy(xpath="//div[@id='email_error']")
	public WebElement emailerr;
	
	@FindBy(xpath="//div[@id='password_error']")
	public WebElement passerr;
	
	@FindBy(xpath="//div[@id='mobile_error']")
	public WebElement moberr;
	
	 
	
	
}	