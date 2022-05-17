package com.hybridframework.inetbanking.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.hybridframework.inetbanking.utility.ConfigDataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {

	public WebDriver driver;

	static String configpath = "./Configuration/config.properties";

	public ConfigDataProvider ConfigDataProvider;

	@BeforeSuite
	public void init() {
		ConfigDataProvider = new ConfigDataProvider(configpath);
	}

	@BeforeTest
	@Parameters({ "browser" })

	public void setUp(@Optional("Chrome") String brname) {

		if (brname.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (brname.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Browser Doesnot Match");
		}
		driver.manage().window().maximize();
		driver.get(ConfigDataProvider.getURL());
	}

	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(7000);
		driver.quit();
		}
	}

