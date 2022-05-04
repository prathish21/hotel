package com.Step_Definition;

import com.Cucumber_Frame.BaseClass;
import com.pageobjectmanager.PageObjectManager;
import com.properties.File_Reader_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass {
	
	public static PageObjectManager pom = new PageObjectManager(driver);


	@Given("^user Should Launch The Url$")
	public void user_Should_Launch_The_Url() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);
		}
	
	@When("^user Enters \"([^\"]*)\" In The Username Field$")
	public void user_Enters_In_The_Username_Field(String username) throws Throwable {
		passInput(pom.getInstanceLogin().getUsername(),username );
		}
	
	@When("^user Enters \"([^\"]*)\" In The Password Field$")
	public void user_Enters_In_The_Password_Field(String password) throws Throwable {
		passInput(pom.getInstanceLogin().getPassword(), password);
		}
	
	@Then("^user Clicks The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Clicks_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		//wait(2);
		click(pom.getInstanceLogin().getLogin());
		}
	
	@When("^user Selects \"([^\"]*)\" From Select Location Field$")
	public void user_Selects_From_Select_Location_Field(String location) throws Throwable {
		wait(30);
		dropDownByValue(pom.getInstanceSearch().getLocation(), location);
		}

	@When("^user Selects \"([^\"]*)\" From Select Hotel Field$")
	public void user_Selects_From_Select_Hotel_Field(String hotel) throws Throwable {
		dropDownByValue(pom.getInstanceSearch().getHotels(), hotel);
		}

	@When("^user Selects \"([^\"]*)\" From Select Room Type Field$")
	public void user_Selects_From_Select_Room_Type_Field(String type) throws Throwable {
		dropDownByValue(pom.getInstanceSearch().getRoomType(), type);
		}

	@When("^user Selects \"([^\"]*)\" From Select Number Of Rooms Field$")
	public void user_Selects_From_Select_Number_Of_Rooms_Field(String no) throws Throwable {
		dropDownByValue(pom.getInstanceSearch().getRoomnos(), no);
		}

	@When("^user Selects \"([^\"]*)\" From Select Adults Per Room Field$")
	public void user_Selects_From_Select_Adults_Per_Room_Field(String adults) throws Throwable {
		dropDownByValue(pom.getInstanceSearch().getAdultRoom(), adults);
		}
	
	@When("^user Selects \"([^\"]*)\" From Children Per Room Field$")
	public void user_Selects_From_Children_Per_Room_Field(String children) throws Throwable {
		dropDownByValue(pom.getInstanceSearch().getChildroom(), children);
		}

	@Then("^user Clicks Search Button And It Navigates To The Select Hotel Page$")
	public void user_Clicks_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		click(pom.getInstanceSearch().getSubmit());
		}

	@When("^user Clicks The Select Radio Button$")
	public void user_Clicks_The_Select_Radio_Button() throws Throwable {
		click(pom.getInstanceSelect().getRadio());
		}

	@Then("^user Clicks The Continue Button And It Navigates To The Book A Hotel Page$")
	public void user_Clicks_The_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel_Page() throws Throwable {
		click(pom.getInstanceSelect().getContinu());
		}
	
	@When("^user Enters \"([^\"]*)\" In The Firstname Field$")
	public void user_Enters_In_The_Firstname_Field(String firstname) throws Throwable {
		passInput(pom.getInstanceBookHotel().getFirstname(), firstname);
		}

	@When("^user Enters \"([^\"]*)\" In The Lastname Field$")
	public void user_Enters_In_The_Lastname_Field(String lastname) throws Throwable {
		passInput(pom.getInstanceBookHotel().getLastname(), lastname);
		}

	@When("^user Enters \"([^\"]*)\" In The Billing Address Field$")
	public void user_Enters_In_The_Billing_Address_Field(String address) throws Throwable {
		passInput(pom.getInstanceBookHotel().getAddress(), address);
		}

	@When("^user Enters \"([^\"]*)\" In The Credit Card No Field$")
	public void user_Enters_In_The_Credit_Card_No_Field(String ccnum) throws Throwable {
		passInput(pom.getInstanceBookHotel().getCcnum(), ccnum);
		}

	@When("^user Selects \"([^\"]*)\" From Select Credit Card Type Field$")
	public void user_Selects_From_Select_Credit_Card_Type_Field(String type) throws Throwable {
		dropDownByValue(pom.getInstanceBookHotel().getCctype(), type);
		}

	@When("^user Selects \"([^\"]*)\" From Date And \"([^\"]*)\" From Select Year Field$")
	public void user_Selects_From_Date_And_From_Select_Year_Field(String month, String year) throws Throwable {
		dropDownByValue(pom.getInstanceBookHotel().getExpmonth(), month);
		dropDownByValue(pom.getInstanceBookHotel().getExpyear(), year);
		}

	@When("^user Enters \"([^\"]*)\" In The CVV Number Field$")
	public void user_Enters_In_The_CVV_Number_Field(String cvv) throws Throwable {
		passInput(pom.getInstanceBookHotel().getCcv(), cvv);
		}

	@Then("^user Clicks Book Now Button And It Navigates To Booking Confirmation Page$")
	public void user_Clicks_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
		click(pom.getInstanceBookHotel().getBooknow());
		sleep(10000);
		screenshot("C:\\Users\\prathish\\eclipse-workspace\\Cucumber_Frame\\screenshot\\adactin.png");
		}

	@Then("^user Clicks Logout Button And It Navigates To The Successfully Logged Out Page$")
	public void user_Clicks_Logout_Button_And_It_Navigates_To_The_Successfully_Logged_Out_Page() throws Throwable {
		click(pom.getInstanceBookingConfirmation().getLogout());
		}
}
