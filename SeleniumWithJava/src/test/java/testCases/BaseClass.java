package testCases;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {

	public String Url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	public static WebDriver driver;

	WebDriverWait wait;

	public static ExtentReports reports;
	public static ExtentTest Loggertest;
	public static ExtentSparkReporter extent;
	

	public static String dateOnly() {

		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		Date date = new Date();

		String date1 = dateFormat.format(date);

		return date1;

	}

	@BeforeSuite
	public void before() throws Exception {

		File dir1 = new File((System.getProperty("user.dir") + "/target/Reports/" + dateOnly()));

		dir1.mkdir();

		Date d = new Date();

		String fileName = "OrangeHRM_Report_" + d.toString().replace(":", "_").replace(" ", "_") + ".html";

		extent = new ExtentSparkReporter(
				new File((System.getProperty("user.dir") + "/target/Reports/" + dateOnly() + "/" + fileName)));

		extent.config().setTheme(Theme.STANDARD);
		extent.config().setDocumentTitle(fileName);
		extent.config().setEncoding("utf-8");
		extent.config().setReportName(fileName);

		reports = new ExtentReports();
		reports.attachReporter(extent);

		reports.setSystemInfo("Organisation", "Orange HRM Pvt Ltd");
		reports.setSystemInfo("Tester", "Shubham");
		reports.setSystemInfo("BuildName", "1.01");
		reports.setSystemInfo("Project", "");
		
		//Loggertest = reports.createTest("SetUp");
	}

	@BeforeTest
	public void setUp() {

		driver = new ChromeDriver();
		driver.get(Url);

	}

	public static String extentReportportScreenshot(WebDriver driver, String screenshotName) throws Exception {

		String dateName = new SimpleDateFormat("yyyy-MM-dd_hh_mm_ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		// You Can Show Folder "FailedTestsScreenshots" Under SRC folder
		String destination = System.getProperty("user.dir") + "\\target\\Reports\\" + dateOnly() + "\\" + screenshotName
				+ dateName + ".png";

		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		System.out.println("Fail Screenshot Captured");
		return destination;
	}

	@AfterMethod(alwaysRun = true)
	public void TearDown_AM(ITestResult result) throws IOException {
		
		try {
			if (result.getStatus() == ITestResult.FAILURE) {
				
				Loggertest.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable());

				try {

					String screenshotPath = BaseClass.extentReportportScreenshot(driver, result.getName());
					Loggertest.log(Status.FAIL,
							("<b>" + "<font color=" + "red>" + "Screenshot of failure" + "</font>" + "</b>"));
					Loggertest.addScreenCaptureFromPath(screenshotPath);// adding screen shot
					
				} catch (IOException e) {

				}
				
				String methodName = result.getMethod().getMethodName();
				String failText = "TEST CASE FAILED:- " + methodName;
				Markup F = MarkupHelper.createLabel(failText, ExtentColor.RED);
				Loggertest.log(Status.FAIL, F);

				 driver.quit();
				System.out.println("Close Browser After Test Case Failed");

			} else if (result.getStatus() == ITestResult.SUCCESS) {
				
				String methodName = result.getMethod().getMethodName();
				String passText = "TEST CASE:- " + methodName + " PASSED";
				Markup P = MarkupHelper.createLabel(passText, ExtentColor.GREEN);

				Loggertest.log(Status.PASS, P);

			} else if (result.getStatus() == ITestResult.SKIP) {
				
				String methodName = result.getMethod().getMethodName();
				String skipText = "TEST CASE:- " + methodName + " SKIPPED";
				Markup S = MarkupHelper.createLabel(skipText, ExtentColor.GREY);

				Loggertest.log(Status.SKIP, S);

			}

			reports.flush();

		} catch (Throwable t) {
			
			Loggertest.log(Status.INFO, t.fillInStackTrace());
		}
		
		
		driver.quit();
	}
	
	

}
