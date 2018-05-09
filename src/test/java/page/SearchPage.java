package page;

import org.openqa.selenium.By;

public class SearchPage {
    //搜索输入框
    public static final By HOME_LINK_SEARCH=By.id("scbar_txt");
    //搜索按钮
    public static final By HOME_LINK_SEASUBMIT=By.id("scbar_btn");
    //搜索结果页面
    public static final By SHOW_LINK_RESULT=By.linkText("haotest");
    //博客详情页标题
    public static final By BLOG_LINK_TITLE=By.id("thread_subject");

}
