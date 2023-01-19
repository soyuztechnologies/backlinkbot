package anubhavtrainings.apk.Backlinkbot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {
	public static WebDriver getBrowserInstance(String currentDirectory, String browserName) {
		WebDriver driver = null;
		if(browserName == "firefox") {
			System.setProperty("webdriver.gecko.driver", currentDirectory + "\\files\\webdrivers\\geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("marionatte", false);
			options.merge(dc);
			options.setProfile(createFirefoxProfile());
			options.setAcceptInsecureCerts(false);
			driver = new FirefoxDriver();
		}
		else if (browserName == "IE") {
				System.setProperty("webdriver.ie.driver",currentDirectory + "\\files\\webdrivers\\IEDriverServer.exe");
				//FirefoxOptions options = new InternetExplorerDriver();
				//options.setProfile(createFirefoxProfile());
				driver = new InternetExplorerDriver();
				//System.out.println("driver path"+driver);
		}else {
			
			System.setProperty("webdriver.chrome.driver", currentDirectory + "\\files\\webdrivers\\chromedriver.exe");
			//ChromeOptions options = new ChromeOptions();
            //options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
			/*ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);*/
            driver = new ChromeDriver();
            System.out.println(System.setProperty("webdriver.chrome.driver", currentDirectory + "\\files\\webdrivers\\chromedriver.exe"));
		}
		
        return driver;
	}
	private static FirefoxProfile createFirefoxProfile() {
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("capability.policy.default.HTMLDocument.readyState", "allAccess");
        profile.setPreference("capability.policy.default.HTMLDocument.compatMode", "allAccess");
        profile.setPreference("capability.policy.default.Document.compatMode", "allAccess");
        profile.setPreference("capability.policy.default.Location.href", "allAccess");
        profile.setPreference("capability.policy.default.Window.pageXOffset", "allAccess");
        profile.setPreference("capability.policy.default.Window.pageYOffset", "allAccess");
        profile.setPreference("capability.policy.default.Window.frameElement", "allAccess");
        profile.setPreference("capability.policy.default.Window.frameElement.get", "allAccess");
        profile.setPreference("capability.policy.default.Window.QueryInterface", "allAccess");
        profile.setPreference("capability.policy.default.Window.mozInnerScreenY", "allAccess");
        profile.setPreference("capability.policy.default.Window.mozInnerScreenX", "allAccess");
        return profile;
    }
}
