package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pomclasses.Book_Hotel_Page;
import com.pomclasses.Booking_Cofirmation_Page;
import com.pomclasses.Login_Page;
import com.pomclasses.Search_Hotel_Page;
import com.pomclasses.Select_Hotel;

public class PageObjectManager {
	public WebDriver driver;
	private Login_Page lp;
	private Search_Hotel_Page search;
	private Select_Hotel sl;
	private Book_Hotel_Page bk;
	private Booking_Cofirmation_Page bc;
	
	public Search_Hotel_Page getInstanceSearch() {
		if (search==null) {
			search = new Search_Hotel_Page(driver);
		}
		return search;
	}
	public Select_Hotel getInstanceSelect() {
		if (sl==null) {
			sl = new Select_Hotel(driver);
		}
		return sl;
	}
	public Book_Hotel_Page getInstanceBookHotel() {
		if (bk==null) {
			bk = new Book_Hotel_Page(driver);
		}
		return bk;
	}
	public Booking_Cofirmation_Page getInstanceBookingConfirmation() {
		if (bc==null) {
			bc= new Booking_Cofirmation_Page(driver);
		}
		return bc;
	}
	
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
				
	}

	public Login_Page getInstanceLogin(){
		if(lp==null) {
			lp= new Login_Page(driver);
		}
		return lp;
	}
	

}
