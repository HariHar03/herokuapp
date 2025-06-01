package Hari_mavern.Hari_mavern12;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ScenariobasedPractice {
	
	By searchbox=By.xpath("//textarea[@class='gLFyf']");
	By all=By.xpath("(//div[@class='YmvwI'])[1]");
	By firstlink=By.xpath("(//div[@class='dURPMd']//a)[1]");
	By Phase1=By.xpath("(//div[@class='mw-heading mw-heading4'])[1]");
	By Phase2=By.xpath("(//div[@class='mw-heading mw-heading4'])[2]");
	By Phase3=By.xpath("(//div[@class='mw-heading mw-heading4'])[3]");
	
	WebDriver wd=new EdgeDriver();
	WebDriverWait wait=new WebDriverWait(wd,Duration.ofSeconds(40));

  @Test
  public void phase1() throws InterruptedException {
	  wd.get("https://www.google.com");
		wd.findElement(searchbox).sendKeys("List of Marvel Cinematic Universe films");
		  Actions act=new Actions(wd);
		  act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(all));
		  WebElement link=wd.findElement(firstlink);
		  link.click();
	  JavascriptExecutor js=(JavascriptExecutor)wd;
	  WebElement phase1=wd.findElement(Phase1);
	  js.executeScript("arguments[0].scrollIntoView(true);", phase1);
	  List<String> list1=new ArrayList<>();
	  for(int i=2;i<=6;i++) {
		  WebElement web=wd.findElement(By.xpath("(//table[@class='wikitable plainrowheaders defaultcenter col2left'])[1]//tr["+i+"]//th"));
		  String str=web.getText();
		  list1.add(str);
	  }
	  for(String s:list1) {
		  System.out.println(s);
	  }
	  System.out.println("---------------------------------------------------------------");
	  Thread.sleep(2000);
	  
  }
  
  @Test
  public void phase2() throws InterruptedException{
	  WebElement web=wd.findElement(Phase2);
	  JavascriptExecutor js=(JavascriptExecutor)wd;
	  js.executeScript("arguments[0].scrollIntoView(true)",web);
	  List<String> list2=new ArrayList<>();
	  for(int i=2;i<=6;i++) {
		  WebElement web2=wd.findElement(By.xpath("(//table[@class='wikitable plainrowheaders defaultcenter col2left'])[2]//tr["+i+"]//th"));
		 String str=web2.getText();
		  list2.add(str);
	  }
	  
	  for(String s:list2) {
		  System.out.println(s);
	  }
	  System.out.println("-------------------------------------------------------");
	  Thread.sleep(2000);
  }
  
  @Test
  public void phase3() {
	  WebElement web=wd.findElement(Phase3);
	  JavascriptExecutor js=(JavascriptExecutor)wd;
	  js.executeScript("arguments[0].scrollIntoView()", web);
	  List<String> list3=new ArrayList<>();
	  for(int i=2;i<=6;i++) {
		  WebElement web2=wd.findElement(By.xpath("(//table[@class='wikitable plainrowheaders defaultcenter col2left'])[3]//tr["+i+"]//th"));
		  String str3=web2.getText();
		  list3.add(str3);
	  }
	  
	  for(String s:list3) {
		  System.out.println(s);
	  }
	  System.out.println("---------------------------------------------------");
  }
}
