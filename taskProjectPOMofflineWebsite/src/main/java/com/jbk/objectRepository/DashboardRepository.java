package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardRepository {

	@FindBy(xpath="//h3")
	public List<WebElement> Courses;
	
	@FindBy(xpath="//div[@class='row']//p")
	public List<WebElement> checkSubCourses;
	
	@FindBy(xpath="//a[text()='LOGOUT']")
	public WebElement buttonIsClickable;
	
	@FindBy(xpath="//a[text()='More info ']")
	public List<WebElement> verifyMoreInfoWithWindowsHandles;
	
	@FindBy(xpath="//a[text()='LOGOUT']")
	public WebElement logoutButtonWork;
	
	@FindBy(xpath="//ul[@class='sidebar-menu']//span")
	public WebElement sidebarText;
	
	@FindBy(xpath="//span[text()='Users']")
	public WebElement userPage;
	
	@FindBy(xpath="//span[text()='Operators']")
	public WebElement operatorsPage;
	
	@FindBy(xpath="//span[text()='     Useful Links']")
	public WebElement usefulLinksPage;
	
	@FindBy(xpath="//span[text()='Downloads']")
	public WebElement downloadsPage;
	
	@FindBy(xpath="//span[text()='Logout']")
	public WebElement logoutPage;
	
	//reposi
	
}
