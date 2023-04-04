package AllPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPage {

	private WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Page Elements
	private WebElement Model_C2_Buy() {
		return driver.findElement(By.xpath("/html//main[@id='maincontent']/div[@class='columns']/div/div[2]/div/div//a[@href='https://staging-5em2ouy-kkcw5lx5vcayc.ap-3.magentosite.cloud/model-c2-all.html/']"));
	}
	private WebElement Model_C2_Rent() {
		return driver.findElement(By.xpath("/html//main[@id='maincontent']/div[@class='columns']/div/div[2]/div/div//a[@href='https://staging-5em2ouy-kkcw5lx5vcayc.ap-3.magentosite.cloud/model-c2-rental.html/']"));
	}
	private WebElement Model_F_Buy() {
		return driver.findElement(By.xpath("/html//main[@id='maincontent']/div[@class='columns']/div/div[2]/div/div//a[@href='https://staging-5em2ouy-kkcw5lx5vcayc.ap-3.magentosite.cloud/whill-model-f.html/']"));
	}
	private WebElement Model_F_Rent() {
		return driver.findElement(By.xpath("/html//main[@id='maincontent']/div[@class='columns']/div/div[2]/div/div//a[@href='https://staging-5em2ouy-kkcw5lx5vcayc.ap-3.magentosite.cloud/model-f-daily.html/']"));
	}
	private WebElement Model_S_Buy() {
		return driver.findElement(By.xpath("/html//main[@id='maincontent']/div[@class='columns']/div/div[2]/div/div//a[@href='https://staging-5em2ouy-kkcw5lx5vcayc.ap-3.magentosite.cloud/model-s-all.html/']"));
	}
	private WebElement Account() {
		return driver.findElement(By.id("Ellipse_173"));
	}
	private WebElement Cart() {
		return driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[1]/div[2]/div[2]/a"));
	}

	//Page Methods
	public void C2_Buy() {
		Model_C2_Buy().click();
	}
	public void C2_Rent() {
		Model_C2_Rent().click();
	}
	public void F_Buy() {
		Model_F_Buy().click();
	}
	public void F_Rent() {
		Model_F_Rent().click();
	}
	public void S_Buy() {
		Model_S_Buy().click();
	}
	public void AccountPage() {
		Account().click();
	}
	public void CartPage() {
		Cart().click();
	}
}
//	public static void main(String[] args) throws InterruptedException {
//		
//		System.setProperty("webdriver.chrome.driver", "/home/qb_user/Downloads/sele/chromedriver_linux64/chromedriver");
//
//
//	}
//
//	public ChromeDriver getDriver() {
//		return driver;
//	}
//
//	public void setDriver(ChromeDriver driver) {
//		this.driver = driver;
//	}
//
//}


