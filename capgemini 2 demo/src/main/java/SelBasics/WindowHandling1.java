package SelBasics;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WindowHandling1{

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		//every window has a unique handle id
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent ID is "+ parentWindow);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/div/p[3]/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/p[4]/button")).click();
		Set<String> childWindow =  driver.getWindowHandles();
		System.out.println("the child window is" + childWindow);//both parent and chils windowId
		Thread.sleep(2000);
		driver.quit();		
	}
}