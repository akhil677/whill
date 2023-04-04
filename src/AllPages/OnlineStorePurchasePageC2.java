package AllPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlineStorePurchasePageC2 {
	
	private WebDriver driver;
	
	public OnlineStorePurchasePageC2(WebDriver driver) {
		this.driver = driver;
	}
	
	//Page Elements
	private WebElement whill_logo1() {
		return driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[1]/div[1]/div/a"));
	}
	
	private WebElement C2_color_white1() {
		return driver.findElement(By.xpath("//*[@id=\"choice-option-32\"]"));
	}
	
	private WebElement C2_color_blue1() {
		return driver.findElement(By.xpath("//*[@id=\"choice-option-33\"]"));
	}
	
	private WebElement C2_color_grey1() {
		return driver.findElement(By.xpath("//*[@id=\"choice-option-34\"]"));
	}
	
	private WebElement C2_color_black1() {
		return driver.findElement(By.xpath("//*[@id=\"choice-option-35\"]"));
	}
	
	private WebElement C2_color_red1() {
		return driver.findElement(By.xpath("//*[@id=\"choice-option-36\"]"));
	}
	
	private WebElement C2_color_lightGreen1() {
		return driver.findElement(By.xpath("//*[@id=\"choice-option-37\"]"));
	}
	
	private WebElement C2_color_lightBlue1() {
		return driver.findElement(By.xpath("//*[@id=\"choice-option-38\"]"));
	}
	
	private WebElement C2_color_pink1() {
		return driver.findElement(By.xpath("//*[@id=\"choice-option-39\"]"));
	}
	
	private WebElement C2_color_purple1() {
		return driver.findElement(By.xpath("//*[@id=\"choice-option-40\"]"));
	}
	
	private WebElement C2_color_gold1() {
		return driver.findElement(By.xpath("//*[@id=\"choice-option-41\"]"));
	}
	
//	private WebElement gg() {
//		return driver.findElement(By.xpath(""));
//	}
//	
	public WebElement C2_do_not_purchase_warranty_service1() {
		return driver.findElement(By.id("smartCareUnSelect"));
	}
	
	public WebElement C2_purchase_warranty_service1() {
		return driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div[1]/div[1]/div[2]/fieldset/div[5]/div/div[2]"));
	}
	
	public WebElement C2_warranty_service_learn_more_about_content1() {
		return driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div[1]/div[1]/div[2]/fieldset/div[5]/div/div[2]/div/font/font"));
	}
	
	public WebElement C2_do_not_purchase_support_services1() {
		return driver.findElement(By.id("smartCareUnSelect1"));
	}
	
	public WebElement C2_purchase_support_services1() {
		return driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div[1]/div[1]/div[2]/fieldset/div[6]/div/div[2]"));
	}
	public WebElement C2_support_service_learn_more_about_content1() {
		return driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div[1]/div[1]/div[2]/fieldset/div[6]/div/div[2]/div"));
	}
	public WebElement C2_no_accessories1() {
		return driver.findElement(By.xpath("/html//div[@id='product-options-wrapper']/div[@class='fieldset']//div[@class='w-model__detail']/fieldset[@class='fieldset fieldset-bundle-option']/div[7]/div/div[1]/div"));
	}
	public WebElement C2_accessories_full_set1() {
		return driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div[1]/div[1]/div[2]/fieldset/div[7]/div/div[2]"));
	}
	public WebElement C2_no_visit_setting1() {
		return driver.findElement(By.xpath("/html//div[@id='product-options-wrapper']/div[@class='fieldset']//div[@class='w-model__detail']/fieldset[@class='fieldset fieldset-bundle-option']/div[10]/div/div[1]/div[@class='w-itemcCard__actions']"));
	}
	private WebElement C2_add_to_cart1() {
		return driver.findElement(By.xpath("/html//button[@id='product-addtocart-button']"));
	}
	
	//Page Methods
	public void whill_logo() {
		whill_logo1().click();
	}
	public void C2_color_white() {
		C2_color_white1().click();
	}
	public void C2_color_blue() {
		C2_color_blue1().click();
	}
	public void C2_color_grey() {
		C2_color_grey1().click();
	}
	public void C2_color_black() {
		C2_color_black1().click();
	}
	public void C2_color_red() {
		C2_color_red1().click();
	}
	public void C2_color_lightGreen() {
		C2_color_lightGreen1().click();
	}
	public void C2_color_lightBlue() {
		C2_color_lightBlue1().click();
	}
	public void C2_color_pink() {
		C2_color_pink1().click();
	}
	public void C2_color_purple() {
		C2_color_purple1().click();
	}
	public void C2_color_gold() {
		C2_color_gold1().click();
	}
	public void C2_do_not_purchase_warranty_service() {
		C2_do_not_purchase_warranty_service1().click();
	}
	public void C2_purchase_warranty_service() {
		C2_purchase_warranty_service1().click();
	}
	public void C2_warranty_service_learn_more_about_content() {
		C2_warranty_service_learn_more_about_content1().click();
	}
	public void C2_do_not_purchase_support_services() {
		C2_do_not_purchase_support_services1().click();
	}
	public void C2_purchase_support_services() {
		C2_purchase_support_services1().click();
	}
	public void C2_support_service_learn_more_about_content() {
		C2_support_service_learn_more_about_content1().click();
	}
	public void C2_no_accessories() {
		C2_no_accessories1().click();
	}
	public void C2_accessories_full_set() {
		C2_accessories_full_set1().click();
	}
	public void C2_no_visit_setting() {
		C2_no_visit_setting1().click();
	}
	public void C2_add_to_cart() {
		C2_add_to_cart1().click();
	}

}
