package rahulshettyacademy;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProxySetting {

	public static void main(String[] args) {

		// Visit this website --https://chromedriver.chromium.org/capabilities

		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipadress:8080");
		options.setCapability("proxy", proxy);
		options.setAcceptInsecureCerts(true);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatim\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");

		System.out.println(driver.getTitle());

	}

}
