package page;

import org.openqa.selenium.By;

public class HomePage {
    //顶部用户设置
    public static final By BLOG_LINK_SELECT=By.linkText("设置");
    //顶部用户消息
    public static final By BLOG_LINK_MESSAGE=By.linkText("消息");
    //顶部用户提醒
    public static final By BLOG_LINK_REMIND=By.linkText("提醒");
    //顶部退出登录
    public static final By BLOG_LINK_QUIT=By.linkText("退出");
    //搜索栏
    public static final By BLOG_LINK_SEARCH=By.id("scbar_txt");
    //默认版块
    public static final By BLOG_LINK_REFULSE=By.linkText("默认提醒");
    //我的帖子
    public static final By BLOG_LINK_MYBLOG=By.linkText("我的帖子");
    //查看新帖
    public static final By BLOG_LINK_NEWBLOG=By.linkText("查看新帖");
}
