package com.jbk.objectRepository;



import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class OperatorPageObjectRepository  {
	public int r=2;
	@FindBy(tagName="h1")
	public WebElement pageheading;
	
	@FindBys(@FindBy(xpath="//th"))
	public  List<WebElement> tableHeaders;
	
	@FindBy(xpath="//tr//td")
	public  List<WebElement> mobileNumbers;
	
	@FindBy(tagName="h1")
	public  WebElement pageHeader;
	
	@FindBy(xpath="//h3[@class='box-title']")
	public  WebElement tableHeader;
	
	@FindBys(@FindBy(xpath="//tr//td"))
	public  List<WebElement> tableData;
	
	@FindBys(@FindBy(xpath="//td[2]"))
	public  List<WebElement> personNames;
	
	@FindBys(@FindBy(xpath="//tr"))
	public  List<WebElement> tableSize;
	//add 2 3 4 5 6 7
}
