package page;

import org.openqa.selenium.By;

public class ReplyPage {
    //查看最新的帖子
    public static final By REPLY_LINK_NEWBIOG=By.linkText("强的一批！");
    //右方点击帖子详情页面from page
    public static final By REPLY_LINK_VIEWFHOME=By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[4]/div/a");
    //下方回复文本输入框
    public static final By REPLY_LINK_INPUT=By.name("message");
    //下方发表回复按钮
    public static final By REPLY_LINK_SUBMIT=By.id("fastpostsubmit");
    //返回列表
    public static final By REPLY_LINK_RETURN=By.linkText("返回列表");
}
