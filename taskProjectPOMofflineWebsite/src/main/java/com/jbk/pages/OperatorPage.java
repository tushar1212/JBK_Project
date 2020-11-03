package com.jbk.pages;


import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.OperatorPageObjectRepository;
import com.jbk.utility.ExcelUtilty;



public class OperatorPage extends OperatorPageObjectRepository{
	WebDriver wd;
	int i;
	public OperatorPage(WebDriver wd) {
		this.wd=wd;
		PageFactory.initElements(wd, this);
	}
	//WebElements
	
	//Operations 
	public String getHeading() {
		String heading =pageheading.getText();
		return heading;
	}
	public  List<String> getTableHeaders() {
		List<String> actHeaders = tableHeaders.stream().map(a->a.getText()).collect(Collectors.toList());
		return actHeaders;
	}
	public  List<String> getMobileNo() {
		List<String> actMobileNo = mobileNumbers.stream().map(a->a.getText()).collect(Collectors.toList());
		return actMobileNo;
	}
	public  List<String> getTableAllData() {
		List<String> actMobileNo = tableData.stream().map(a->a.getText()).collect(Collectors.toList());
		return actMobileNo;
	}
	public String getPageHeading() {
		String pageHeading =pageHeader.getText();
		return pageHeading;
	}
	public String getTableHeading() {
		String pageHeading =tableHeader.getText();
		return pageHeading;
	}
	public  List<String> getAllPersonNames() {
		List<String> actPersonNames = personNames.stream().map(a->a.getText()).collect(Collectors.toList());
		return actPersonNames;
	}
	public int getTableSize() {
		int actSize =tableSize.size()-1;
		return actSize;
	}
	//validation
	public boolean isValidHeading() {
		String actHeading=getHeading();
		if(actHeading.equals("Operators")) {
			return true;
		}
		return false;
	}
	public boolean isHeaderCountValid() {
		List<String> header = getTableHeaders();
		int actHeaderCount = header.size();
		if(actHeaderCount==6) {
			return true;
			}
		return false;
	}
	public boolean isMobileNoSizeValid() {
		List<String> mobileNumber = getMobileNo();
		String actMobileNumber;
		for (int i = 0; i < mobileNumber.size(); i++) {
			actMobileNumber=mobileNumber.get(i);
			if(actMobileNumber.length()==10) {
				return true;
			}
		}
		return false;
	}
	public boolean isValidPageHeading() {
		String actHeading=getPageHeading();
		if(actHeading.equals("Operators")) {
			return true;
		}
		return false;
	}
	public boolean isValidTableHeading() {
		String actHeading=getPageHeading();
		if(actHeading.equals("Operator List")) {
			return true;
		}
		return false;
	}
	public boolean isValidTableHeader() throws Exception {
		String filePath = System.getProperty("user.dir")+"\\src\\main\\java\\utility\\OperatorPage.xls";
		String sheetName="headerList";
		if(getTableHeaders().equals(ExcelUtilty.excelData(filePath,sheetName))) {
			return true;
		}
		return false;
	}
	public boolean isValidTableData() throws Exception {
		String filePath = System.getProperty("user.dir")+"\\src\\main\\java\\utility\\OperatorPage.xls";
		String sheetName="tableData";
		//System.out.println(getTableAllData().size());
		//System.out.println(ExcelUtil.excelData(filePath,sheetName));
		if(getTableAllData().get(i).equals(ExcelUtilty.excelData(filePath,sheetName).get(i))) {
			return true;
		}
		return false;
	}
	public boolean isValidPersonNames() throws Exception {
		String filePath = System.getProperty("user.dir")+"\\src\\main\\java\\utility\\OperatorPage.xls";
		String sheetName="personNames";
		System.out.println(getAllPersonNames());
		System.out.println(ExcelUtilty.excelData(filePath,sheetName));
		if(getAllPersonNames().get(i).equals(ExcelUtilty.excelData(filePath,sheetName).get(i))) {
			return true;
		}
		return false;
	}
	public boolean isValidTableSize() {
		int actTableSize=getTableSize();
		for (int i=0;i<actTableSize-1;i++) {
				if(actTableSize==5) {
					return true;
				}
			}
		return false;
	}
}