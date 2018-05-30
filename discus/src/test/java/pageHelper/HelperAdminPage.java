package pageHelper;


import org.apache.log4j.Logger;
import page.AdminLoginPage;
import page.LoginPage;
import page.PostPage;
import util.SeleniumUtil;

public class HelperAdminPage {
    public static Logger logger=Logger.getLogger(HelperLoginPage.class);
    //管理员删除帖子
    public static void deleBlog(SeleniumUtil seleniumUtil,String text,String username,String password) throws InterruptedException {
        seleniumUtil.sendKeys(LoginPage.LOGIN_LINK_USER,username);
        seleniumUtil.sendKeys(LoginPage.LOGIN_LINK_PWD,password);
        seleniumUtil.click(LoginPage.LOGIN_LINK_SUBMIT);
         Thread.sleep(3000);
//          seleniumUtil.waitForElementLoad(LoginPage.LOGIN_LINK_DEFAULT,3000);
        HelperLoginPage.clickDefault(seleniumUtil);
        seleniumUtil.click(AdminLoginPage.ALOGIN_LINK_SELECT);
        seleniumUtil.click(AdminLoginPage.ALOGIN_LINK_DELETE);
//        seleniumUtil.sendKeys(AdminLoginPage.ALOGIN_LINK_REASON,text);
        Thread.sleep(2000);
//        seleniumUtil.waitForElementLoad(AdminLoginPage.ALOGIN_LINK_SURE,2);
        seleniumUtil.click(AdminLoginPage.ALOGIN_LINK_SURE);
    }
    //创建新的版块
    public static void createNewBoard(SeleniumUtil seleniumUtil,String password) throws InterruptedException {

        seleniumUtil.click(AdminLoginPage.ALOGIN_LINK_TOPMANAGER);
        seleniumUtil.exchangeHandle();
        seleniumUtil.sendKeys(AdminLoginPage.ALOGIN_LINK_TOPPWD,password);
        Thread.sleep(2500);
//        seleniumUtil.waitForElementLoad(AdminLoginPage.ALOGIN_LINK_TOPSUBMIT,3);
        seleniumUtil.click(AdminLoginPage.ALOGIN_LINK_TOPSUBMIT);
        Thread.sleep(6000);
        seleniumUtil.click(AdminLoginPage.ALOGIN_LINK_LUNTAN);
        seleniumUtil.switchIframe(AdminLoginPage.ALOGIN_LINK_RIGHTIFRAME);
        Thread.sleep(3000);
        seleniumUtil.click(AdminLoginPage.ALOGIN_LINK_ADDBOARD);
        seleniumUtil.click(AdminLoginPage.ALOGIN_LINK_NEWBOARDSUBMIT);
    }
    //home页面管理员退出
    public static void adminQuit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(AdminLoginPage.ALOGIN_LINK_QUIT);
    }
    //管理中心管理员退出
    public static void manAdminQuit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(AdminLoginPage.ALOGIN_LINK_MANQUIT);
    }
    //进入新版块
    public static void clickNewBoard(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PostPage.POST_LINK_NEWBOARDBUTTON);
    }
    //用户登录在新版块发帖
    public static void postNewBlog(SeleniumUtil seleniumUtil,String adminname,String adminpwd,String username,String password,String title,String text,String words) throws InterruptedException {
        HelperLoginPage.sendUser(seleniumUtil,adminname);
        HelperLoginPage.sendPwd(seleniumUtil,adminpwd);
        HelperLoginPage.clickLoginLink(seleniumUtil);
        Thread.sleep(1000);
        clickNewBoard(seleniumUtil);
        Thread.sleep(1000);
        HelperLoginPage.inputTitle(seleniumUtil,title);
        HelperLoginPage.inputConstent(seleniumUtil,text);
        Thread.sleep(1000);
        //提交博客
        HelperLoginPage.clickSubmit1(seleniumUtil);
        Thread.sleep(1000);
        //clickView(seleniumUtil);//跳转成功
        //Thread.sleep(3000);
        HelperLoginPage.inputReply(seleniumUtil,words);
        HelperLoginPage.clickSubmit2(seleniumUtil);
        adminQuit(seleniumUtil);
    }
    //
}
