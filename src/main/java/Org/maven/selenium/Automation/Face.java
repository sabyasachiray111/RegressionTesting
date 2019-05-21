package Org.maven.selenium.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\DropDown\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.close();

}
