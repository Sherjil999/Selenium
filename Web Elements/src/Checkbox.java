import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sherj\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tutorialehtml.com/en/html-tutorial-using-checkbox-tag/");
		driver.manage().window().maximize();
		
		List<WebElement> checkBoxes = driver.findElements(By.name(("colors")));
		
		boolean isSelected = checkBoxes.get(0).isSelected();
		
		System.out.println(isSelected);
		
		checkBoxes.get(0).click();
		isSelected = checkBoxes.get(0).isSelected();
		System.out.println(isSelected);
	}

}
