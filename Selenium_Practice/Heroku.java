package Hari_mavern.Hari_mavern12;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;

public class Heroku {
	private static WebDriver wd=new ChromeDriver();;
	By Drop_Down_button=By.xpath("//a[contains(text(),'Dropdown')]");
	By DropDown=By.id("dropdown");
	By Entry_Ad=By.xpath("//a[contains(text(),'Entry')]");
	By EntryButton=By.xpath("//p[contains(text(),'Close')]");
	By Exit_Ad=By.xpath("//a[contains(text(),'Exit')]");
	By ExitButton=By.xpath("//p[contains(text(),'Close')]");
	By File_Download=By.xpath("(//a[contains(text(),'Download')])[1]");
	By Whatsapp_Button=By.xpath("//a[contains(text(),'WhatsApp')]");
	By FileUpload=By.xpath("//a[contains(text(),'File Upload')]");
	By FileUploadButton=By.id("file-upload");
	By Forgot_Password=By.xpath("//a[contains(text(),'Forgot')]");
	By Email=By.id("email");
	By PassButton=By.xpath("//i[contains(text(),'Retrieve')]");
	By formAuthentication=By.xpath("//a[contains(text(),'Form')]");
	By username=By.name("username");
	By Password=By.name("password");
	By submit=By.xpath("//button[@class=\"radius\"]");
	By frames=By.xpath("//a[contains(text(),'Frames')]");
	By iFrame=By.xpath("//a[contains(text(),'iFrame')]");
	By FrameId=By.id("mce_0_ifr");
	By FrameMessage=By.xpath("//p[contains(text(),'Your content')]");
	By parentFrameMessage=By.xpath("//h3[contains(text(),'An iFrame')]");
	By NestedFrame=By.xpath("//a[contains(text(),'Nested')]");
	By left=By.xpath("//body[contains(text(),'LEFT')]");  
	By Middle=By.id("content");
	By right=By.xpath("//body[contains(text(),'RIGHT')]");  
	By bottom=By.xpath("//body[contains(text(),'BOTTOM')]");  
	By GeoLocation=By.xpath("//a[contains(text(),'Geo')]");
	By Where_am_I=By.xpath("//button[contains(text(),'Where')]");
	By Horizontal=By.xpath("//a[contains(text(),'Horizontal')]");
	By slide=By.xpath("//input[@type='range']");
	By hovers=By.xpath("//a[contains(text(),'Hovers')]");
	By HoverList=By.xpath("//img[@src='/img/avatar-blank.jpg']");
	By InfiniteScroll=By.xpath("//a[contains(text(),'Infinite')]");
	By Input=By.xpath("//a[contains(text(),'Inputs')]");
	By InputEnter=By.xpath("//input[@type='number']");
	By JQuery=By.xpath("//a[contains(text(),'JQuery')]");
	By enable=By.xpath("//a[contains(text(),'Enabled')]");
	By download=By.xpath("//a[contains(text(),'Downloads')]");
	By pdf=By.xpath("//a[contains(text(),'PDF')]");
	By jsalert=By.xpath("//a[contains(text(),'JavaScript')]");
	By jsaccept=By.xpath("//button[contains(text(),'JS Alert')]");
	By confirm=By.xpath("//button[contains(text(),'JS Alert')]");
	By Prompt=By.xpath("//button[contains(text(),'JS Prompt')]");
	By dynamiccontent=By.xpath("//a[contains(text(),'Dynamic Content')]");
	By Dynamiccontents=By.xpath("(//div[@class='row'])[3]/child::div/child::div");
	By KeyPress=By.xpath("//a[text()='Key Presses']");
	By keypressinput=By.id("target");
	By Multiplewindow=By.xpath("//a[text()=\"Multiple Windows\"]");
	By windowclickhere=By.xpath("//a[text()='Click Here']");
	By Notification=By.xpath("//a[contains(text(),'Notification')]");
	By Notificationclick=By.xpath("//a[contains(text(),'Click')]");
	By notificationmessage=By.id("flash");
	By RedirectLink=By.xpath("//a[contains(text(),'Redirect')]");
	By redirectbutton=By.id("redirect");
	By linkul=By.xpath("//div[@class='example']/child::ul//a");
	By SecureDownload=By.xpath("//a[contains(text(),'Secure')]");
	By ShadowDOM=By.xpath("//a[contains(text(),'Shadow')]");
	By typolink=By.xpath("//a[contains(text(),'Typos')]");
	By TypoMessage=By.xpath("//div[@class='example']//p[2]");
	
	
	WebDriverWait wait=new WebDriverWait(wd,Duration.ofSeconds(35));
	
	
	@BeforeMethod
	public void launch() {
		
		wd.get("https://the-internet.herokuapp.com/?ref=hackernoon.com");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	
	
//  @Test
  public void Drop_Down() throws InterruptedException {
	  wd.findElement(Drop_Down_button).click();
	  WebElement drop_down=wd.findElement(DropDown);
	  Select select=new Select(drop_down);
	  select.selectByIndex(2);
	  Thread.sleep(2000);
  }
  
//  @Test
  public void EntryAd() throws InterruptedException {
	  wd.findElement(Entry_Ad).click();
	  Thread.sleep(3000);
	  wd.findElement(EntryButton).click();
  }
  
//  @Test(groups="tag1")
  public void ExitAd() throws AWTException, InterruptedException {
	  wd.findElement(Exit_Ad).click();
	 
	  Robot rob=new Robot();
	  rob.delay(3000);
	  rob.mouseMove(10, 10);
	  Thread.sleep(2000);
	  wd.findElement(ExitButton).click();
  }
  
  
//  @Test
  public void FileDownload() {
	  wd.findElement(File_Download).click();
	  wd.findElement(Whatsapp_Button).click();
  }
  
//  @Test
  public void FileUpload() throws InterruptedException, AWTException {
	  wd.findElement(FileUpload).click();
	  Thread.sleep(2000);
	  Robot rob=new Robot();
	  
//	  wd.findElement(FileUploadButton).click();
//	  rob.delay(2000);
//	  String str="C:\\Users\\Harih\\OneDrive\\Pictures\\profile.jpg";
//	  StringSelection string=new  StringSelection(str);
//	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);
//	  rob.keyPress(KeyEvent.VK_CONTROL);
//	  rob.keyPress(KeyEvent.VK_V);
//	  rob.keyRelease(KeyEvent.VK_CONTROL);
//	  rob.keyRelease(KeyEvent.VK_V);
//	  rob.delay(2000);
//	  rob.keyPress(KeyEvent.VK_ENTER);
//	  rob.keyRelease(KeyEvent.VK_ENTER);
	  wd.findElement(FileUploadButton).sendKeys("C:\\Users\\Harih\\OneDrive\\Pictures\\profile.jpg");
  }
  
//  @Test
  public void ForgotPassword() {
	  wd.findElement(Forgot_Password).click();
	  wd.findElement(Email).sendKeys("harihar3250");
	  wd.findElement(PassButton).click();
	  
  }
  
//  @Test
  public void FormAuthentication() {
	  wd.findElement(formAuthentication).click();
	  wd.findElement(username).sendKeys("harihar");
	  wd.findElement(Password).sendKeys("harihar@10");
	  wd.findElement(submit).click();
  }
  
//  @Test
  public void NestedFrame() throws InterruptedException {
	  wd.findElement(frames).click();
	  wd.findElement(NestedFrame).click();
	  wd.switchTo().frame(0);
	  wd.switchTo().frame(0);
	  String str2=wd.findElement(left).getText();
	  System.out.println(str2);
	  wd.switchTo().parentFrame();
	  wd.switchTo().frame(1);
	  System.out.println(wd.findElement(Middle).getText());
	  wd.switchTo().parentFrame();
	  wd.switchTo().frame(2);
	  System.out.println(wd.findElement(right).getText());
	  wd.switchTo().defaultContent();
	  wd.switchTo().frame(1);
	  System.out.println(wd.findElement(bottom).getText());
  }
  
  
//  @Test
  public void iFrame() throws InterruptedException {
	  wd.findElement(frames).click();
	  wd.findElement(iFrame).click();
//	  wd.switchTo().frame(wd.findElement(FrameId));
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//div[@class='tox-icon']")).click();
	  wd.switchTo().frame(wd.findElement(FrameId));
	  Thread.sleep(2000);
	  String str=wd.findElement(FrameMessage).getText();
	  System.out.println(str);
	  wd.switchTo().parentFrame();
	  String str2=wd.findElement(parentFrameMessage).getText();
	  System.out.println(str2);
  }
  
//  @Test
  public void Geolocation() {
	  wd.findElement(GeoLocation).click();
	  wd.findElement(Where_am_I).click();
	  Alert alert=wd.switchTo().alert();
	  alert.accept();
	  
	  
  }
  
//  @Test
  public void Horizontal() throws InterruptedException {
	  WebElement hori=wait.until(ExpectedConditions.elementToBeClickable(Horizontal));
	  hori.click();
	  Actions action=new Actions(wd);
	  WebElement slideButton=wd.findElement(slide);
	  action.dragAndDropBy(slideButton,50,0).perform();
	  Thread.sleep(2000);
	  action.dragAndDropBy(slideButton, -25,0).perform();
	  
  }
  
//  @Test
  public void Hovers() throws InterruptedException {
	  wd.findElement(hovers).click();
	  List<WebElement> li=wd.findElements(HoverList);
	  Actions action=new Actions(wd);
	  System.out.println(li.size());
	  for(WebElement wb:li) {
		  action.moveToElement(wb).perform();
		  Thread.sleep(2000);
	  }
  }
  
  
//  @Test
  public void InfiniteScroll() throws InterruptedException {
	  wd.findElement(InfiniteScroll).click();
	  JavascriptExecutor js=(JavascriptExecutor)wd;
	  Thread.sleep(2000);
	  while(true){
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
//	  js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	  }
  }
  
//  @Test
  public void Input() throws InterruptedException {
	  wd.findElement(Input).click();
	  wd.findElement(InputEnter).sendKeys("1900");
	  Actions action=new Actions(wd);
	  Thread.sleep(2000);
	  for(int i=0;i<=5;i++) {
	  action.sendKeys(Keys.ARROW_UP).perform();
	  }
	  Thread.sleep(2000);
	  for(int i=0;i<=100;i++) {
		  action.sendKeys(Keys.ARROW_DOWN).perform();
	  }
	  
  }
  
//  @Test
  public void jQuery() throws InterruptedException {
	  wd.findElement(JQuery).click();
	  Actions act=new Actions(wd);
	  act.moveToElement(wd.findElement(enable)).perform();
	  Thread.sleep(2000);
	  act.moveToElement(wd.findElement(download)).perform();
	  Thread.sleep(2000);
	  act.moveToElement(wd.findElement(pdf)).click().perform();

  }
  
//  @Test
  public void jsalert() throws InterruptedException {
	  wd.findElement(jsalert).click();
	  wd.findElement(jsaccept).click();
	  wd.switchTo().alert().accept();
	  Thread.sleep(2000);
	  wd.findElement(confirm).click();
	  wd.switchTo().alert().accept();
	  Thread.sleep(2000);
	  wd.findElement(confirm).click();
	  wd.switchTo().alert().dismiss();
	  Thread.sleep(2000);
	  wd.findElement(Prompt).click();
	  Alert alt=wd.switchTo().alert();
	  alt.sendKeys("harihar");
	  alt.accept();
	  
	  
	  
  }
  
 
//  @Test
  public void dynamicontent() {
	  wd.findElement(dynamiccontent).click();
	  List<WebElement> li=wd.findElements(Dynamiccontents);
	  System.out.println(li.size());
	  
  }
  
//  @Test
  public void KeyPress() throws InterruptedException {
	  wd.findElement(KeyPress).click();
	  Thread.sleep(2000);
	  wd.findElement(keypressinput).click();
	  Actions action=new Actions(wd);
	  action.sendKeys("h").sendKeys("a").sendKeys("r").sendKeys("i").sendKeys(Keys.ENTER).sendKeys("2").perform();
  }
  
//  @Test
  public void multiplewindow() {
	  wd.findElement(Multiplewindow).click();
	  wd.findElement(windowclickhere).click();
	  Set<String> set=wd.getWindowHandles();
	  List<String> li=new ArrayList<>(set);
	  wd.switchTo().window(li.get(1));
	  Boolean str=wd.getPageSource().contains("New Window");
	  Assert.assertTrue(str);
  }
  
  
//  @Test
  public void NotificationMessage() {
	  wd.findElement(Notification).click();
	  wd.findElement(Notificationclick).click();
	  WebElement notimessage=wait.until(ExpectedConditions.visibilityOfElementLocated(notificationmessage));
	  String str=notimessage.getText();
	  while(!str.contains("Action successful")){
		  wd.findElement(Notificationclick).click();
		  str=wd.findElement(notificationmessage).getText();
	  }

  }
  
//  @Test
  public void redirect() throws InterruptedException {
	  wd.findElement(RedirectLink).click();
	  wd.findElement(redirectbutton).click();
	  List<WebElement> li=wd.findElements(linkul);
	  System.out.println(li.size());
	  for(WebElement we:li) {
		  Thread.sleep(2000);
		  we.click();
		  String str= wd.getCurrentUrl();
		  if(str.contains("200") || str.contains("301") || str.contains("404") || str.contains("500")) {
			  System.out.println(str.substring(str.length()-3,str.length()));
		  }
		  wd.navigate().back();
	  }
	  
  }
  
//  @Test
  public void SecureDownload() throws AWTException {
	  wd.findElement(SecureDownload).click();
	  Robot rob=new Robot();
	  String str="admin";
	  StringSelection string=new StringSelection(str);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);
	  rob.keyPress(KeyEvent.VK_CONTROL);
	  rob.keyPress(KeyEvent.VK_V);
	  rob.keyRelease(KeyEvent.VK_CONTROL);
	  rob.keyRelease(KeyEvent.VK_V);
	  rob.keyPress(KeyEvent.VK_TAB);
	  rob.keyRelease(KeyEvent.VK_TAB);
	  rob.keyPress(KeyEvent.VK_CONTROL);
	  rob.keyPress(KeyEvent.VK_V);
	  rob.keyRelease(KeyEvent.VK_CONTROL);
	  rob.keyRelease(KeyEvent.VK_V);
	  rob.keyPress(KeyEvent.VK_ENTER);
	  rob.keyRelease(KeyEvent.VK_ENTER);
	  
	  
	  
  }
  
//  @Test
  public void shadowDom() {
	  wd.findElement(ShadowDOM).click();
	  JavascriptExecutor js=(JavascriptExecutor)wd;
	  WebElement web=(WebElement)js.executeScript("return document.querySelector('my-paragraph').shadowRoot.querySelector('p')");
	  String str=web.getText();
	  System.out.println(str);

  }
  
  
  @Test
  public void Typo() {
	  wd.findElement(typolink).click();
	  String str1="Sometimes you'll see a typo, other times you won,t.";
	  wd.navigate().refresh();
	  String web=wd.findElement(TypoMessage).getText();
	  System.out.println(web+"\n"+str1);
	  while(!web.equals(str1)) {
		  wd.navigate().refresh();
		  web=wd.findElement(TypoMessage).getText();
	  }
	  System.out.println(web);
//	  Assert.assertEquals(web, "Sometimes you'll see a typo, other times you won't.");
	  
  }
   
//  @AfterClass
  public void QuitBrowser() {
	  wd.quit();
  }
}
