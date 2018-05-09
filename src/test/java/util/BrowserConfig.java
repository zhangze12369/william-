package util;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.*;
import java.util.Properties;

//失败的
public class BrowserConfig {
    public WebDriver driver;
    public String browserName;
    public String serverURL;
        private static Logger logger=Logger.getLogger(BrowserConfig.class);
    public WebDriver getBrowser(){
        try{
            Properties properties = new Properties();
            String filePath = "./ConfigBroser.properties";
            InputStream ips =new FileInputStream(filePath);
            properties.load(ips);
            browserName = properties.getProperty("browserName");
            serverURL = properties.getProperty("URL");
            ips.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        if(browserName.equals("Firefox")){
            System.setProperty("webdriver.gecko.driver", "D:\\haotest\\maven-3.0.5\\geckodriver.exe");
            driver = new FirefoxDriver();
            logger.info("加载火狐浏览器成功！");
        }else if(browserName.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver", "D:\\haotest\\maven-3.0.5\\chromedriver.exe");
            driver = new ChromeDriver();
            logger.info("加载谷歌浏览器成功！");
        }

        driver.get(serverURL);
        logger.info("进入"+serverURL);
        driver.manage().window().maximize();
        return driver;
    }

}
