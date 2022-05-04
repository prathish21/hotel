package com.Cucumber_Frame;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;// its default value is null

	public static WebDriver browserLaunch(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			}
		else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\Driver\\firefoxdriver.exe");
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;
		
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void quitBrowser() {
		driver.quit();
	}
	public static void passInput(WebElement element, String input) {
		element.sendKeys(input);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void screenshot(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(location);
		FileUtils.copyFile(src, dest);
	}
	public static void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}
	public static void wait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	public static void dropDownByIndex(WebElement element,int index) {
		Select ref = new Select(element);
		ref.selectByIndex(index);
	}
	public static void dropDownByValue(WebElement element,String value) {
		Select ref = new Select(element);
		ref.selectByValue(value);
	}
	public static void dropDownByText(WebElement element,String text) {
		Select ref = new Select(element);
		ref.selectByVisibleText(text);
	}
	public static void to(String url) {
		driver.navigate().to(url);
	}
	public static void back() {
		driver.navigate().back();
	}
	public static void forward() {
		driver.navigate().forward();
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void alert(String text) {
		if(text.equalsIgnoreCase("ok")) {
		driver.switchTo().alert().accept();
		}
		else if(text.equalsIgnoreCase("cancel")) {
		driver.switchTo().alert().dismiss();
		}
		else if(text.equalsIgnoreCase("text")) {
		driver.switchTo().alert().getText();
		}
	}
	public static void alertInput(String keysToSend) {
		driver.switchTo().alert().sendKeys(keysToSend);
	}
	public static void action(String by, WebElement element) {
		Actions ref = new Actions(driver);
		if (by.equalsIgnoreCase("click")) {
			ref.click(element).build().perform();
		}else if (by.equalsIgnoreCase("rightclick")) {
			ref.contextClick(element).build().perform();			
		}else if (by.equalsIgnoreCase("doubleclick")) {
			ref.doubleClick(element).build().perform();
		}else if (by.equalsIgnoreCase("moveto")) {
			ref.moveToElement(element).build().perform();
		}
	}
	public static void dragAndDrop(WebElement source,WebElement target) {
		Actions ref = new Actions(driver);
		ref.dragAndDrop(source, target);
	}
	public static void frameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	public static void frameByName(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	public static void frameByWebelement(String frameElement) {
		driver.switchTo().frame(frameElement);
	}	
	public static void robot(String key,int noOfTimes) throws AWTException {
		Robot ref = new Robot();
		if (key.equalsIgnoreCase("down")) {
			for (int i = 0; i < noOfTimes ; i++) {
				ref.keyPress(KeyEvent.VK_DOWN);
				ref.keyRelease(KeyEvent.VK_DOWN);
				}}
			else if (key.equalsIgnoreCase("up")) {
			for (int i = 0; i < noOfTimes ; i++) {
				ref.keyPress(KeyEvent.VK_UP);
				ref.keyRelease(KeyEvent.VK_UP);
				}}
			else if (key.equalsIgnoreCase("left")) {
			for (int i = 0; i < noOfTimes ; i++) {
				ref.keyPress(KeyEvent.VK_LEFT);
				ref.keyRelease(KeyEvent.VK_LEFT);
				}}
			else if (key.equalsIgnoreCase("right")) {
			for (int i = 0; i < noOfTimes ; i++) {
				ref.keyPress(KeyEvent.VK_RIGHT);
				ref.keyRelease(KeyEvent.VK_RIGHT);
				}}
			else if (key.equalsIgnoreCase("enter")) {
				ref.keyPress(KeyEvent.VK_ENTER);
				ref.keyRelease(KeyEvent.VK_ENTER);
			}
	}
	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public static void enabled(WebElement element) {
		element.isEnabled();
	}
	public static void displayed(WebElement element) {
		element.isDisplayed();
	}
	public static void selected(WebElement element) {
		element.isSelected();
	}
	public static void gettitle() {
		driver.getTitle();	
	}
	public static void getCurrenturl() {
		driver.getCurrentUrl();
	}

	public static void gettext(WebElement element) {
		element.getText();	
	}
	public static void getattribute(WebElement element,String value) {
		element.getAttribute(value);
	}
	public static void ismultiple(WebElement element) {
		Select s = new Select(element);
	    //boolean multiple = s.isMultiple();
	    if (s.isMultiple()) {
			System.out.println("TRUE");
		} else {
            System.out.println("FALSE");
		}
	}
	public static void getfirst(WebElement element) {
		Select s = new Select(element);
         WebElement firstSelectedOption = s.getFirstSelectedOption();
         System.out.println(firstSelectedOption);
	}
	public static void getall(WebElement element) {
	       Select s = new Select(element);
	       List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	       for (WebElement all : allSelectedOptions) {
			System.out.println(all.getText());
		}
		}
	public static void getoptions(WebElement element) {
		Select s = new Select(element);
        List<WebElement> options = s.getOptions();
        for (WebElement opt : options) {
			System.out.println(opt.getText());
		}
	}
	public static void checkbox(WebElement element) {
		element.click();
	}
	public static void dropDown(WebElement element, String type ,String value) {
		Select s = new Select(element);
		try {
			if (type.equalsIgnoreCase("byIndex")) {
				int index = Integer.parseInt(value);
				s.selectByIndex(index);
			} else if (type.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);
			} else if (type.equalsIgnoreCase("byVisibletext")) {
				s.selectByVisibleText(value);
			} else {
				System.out.println("Invalid");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
			
		
	}
	
	
	
	
	
	
	
	

