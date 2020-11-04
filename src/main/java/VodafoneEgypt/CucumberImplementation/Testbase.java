package VodafoneEgypt.CucumberImplementation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;

public class Testbase {

	@Test(enabled = true, priority = 0)
	public void SignIn() throws Exception {

		String path = System.getProperty("user.dir");
		String driverPath = path + "\\drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		String baseUrl = "https://test92.adam.ai";
		driver.get(baseUrl);
		Thread.sleep(8000);
		WebElement Email = driver
				.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div[2]/div/div/form/input[1]"));
		Email.sendKeys("ahmed.nagiub92@gmail.com");
		WebElement PasswordText = driver
				.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div[2]/div/div/form/input[2]"));
		PasswordText.sendKeys("Fl@sh2k1");
		WebElement LoginBtn = driver
				.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div[2]/div/div/form/div[3]/button"));
		LoginBtn.click();
		// Thread.sleep(3000);
		WebElement addMembersFromSidemenu = driver
				.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/div[2]/a[5]"));
		addMembersFromSidemenu.click();
		WebElement addMembers = driver.findElement(By.xpath(
				"//*[@id=\"state-container-members\"]/div[1]/div[2]/div[1]/button/div[1]/ng-transclude/md-icon"));
		addMembers.click();
		Thread.sleep(3000);
		WebElement addAnotherMailoption = driver
				.findElement(By.xpath("//*[@id=\"add-modal\"]/form/div[1]/div/div[1]/p[1]/span"));
		addAnotherMailoption.click();
		addAnotherMailoption.click();
		addAnotherMailoption.click();
		addAnotherMailoption.click();
		Thread.sleep(3000);

		try {
			WebElement firstMail = driver.findElement(By.xpath("//*[@id=\"input_27\"]"));
			firstMail.sendKeys("test@test.com");
		} catch (Exception e1) {
			WebElement firstMail = driver.findElement(By.xpath("//*[@id=\"input_25\"]"));
			firstMail.sendKeys("test@test.com");
		}
		WebElement SecondMail = driver.findElement(By.xpath("//*[@id=\"input_28\"]"));
		SecondMail.sendKeys("test1@test.com");
		WebElement ThirdMail = driver.findElement(By.xpath("//*[@id=\"input_29\"]"));
		ThirdMail.sendKeys("test2@test.com");
		try {
			WebElement fourthMail = driver.findElement(By.xpath("//*[@id=\"input_30\"]"));
			fourthMail.sendKeys("test3@test.com");
		} catch (Exception e1) {
			WebElement fourthMail = driver.findElement(By.xpath("//*[@id=\"input_26\"]"));
			fourthMail.sendKeys("test3@test.com");
		}
		Thread.sleep(4000);
		WebElement sendInvitation = driver.findElement(By.xpath("//*[@id=\"add-modal\"]/form/div[2]/button[2]/span"));
		sendInvitation.click();
		Thread.sleep(3000);

		WebElement inviteMore = driver.findElement(By.xpath("//*[@id=\"add-modal\"]/div[3]/div[2]/button[1]/span"));
		// inviteMore.click();
		WebElement done = driver.findElement(By.xpath("//*[@id=\"add-modal\"]/div[3]/div[2]/button[2]/span"));
		done.click();
		driver.navigate().back();
		Thread.sleep(8000);
		addMembersFromSidemenu.click();
		Thread.sleep(4000);
		WebElement plusIcon = driver.findElement(
				By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[2]/div[1]/div/button/div/ng-transclude/md-icon"));
		plusIcon.click();
		WebElement addMembersOption = driver.findElement(
				By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[2]/div[1]/div/div/ng-transclude/ul/li[5]/span"));
		addMembersOption.click();

		Thread.sleep(3000);

		WebElement upselling = driver.findElement(By.xpath("//*[@id=\"add-modal\"]/div[4]/div[1]/div[2]"));

		try {
			assert upselling.isDisplayed();
			System.out.println("Test case passed !");
		} catch (Exception e) {
			System.out.println("Test case Failed !");

			e.printStackTrace();
		}

		driver.close();

	}

}