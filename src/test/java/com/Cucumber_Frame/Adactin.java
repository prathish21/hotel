package com.Cucumber_Frame;

import org.openqa.selenium.WebDriver;

import com.pageobjectmanager.PageObjectManager;
import com.properties.File_Reader_Manager;

public class Adactin extends BaseClass {
	public static WebDriver driver = browserLaunch("chrome");
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	public static void main(String[] args) throws Throwable {

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		passInput(pom.getInstanceLogin().getUsername(), username);
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		passInput(pom.getInstanceLogin().getPassword(), password);
		click(pom.getInstanceLogin().getLogin());
		
		dropDownByValue(pom.getInstanceSearch().getLocation(), "Los Angeles");
		dropDownByValue(pom.getInstanceSearch().getHotels(), "Hotel Hervey");
		dropDownByValue(pom.getInstanceSearch().getRoomType(), "Super Deluxe");
		dropDownByValue(pom.getInstanceSearch().getRoomnos(), "1");
		dropDownByValue(pom.getInstanceSearch().getAdultRoom(), "2");
		dropDownByValue(pom.getInstanceSearch().getChildroom(), "0");
		click(pom.getInstanceSearch().getSubmit());
		
		click(pom.getInstanceSelect().getRadio());
		click(pom.getInstanceSelect().getContinu());
		
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();
		passInput(pom.getInstanceBookHotel().getFirstname(), firstname);
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastname();
		passInput(pom.getInstanceBookHotel().getLastname(), lastname);
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		passInput(pom.getInstanceBookHotel().getAddress(), address);
		String ccnum = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCcnum();
		passInput(pom.getInstanceBookHotel().getCcnum(), ccnum);
		dropDownByValue(pom.getInstanceBookHotel().getCctype(), "VISA");
		dropDownByValue(pom.getInstanceBookHotel().getExpmonth(), "6");
		dropDownByValue(pom.getInstanceBookHotel().getExpyear(), "2022");
		String ccv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCcv();
		passInput(pom.getInstanceBookHotel().getCcv(), ccv);
		click(pom.getInstanceBookHotel().getBooknow());
		
		sleep(10000);
		screenshot("C:\\Users\\prathish\\eclipse-workspace\\Maven_Project\\screenshot\\adactin.png");

		click(pom.getInstanceBookingConfirmation().getLogout());
		closeBrowser();

	}

}
