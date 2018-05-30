package page;

import org.openqa.selenium.By;

public class SearchPage {
    //搜索输入框
    public static final By HOME_LINK_SEARCH=By.id("scbar_txt");
    //搜索按钮
    public static final By HOME_LINK_SEASUBMIT=By.id("scbar_btn");
    //搜索结果页面
    public static final By SHOW_LINK_RESULT=By.xpath("//*[@id=\"45\"]/h3/a");
    //博客详情页标题
    public static final By BLOG_LINK_TITLE=By.className("ts");
    //搜索结果页面搜索输入框
    public static final By SHOW_LINK_INPUTSEARCH=By.id("scform_srchtxt");
    //返回列表按钮
    public static final By BLOG_LINK_RETURNLIST=By.linkText("返回列表");
    //博客页面退出登录按钮
    public static final By BLOG_LINK_QUIT=By.xpath("//*[@id=\"um\"]/p[1]/a[4]");
}
