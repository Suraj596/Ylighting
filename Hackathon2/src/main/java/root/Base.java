package root;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static WebDriver driver;
	public static Properties obj = new Properties();
	FileInputStream input;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public Base() throws IOException{
		
		File src = new File("F:\\Wells fargo\\Ylighting\\credentials.xlsx");
		input = new FileInputStream(src);
		wb = new XSSFWorkbook(input);
		sheet = wb.getSheet("Ylighting");
	}
        
	public Properties getPropertyFile() throws IOException {
			FileInputStream objfile = new FileInputStream(
					"C:\\Users\\hp\\eclipse-workspace\\Hackathon2\\src\\main\\java\\utilities\\Config.properties");
			obj.load(objfile);
			return obj;
	}
	
	public void getWebLink(String WebLink) {
				driver.get(WebLink);
        
	}    
	
	public WebDriver initializeDriver() throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;

	}
	
	public void inputProperty(String getAttributeValue) {
		driver.findElement(By.xpath(obj.getProperty(getAttributeValue))).click();
		waitFor();
	}

	public void inputValues(String getAttributeValue, String Value) {
		driver.findElement(By.xpath(getAttributeValue)).sendKeys(Value);
	}

	public void inputValues(String getAttributeValue) {
		driver.findElement(By.xpath(getAttributeValue)).click();
	}
	
	public void popup() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,60);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ltkpopup-close-button']")));
       
        driver.findElement(By.xpath("//*[@id='ltkpopup-close-button']")).click();
        waitFor();
	}
	
	public void loadimage() {
		
		By loadingImage = By.xpath("createacc");

        WebDriverWait wait = new WebDriverWait(driver, 5000);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
	}
	
	public void loadimage2() {
		
		By loadingImage = By.xpath("signin");

        WebDriverWait wait = new WebDriverWait(driver, 5000);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
	}
	
	public void waitFor() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public String excelFile(String value) throws IOException {
		
		String result = null;
		switch (value) {
		case "Fname": {
			result = sheet.getRow(1).getCell(0).getStringCellValue();
			break;
		}
		case "Lname": {
			result = sheet.getRow(1).getCell(1).getStringCellValue();
			break;
		}
		case "Email": {
			result = sheet.getRow(1).getCell(2).getStringCellValue();
			break;
		}
		case "Pass": {
			result = sheet.getRow(1).getCell(4).getStringCellValue();
			break;
		}
		}
		return result;

	}

}

