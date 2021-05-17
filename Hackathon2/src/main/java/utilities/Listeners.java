package utilities;
	
	
	import java.io.IOException;

import org.openqa.selenium.WebDriver;
	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;

import root.Base;

	public class Listeners extends Base implements ITestListener {
		
		

		public Listeners() throws IOException {
			super();
			// TODO Auto-generated constructor stub
		}

		WebDriver driver=null;
		ExtentTest test;
		ExtentReports extent=ExtentReport.getReportObjects();
		ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();
		public void onTestStart(ITestResult result) {
			test= extent.createTest(result.getMethod().getMethodName());
			extentTest.set(test);	
		}

		public void onTestSuccess(ITestResult result) {
			extentTest.get().log(Status.PASS, "Test Passed");
		}

		public void onTestFailure(ITestResult result) {
			extentTest.get().fail(result.getThrowable());	
		}

		public void onTestSkipped(ITestResult result) {
			
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
		}

		public void onStart(ITestContext context) {
			
		}

		public void onFinish(ITestContext context) {
			extent.flush();
		}

}
