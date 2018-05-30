package page;

import org.openqa.selenium.By;

public class AdminLoginPage {

    //删除帖子的选择框
    public static final By ALOGIN_LINK_SELECT=By.name("moderate[]");
    //弹出框的删除
    public static final By ALOGIN_LINK_DELETE=By.xpath("//*[@id=\"mdly\"]/p[1]/strong[1]/a");
    //删除原因文本框
    public static final By ALOGIN_LINK_REASON=By.id("reason");
    //确定删除帖子按钮
    public static final By ALOGIN_LINK_SURE=By.name("modsubmit");
    //管理中心
    public static final By ALOGIN_LINK_TOPMANAGER=By.linkText("管理中心");
    //管理面板
    public static final By ALOGIN_LINK_MANAGER=By.linkText("管理面板");
    //管理面板密码输入框
    public static final By ALOGIN_LINK_PASSWD=By.id("cppwd");
    //管理中心退出管理员登录
    public static final By ALOGIN_LINK_MANQUIT=By.xpath("//*[@id=\"frameuinfo\"]/p[1]/a");
    //home页管理员退出
    public static final By ALOGIN_LINK_QUIT=By.xpath("//*[@id=\"um\"]/p[1]/a[6]");
    //管理中心的密码登录（新页面）
    public static final By ALOGIN_LINK_TOPPWD=By.name("admin_password");
    //管理中心登录页面的提交按钮（新页面）
    public static final By ALOGIN_LINK_TOPSUBMIT=By.name("submit");
    //新页面版块管理（新页面）
    public static final By ALOGIN_LINK_BOARDMANAGE=By.xpath("//*[@id=\"menu_index\"]/li[3]/a");
    //添加新版块（新页面）
    public static final By ALOGIN_LINK_ADDBOARD=By.xpath("//*[@id=\"cpform\"]/table/tbody[3]/tr/td[2]/div/a");
    //新版块名称输入框（新页面）
    public static final By ALOGIN_LINK_BOARDNAME=By.name("name[3]");
    //创建新版块提交（新页面）
    public static final By ALOGIN_LINK_NEWBOARDSUBMIT=By.id("submit_editsubmit");
    //新页面右侧iframe（新页面）
    public static final By ALOGIN_LINK_RIGHTIFRAME=By.id("main");
    //管理中心论坛按钮（新页面）
    public static final By ALOGIN_LINK_LUNTAN=By.linkText("论坛");


}
