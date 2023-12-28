package org.Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.*;

public class LaunchApps {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		//UiAutomator2 options - class object creation
		UiAutomator2Options ui = new UiAutomator2Options();
		ui.setCapability("deviceName", "Pixel 6a");
		ui.setCapability("app", "D:\\ApiDemos-debug.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),ui);
		//driver.quit();
		
		
	}

}
