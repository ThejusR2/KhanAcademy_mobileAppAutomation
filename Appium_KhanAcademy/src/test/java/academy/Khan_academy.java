package academy;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;;

public class Khan_academy {
AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void BT() throws MalformedURLException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.khanacademy.android");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.khanacademy.android.ui.library.MainActivity");
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	}
	@Test
	public void tc1() throws IOException, InterruptedException {
		Thread.sleep(20000);
		driver.findElementByAndroidUIAutomator("text(\"Sign in\")").click();
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator("text(\"Continue with Google\")").click();
		Thread.sleep(10000);
		driver.findElement(MobileBy.className("android.widget.LinearLayout")).click();
		Thread.sleep(10000);
	}
	
	@Test
	public void tc2() throws InterruptedException {
		
		
		driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
		Thread.sleep(7000);
		driver.findElementByAndroidUIAutomator("text(\"Math\")").click();
		Thread.sleep(5000);
		TouchAction s1=new TouchAction(driver);
		s1.longPress(PointOption.point(893,1800)).moveTo(PointOption.point(893,340)).release().perform();
		Thread.sleep(5000);
		TouchAction s2=new TouchAction(driver);
		s2.longPress(PointOption.point(893,1800)).moveTo(PointOption.point(893,340)).release().perform();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Class 10 math (India)\")").click();
		Thread.sleep(7000);
		driver.findElementByAndroidUIAutomator("text(\"Real numbers\")").click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Intro to Euclid's division algorithm\")").click();
		Thread.sleep(8000);
//		AndroidElement t= driver.findElement(MobileBy.className("android.view.View"));
//		TouchAction s3=new TouchAction(driver);
//		s3.tap(tapOptions().withElement(element(t))).perform();
//		Thread.sleep(5000);
//		driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Pause\"]/android.widget.ImageView")).click();
//		Thread.sleep(8000);
//		AndroidElement t1= driver.findElement(MobileBy.className("android.view.View"));
//		TouchAction s4=new TouchAction(driver);
//		s4.tap(tapOptions().withElement(element(t1))).perform();
//		Thread.sleep(5000);
//		driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Play\"]/android.widget.ImageView")).click();
//		Thread.sleep(8000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	@Test
	public void tc3() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(MobileBy.xpath("(//android.widget.Button[@content-desc=\"Add Bookmark\"])[1]/android.widget.ImageView")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("android:id/button2")).click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("org.khanacademy.android:id/tab_bar_button_bookmarks")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Download bookmark\"]/android.widget.ImageView")).click();
		Thread.sleep(10000);
		driver.findElementByAndroidUIAutomator("text(\"Edit\")").click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Select bookmark\"]/android.widget.ImageView")).click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Delete\")").click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("android:id/button1")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("org.khanacademy.android:id/tab_bar_button_home")).click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
	}
	
	@Test
	public void tc4() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(MobileBy.AccessibilityId("Settings")).click();
		Thread.sleep(6000);
		driver.findElementByAndroidUIAutomator("text(\"View progress report\")").click();
		Thread.sleep(20000);
		TouchAction s6=new TouchAction(driver);
		s6.longPress(PointOption.point(809,1930)).moveTo(PointOption.point(809,520)).release().perform();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		Thread.sleep(5000);
	}
	
	@Test
	public void tc5() throws InterruptedException {
		
		TouchAction s7=new TouchAction(driver);
		s7.longPress(PointOption.point(720,1879)).moveTo(PointOption.point(720,962)).release().perform();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Sign out\")").click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("android:id/button1")).click();
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
	}
}
