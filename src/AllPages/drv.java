package AllPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class drv {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/home/qb_user/Downloads/sele/chromedriver_linux64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		WebElement Model_C2_Buy = driver.findElement(By.xpath("/html//main[@id='maincontent']/div[@class='columns']/div/div[2]/div/div//a[@href='https://staging-5em2ouy-kkcw5lx5vcayc.ap-3.magentosite.cloud/model-c2-all.html/']"));
		WebElement Model_C2_Rent = driver.findElement(By.xpath("/html//main[@id='maincontent']/div[@class='columns']/div/div[2]/div/div//a[@href='https://staging-5em2ouy-kkcw5lx5vcayc.ap-3.magentosite.cloud/model-c2-rental.html/']"));
		WebElement Model_F_Buy = driver.findElement(By.xpath("/html//main[@id='maincontent']/div[@class='columns']/div/div[2]/div/div//a[@href='https://staging-5em2ouy-kkcw5lx5vcayc.ap-3.magentosite.cloud/whill-model-f.html/']"));
		WebElement Model_F_Rent = driver.findElement(By.xpath("/html//main[@id='maincontent']/div[@class='columns']/div/div[2]/div/div//a[@href='https://staging-5em2ouy-kkcw5lx5vcayc.ap-3.magentosite.cloud/model-f-daily.html/']"));
		WebElement Model_S_Buy = driver.findElement(By.xpath("/html//main[@id='maincontent']/div[@class='columns']/div/div[2]/div/div//a[@href='https://staging-5em2ouy-kkcw5lx5vcayc.ap-3.magentosite.cloud/model-s-all.html/']"));
		
		
		
	}

}
