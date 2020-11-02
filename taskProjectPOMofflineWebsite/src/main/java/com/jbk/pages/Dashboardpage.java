package com.jbk.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.jbk.objectRepository.DashboardRepository;

public class Dashboardpage extends DashboardRepository {

	WebDriver driver;
	int i=1;
	public Dashboardpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public boolean checkCourses(WebDriver driver) {
		List<String> expCourses = new ArrayList<String>();
		expCourses.add("Selenium");
		expCourses.add("Java / J2EE");
		expCourses.add("Python");
		expCourses.add("Php");
		System.out.println("Expected>>>>>" + expCourses);

		//List<WebElement> actual = driver.findElements(By.xpath("//h3"));
		List<WebElement> actual = Courses;
		List<String> actCourses = new ArrayList<String>();
		for (WebElement we : actual) {
			actCourses.add(we.getText());
		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------");
		System.out.println("Actual>>>>>" + actCourses);
		
		if(actCourses.equals(expCourses)) {
			return true;
		}else {
			return false;
		}
	}

	public boolean checkSubCourses() {
		List<String> expCourses = new ArrayList<>();
		expCourses.add("Automation Testing");
		expCourses.add("Software Development");
		expCourses.add("Data Science");
		expCourses.add("Web Development");
		System.out.println("Expected>>>>>" + expCourses);

		List<WebElement> actual =checkSubCourses ;
		List<String> actCourses = new ArrayList<>();
		for (WebElement we : actual) {
			actCourses.add(we.getText());
		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------");
		System.out.println("Actual>>>>>" + actCourses);
		if(actCourses.equals(expCourses)) {
			return true;
		}else {
			return false;
		}
	}

	public boolean buttonIsClickable() {
		WebElement button = buttonIsClickable;
		boolean actcheck = button.isEnabled();
		System.out.println(">>>" + actcheck);
		if(button.isEnabled()) {
			return true;
		}else {
			return false;
		}
	}

	public boolean verifyMoreInfoWithWindowsHandles() {

		List<WebElement> moreInfo = verifyMoreInfoWithWindowsHandles;

		for (WebElement we : moreInfo) {
			System.out.println("Print Button>>>>" + we.getText());
			we.click();
		}

		String mainWindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String childWindow = iterator.next();
			if (!mainWindow.equals(childWindow)) {
				System.out.println("print title of child window" + driver.switchTo().window(childWindow).getTitle());
				driver.close();
			}
			driver.switchTo().window(mainWindow);
		}
		return true;
	}
	
	public boolean logoutButtonWorking() {
		WebElement button = logoutButtonWork;
		button.click();
		String actTitle=driver.getTitle();
		String ExpTitle="JavaByKiran | Log in";
		if(actTitle.equals(ExpTitle)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkDashboardUrl() {
		String actUrl=driver.getCurrentUrl();
		String expUrl="file:///F:/Offline%20website/pages/examples/dashboard.html";
		if(actUrl.equals(expUrl)) {
			return true;
		}else {
			return false;
		}
	}
	
	/*
	 * @Test(dataProvider = "dashboardTestData") public void sidebarList(String
	 * name1,String name2,String name3,String name4,String name5,String name6) {
	 * List<String> expSidebar=new ArrayList<>(); expSidebar.add(name1);
	 * expSidebar.add(name2); expSidebar.add(name3); expSidebar.add(name4);
	 * expSidebar.add(name5); expSidebar.add(name6);
	 * 
	 * System.out.println("Expected>>>>>"+expSidebar);
	 * 
	 * List<WebElement> actual=sidebarText; List<String> actSidebar=new
	 * ArrayList<String>(); for(WebElement we:actual) {
	 * actSidebar.add(we.getText()); System.out.println(
	 * "----------------------------------------------------------------------------------------------------"
	 * ); System.out.println("Actual in method>>>>>"+actSidebar); }
	 * Assert.assertEquals(actSidebar, expSidebar); }
	 */
	
	public void navigateToUserPage()
	{
		userPage.click();
	}
	
	public void navigateToOperatorsPage()
	{
		WebElement operator=operatorsPage;
		operator.click();
	}
	
	public void navigateToUsefulLinksPage()
	{
		WebElement usefulLink=usefulLinksPage;
		usefulLink.click();
	}
	
	public void navigateToDownloadsPage()
	{
		WebElement downloads=downloadsPage;
		downloads.click();
	}
	
	public void navigateHomePage()
	{
		WebElement logout=logoutPage;
		logout.click();
	}
	
	
	
}
