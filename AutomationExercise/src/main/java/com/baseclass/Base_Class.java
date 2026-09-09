package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public static WebDriver driver;

	public static WebDriver browserLaunch() {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Admin\\eclipse-workspace\\OrangeHRM\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationexercise.com/login");
		return driver;
	}

	public static void openUrl(String url) {
		driver.get(url);
	}

	public static void sendkeys(WebElement e, String text) {
		e.clear();
		e.sendKeys(text);
	}

	public static void click(WebElement e) {
		e.click();
	}

	public static void jsClick(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", e);
	}

	// GET---------------------------------------------------------
	public static void getText(WebElement e) {
		e.getText();
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void getPagesource() {
		driver.getPageSource();
	}

	// CHECKBOX---------------------------------------
	public static void checkboxClick(WebElement e) {
		e.click();
	}

	public static void checkboxEnabled(WebElement e) {
		e.isEnabled();
	}

	// DISPLAYED---------------------------------------------------------------
	public static void displayed(WebElement e) {
		e.isDisplayed();
	}

	public static void selected(WebElement e) {
		e.isSelected();
	}

	public static void enabled(WebElement e) {
		e.isEnabled();
	}

	// CLEAR
	public static void clear(WebElement e) {
		e.clear();
	}

	// ATTRIBUTE
	public static void attribute(WebElement e, String text) {
		e.getAttribute(text);
	}

//EXPLICIT WAIT-------------------------------------------------------------
	public static WebElement VisibilityWait(WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		return wait.until(ExpectedConditions.visibilityOf(e));
	}

	public static WebElement ClickableWait(WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		return wait.until(ExpectedConditions.elementToBeClickable(e));
	}

	public static void Implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

//DROP DOWN------------------------------------------------
	public static void dropDownValue(WebElement e) {
		Select s = new Select(e);
		s.selectByValue(null);
	}

	public static void dropDownIndex(WebElement e, int i) {
		Select s = new Select(e);
		s.selectByIndex(i);
	}

	public static void dropDownText(WebElement e, String text) {
		Select s = new Select(e);
		s.selectByVisibleText(text);
	}

	public static void firstSelectedoption(WebElement e) {
		Select s = new Select(e);
		s.getFirstSelectedOption();
	}

	public static void allSelectedoptions(WebElement e) {
		Select s = new Select(e);
		s.getAllSelectedOptions();
	}

	// NAVIGATE------------------------------------------------------------

	public static void forward() {
		driver.navigate().forward();
	}

	public static void back() {
		driver.navigate().back();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void navigateto(String url) {
		driver.navigate().to(url);
	}

	// SCROLL UP AND DOWN-----------------------------------------
	public static void scroll(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", e);

	}

	// ACTION---------------------------------------------------------

	public static void mouseOverAction(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).build().perform();

	}

	public static void dragandDrop(WebElement e) {
		Actions a = new Actions(driver);
		a.dragAndDrop(e, e).build().perform();
	}

	public static void rightClick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick();
	}

	public static void doubleClick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick();
	}

	// FRAMES------------------------------------------------------------
	public static void frame(String text) {
		driver.switchTo().frame(text);
	}

	public static void deafultFrame(String text) {
		driver.switchTo().defaultContent();

	}

	// ROBOT---------------------------------------------------------------
	public static void robot() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	// WINDOW HANDLES---------------------------------------------------------
	public static void windows(WebElement e) {
		Set<String> alltab = driver.getWindowHandles();
		List<String> id = new ArrayList<>(alltab);
		String text = id.get(0);
		System.out.println(text);

	}

	public String windowHandle() {
		return driver.getWindowHandle();

	}

	public Set<String> windowHandles() {
		return driver.getWindowHandles();
	}

	// WINDOW HANDLES---------------------------------------------------------
	public static void windowsHandling(WebElement e, int i) {
		Set<String> child = driver.getWindowHandles();
		List<String> all = new ArrayList<String>(child);
		driver.switchTo().window(all.get(i));
		System.out.println(driver.getCurrentUrl());
	}

	public static void windowHandling() {
		String parent = driver.getWindowHandle();
		System.out.println(parent);

	}

	// ALERT-------------------------------------------------------------

	public static void alertAccept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void alertDismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public static void alertSendkeys(String text) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(text);
	}

	public static void alertgetText() {
		Alert a = driver.switchTo().alert();
		String alerttext = a.getText();
		System.out.println(alerttext);
	}

	public static void quit() {
		driver.quit();
	}

}
