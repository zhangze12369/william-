package util;


import com.sun.org.apache.bcel.internal.generic.Select;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.Set;

import static java.lang.Thread.sleep;

public class SeleniumUtil {
    //引入日志
    private static Logger logger=Logger.getLogger(SeleniumUtil.class);
    WebDriver webDriver=null;
//获得浏览器驱动
    public WebDriver getWebDriver(String dType){
        if (dType.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "D:\\haotest\\maven-3.0.5\\chromedriver.exe");
            webDriver= new ChromeDriver();
            logger.info("使用谷歌浏览器");

        }else if (dType.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "D:\\haotest\\maven-3.0.5\\geckodriver.exe");
            webDriver=new FirefoxDriver();
            logger.info("使用火狐浏览器");
        }else {
            logger.error("找不到目标浏览器，请检查！");
        }
        return webDriver;
    }
    //查找元素
    public WebElement findElement(By by){
        WebElement webElement=null;
        try {
            webElement=webDriver.findElement(by);
            logger.info("成功定位元素"+webElement);
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.error("未找到元素!");
        }
        return webElement;
        }
        //打开目标网页
        public void geturl(String geturl) {
            webDriver.get(geturl);
            logger.info("成功打开网页"+geturl);
        }
    //点击操作
     public void click(By by){
        WebElement webElement=webDriver.findElement(by);
         try{
             webElement.click();
             logger.info("点击成功"+webElement);
         }catch (Exception e){
             logger.error("点击操作失败"+webElement);
         }
     }
     //输入内容
     public void sendKeys(By by,String words){
        WebElement webElement=webDriver.findElement(by);
        webElement.clear();
        try{webElement.sendKeys(words);
            logger.info("输入"+words+"成功！");
        }catch (Exception e){
            logger.error("输入"+words+"失败！");
        }
    }

    //获取定位的元素内容
    public String getLocatorByElement(WebElement webElement,String exceptword){
        String words=webElement.toString();
        String except=null;
        try{
            except=words.substring(words.indexOf(exceptword)+1,words.length()-1);
        }catch (Exception e){e.printStackTrace();}
        logger.error("寻找目标字段失败"+exceptword);
        return except;
    }
        //比对与预期是否一致
//        public  boolean compareSure(By by,String exceptword){
//                WebElement webElement=webDriver.findElement(by);
//                 SeleniumUtil seleniumUtil=new SeleniumUtil();
//                 seleniumUtil.getLocatorByElement(webElement,exceptword);
//                 if ()
//        }


    /**根据顶部title判断当前页面是否是预期页面*/
    public void assertPage(By by,String expected) throws InterruptedException {
        sleep(2);
        String actual = getText(by);
        try{
            Assert.assertEquals(actual, expected);
        } catch (AssertionError e){
            logger.error("预期文字是：["+expected+"],但实际文字是: ["+actual+"]");
            Assert.fail("预期文字是：["+expected+"],但实际文字是: ["+actual+"]");
        }
        logger.info("找到了对应title，当前页面正确：【"+actual+"】");
    }

    //清除目标元素内容
    public void clear(By by){
        WebElement webElement=webDriver.findElement(by);
        try {
            webElement.clear();
            logger.info("成功清除"+getLocatorByElement(webElement,">"));
        }catch (Exception e){
            e.printStackTrace();
            logger.error("内容清除失败");
        }
    }
    //获取控件内容
    public String getText(By by){
        WebElement webElement=webDriver.findElement(by);
        String words=webElement.getText();
        logger.info("获取内容成功"+getLocatorByElement(webElement,">"));
        return  words;
    }

    //点击弹窗确认
    public void clickAlert(Alert alert){
        alert.accept();
        logger.info("提交弹窗内容成功"+alert.getText());
    }

    //在弹窗中填写内容
    public void sendKeysAlert(Alert alert,String text){
        alert.sendKeys(text);
        logger.info("弹窗内容填写成功"+text);
    }

    //下拉框的选择
//    public void selectSel(Select select,By by){
//        WebElement webElement=webDriver.findElement(by);
//
//        }
//    }
    /**设置显示等待元素,默认10秒*/
    public void waitForElementLoad(By by, int i){
        waitForElementLoad(by, 5);
    }
    //切换iframe
        public void switchIframe(By by){
            WebElement iframeEle=webDriver.findElement(by);
            webDriver.switchTo().frame(iframeEle);
            logger.info("成功跳转"+iframeEle+"的iframe");
        }
        public void defalutIframe(){
        webDriver.switchTo().defaultContent();
            logger.info("成功跳转原iframe");
        }




    //切换句柄
    public void exchangeHandle(){
        String homeHandle = webDriver.getWindowHandle();
        for (String newHandle:webDriver.getWindowHandles()){
            if (newHandle.equals(homeHandle)){
                continue;
            }
            webDriver.switchTo().window(newHandle);
            break;
        }
    }

    //设置等待时间
//    public void waitForElementLoad(final By by,int timeOut){
//        logger.info("开始查找元素："+by);
//        WebDriverWait wait=new W
//    }

}
