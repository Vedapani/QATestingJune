import org.openqa.selenium.By;
import java.io.*;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class Phptestapp {

	public void setup() throws InterruptedException{
		//Start chrome browser
		WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	//open PHP application on chrome browser
	driver.get("http://52.66.187.131:49154/");
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	Thread.sleep(10000);
	///**new implementation**/
	
	driver.findElement(By.id("About Us")).click();
	Thread.sleep(10000);
	
	String elementtest = driver.findElement(By.id("PID-ab2-pg")).getText();
	
	//System.out.println(elementtest);
	
	
	String elementtest1="This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
	

	//Thread.sleep(10000);
	




assertEquals(elementtest,elementtest1);

	//driver.findElement(By.xpath(/html/body/div/header/navy/a[2])).click();
	//driver.close();
		
	}

	private void assertEquals(String elementtest, String elementtest1) {
		// TODO Auto-generated method stub
		
		System.out.println("Part 2 in assertive");
		System.out.println(elementtest);
		System.out.println(elementtest1);
		
		WebDriver driver= new ChromeDriver();
		if (elementtest.equals(elementtest1)) {
			
			System.out.println("Test is successfull");
			driver.close();
		}
		else {
			System.out.println("Test is not successfull");
			driver.close();
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Phptestapp ob=new Phptestapp();
		ob.setup();
		
		

	
	}

}
