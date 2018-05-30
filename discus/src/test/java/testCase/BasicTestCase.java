package testCase;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageHelper.HelperLoginPage;
import util.LogConfiguration;
import util.ReadBrowserProperties;
import util.SeleniumUtil;

import java.io.IOException;


public class BasicTestCase {
    public WebDriver driver;
    public SeleniumUtil seleniumUtil;
    ReadBrowserProperties properties=null;
    @BeforeMethod
    public void setUpTest() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\haotest\\maven-3.0.5\\chromedriver.exe");
        //加载日志文件的配置
        LogConfiguration logconfig=new LogConfiguration();
        logconfig.initLog();
        seleniumUtil=new SeleniumUtil();
        properties=new ReadBrowserProperties();
        String dType=properties.readBrowser();
        driver=seleniumUtil.getWebDriver(dType);
        String URL=properties.URL;
        seleniumUtil.geturl(URL);
        driver.manage().window().maximize();
//        BrowserConfig browser=new BrowserConfig();
//        driver=browser.getBrowser();
//        BrowserConfig serverURL=new BrowserConfig();
//        seleniumUtil.url(serverURL);
    }
    @AfterMethod
    public void tearTest() throws InterruptedException {
        Thread.sleep(2000);
//        driver.quit();

    }
}
