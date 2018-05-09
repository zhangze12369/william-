package page;

import org.openqa.selenium.By;

public class PostPage {
    //默认版块下发帖按钮
    public static final By POST_LINK_POSTBLOG=By.id("newspecial");
    //快速发帖下主题输入框
    public static final By POST_LINK_TITLEINPUT=By.id("subject");
    //快速发帖下文章输入框
    public static final By POST_LINK_CONSTENT=By.id("fastpostmessage");
    //底部发表帖子按钮
    public static final By POST_LINK_QUICKSUBMIT=By.id("fastpostsubmit");
    //第一个笑脸
    public static final By POST_LINK_SMILE1=By.id("smilie_1");
    //默认版块下文章详情跳转按钮
    public static final By POST_LINK_VIEW=By.xpath("/html/body/div[7]/div[4]/div/div[2]/div[4]/div[2]/form/table/tbody[2]/tr/td[1]/a/img");
    //进入新版块
    public static final By POST_LINK_NEWBOARDBUTTON=By.linkText("新版块名称");
}
