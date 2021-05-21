package root;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import utilities.LoggerClass;

public class Base {  //BaseClass

	public static WebDriver driver;
	public static Properties obj = new Properties();
	FileInputStream input;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	static final Logger logger = LogManager.getLogger(LoggerClass.class.getName());
	
	public Base() throws IOException{
		
		File src = new File("F:\\Wells fargo\\Ylighting\\credentials.xlsx");
		input = new FileInputStream(src);
		workbook = new XSSFWorkbook(input);
		sheet = workbook.getSheet("Ylighting");
	}
	
	/*For reading data from property file*/
        
	public Properties getPropertyFile() throws IOException {
			FileInputStream objfile = new FileInputStream(
					"C:\\Users\\hp\\git\\Ylighting\\Hackathon2\\src\\main\\java\\utilities\\Config.properties");
			obj.load(objfile);
			return obj;
	}
	
	public void getWebLink(String WebLink) {
				driver.get(WebLink);
        
	}    
	
	/* For initializing web driver */
	
	public WebDriver initializeDriver() throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;

	}
	
	/* For getting the xpath of web elements */
	
	public void inputProperty(String getAttributeValue) {
		driver.findElement(By.xpath(obj.getProperty(getAttributeValue))).click();
	}

	public void inputValues(String getAttributeValue, String Value) {
		driver.findElement(By.xpath(getAttributeValue)).sendKeys(Value);
	}

	public void inputValues(String getAttributeValue) {
		driver.findElement(By.xpath(getAttributeValue)).click();
	}
	
	/* For closing popup window */
	
	public void popup() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,5);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ltkpopup-close-button']")));
       
        driver.findElement(By.xpath("//*[@id='ltkpopup-close-button']")).click();
        waitFor();
	}
	
	/* For using wait statements */
	
	public void Wait() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
	}
	
	public void waitFor() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	/*For reading data from excel file*/
	
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
		case "Email1": {
			int email = (int) sheet.getRow(2).getCell(2).getNumericCellValue();
			result = String.valueOf(email);
			break;
		}
		case "search": {
			result = sheet.getRow(1).getCell(5).getStringCellValue();
			break;
		}
		case "Coupon": {
			int coup = (int) sheet.getRow(1).getCell(6).getNumericCellValue();
			result = String.valueOf(coup);
			break;
		}
		case "Zipcode": {
			int zip = (int) sheet.getRow(1).getCell(3).getNumericCellValue();
			result = String.valueOf(zip);
			break;
		}
		case "Pass": {
			result = sheet.getRow(1).getCell(4).getStringCellValue();
			break;
		}
		}
		return result;

	}

	/* For taking screenshot */
	
	public void screenshot() throws IOException {

		Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);
		ImageIO.write(s.getImage(), "PNG", new File("./Screenshot/Takescreenshot" + timestamp() + ".png"));
		System.out.println("The screenshot is taken");

	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	
	/* For using logger file and log report */
	
	public void info(String msg) {
		logger.info(msg);
	}
}

