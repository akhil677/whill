package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import AllPages.LandingPage;
import AllPages.OnlineStorePurchasePageC2;

public class clic {
	static ChromeDriver driver = new ChromeDriver();

	
	public static void main(String[] args) throws InterruptedException {
		
		LandingPage l = new LandingPage(driver);
		OnlineStorePurchasePageC2 o = new OnlineStorePurchasePageC2(driver);
//		Actions a = new Actions(driver);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		l.Model_C2_Buy B = new l.Model_C2_Buy();

		driver.get("https://staging-5em2ouy-kkcw5lx5vcayc.ap-3.magentosite.cloud/");
		driver.manage().window().maximize();
		l.C2_Buy();
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		o.C2_color_blue();
		Thread.sleep(1000);
		o.C2_do_not_purchase_warranty_service();
//		a.scrollToElement(o.C2_do_not_purchase_support_services1());
		Thread.sleep(1000);
		o.C2_do_not_purchase_support_services();
//		a.scrollToElement(o.C2_accessories_full_set1());
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");		
		Thread.sleep(1000);
		o.C2_accessories_full_set();
//		a.scrollToElement(o.C2_no_visit_setting1());
		
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");		
		Thread.sleep(1000);
		o.C2_no_visit_setting();
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");		
		o.C2_add_to_cart();
	}
//sfsdfsfsfsfesfre
}


