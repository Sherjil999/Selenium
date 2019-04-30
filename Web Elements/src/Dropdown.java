import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sherj\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		Select s = new Select(driver.findElement(By.id("selenium_commands")));
		
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(3);
		
		//s.selectByValue("7");
		
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		List<WebElement> allSelected = s.getAllSelectedOptions();
		
		for(WebElement selected : allSelected)
			System.out.println(selected.getText());

	}

}
