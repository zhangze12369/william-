package page;

import org.openqa.selenium.By;

public class LoginPage {
    //顶部登录按钮
    public static final By LOGIN_LINK_SUBMIT=By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]/button");
    //顶部用户名输入框
    public static final By LOGIN_LINK_USER=By.id("ls_username");
    //顶部密码输入框
    public static final By LOGIN_LINK_PWD=By.id("ls_password");
    //顶部找回密码
    public static final By LOGIN_LINK_BACKPWD=By.linkText("找回密码");
    //顶部注册按钮
    public static final By LOGIN_LINK_REGIST=By.linkText("立即注册");
    //登录页默认版块
    public static final By LOGIN_LINK_DEFAULT=By.linkText("默认版块");
    //登录页查看新帖链接
    public static final By LOGIN_LINK_NEWBLOG=By.linkText("查看新帖");
}
