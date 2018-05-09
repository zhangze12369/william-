package pageHelper;


import org.apache.log4j.Logger;
import page.HomePage;
import page.LoginPage;
import page.PostPage;
import page.ReplyPage;
import util.SeleniumUtil;

public class HelperLoginPage {
    public static Logger logger=Logger.getLogger(HelperLoginPage.class);
    //点击登录链接
    public static void clickLoginLink(SeleniumUtil seleniumUtil){
        seleniumUtil.click(LoginPage.LOGIN_LINK_SUBMIT);
    }
    //填写用户名
    public static void sendUser(SeleniumUtil seleniumUtil,String username){
        seleniumUtil.sendKeys(LoginPage.LOGIN_LINK_USER,username);
    }
    //填写密码
    public static void sendPwd(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.sendKeys(LoginPage.LOGIN_LINK_PWD,password);
    }
    //退出登录
    public static void clickQuit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(HomePage.BLOG_LINK_QUIT);
    }
    //点击默认版块
    public static void clickDefault(SeleniumUtil seleniumUtil){
        seleniumUtil.click(LoginPage.LOGIN_LINK_DEFAULT);
    }
    //填写发帖主题
    public static void inputTitle(SeleniumUtil seleniumUtil,String title){
        seleniumUtil.sendKeys(PostPage.POST_LINK_TITLEINPUT,title);
    }
    //填写发帖文本
    public static void inputConstent(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.sendKeys(PostPage.POST_LINK_CONSTENT,text);
    }
    //点击发表帖子按钮
    public static void clickSubmit1(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PostPage.POST_LINK_QUICKSUBMIT);
    }
    //点击跳转帖子详情左
    public static void clickView(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PostPage.POST_LINK_VIEW);
    }
    //点击跳转帖子详情from homepage
    public static void clickView2(SeleniumUtil seleniumUtil){seleniumUtil.click(ReplyPage.REPLY_LINK_VIEWFHOME);}
    //填写回复内容
    public static void inputReply(SeleniumUtil seleniumUtil,String words){
        seleniumUtil.sendKeys(ReplyPage.REPLY_LINK_INPUT,words);
    }
    //点击发表回复
    public static void clickSubmit2(SeleniumUtil seleniumUtil){
        seleniumUtil.click(ReplyPage.REPLY_LINK_SUBMIT);
    }
    //重构一个登录发帖方法
    public static void postBlog(SeleniumUtil seleniumUtil,String username,String password,String title,String text) throws InterruptedException {

        sendUser(seleniumUtil,username);
        sendPwd(seleniumUtil,password);
        clickLoginLink(seleniumUtil);
        Thread.sleep(3000);
        clickDefault(seleniumUtil);
        Thread.sleep(3000);
        inputTitle(seleniumUtil,title);
        inputConstent(seleniumUtil,text);
        Thread.sleep(3000);
        clickSubmit1(seleniumUtil);
        clickQuit(seleniumUtil);
    }
    //重构一个登录回帖方法
    public static void replyBlog(SeleniumUtil seleniumUtil,String username,String password,String words) throws InterruptedException {
        sendUser(seleniumUtil,username);
        sendPwd(seleniumUtil,password);
        clickLoginLink(seleniumUtil);
        Thread.sleep(3000);
        clickView2(seleniumUtil);//跳转成功
        inputReply(seleniumUtil,words);
        clickSubmit2(seleniumUtil);
        Thread.sleep(3000);
        clickQuit(seleniumUtil);
    }
    //重构一个登录发帖+回帖的方法
    public static void postReplyBlog(SeleniumUtil seleniumUtil,String username,String password,String title,String text,String words) throws InterruptedException {
        sendUser(seleniumUtil,username);
        sendPwd(seleniumUtil,password);
        clickLoginLink(seleniumUtil);
        Thread.sleep(3000);
        clickDefault(seleniumUtil);
        Thread.sleep(3000);
        inputTitle(seleniumUtil,title);
        inputConstent(seleniumUtil,text);
        Thread.sleep(3000);
        //提交博客
        clickSubmit1(seleniumUtil);
        Thread.sleep(3000);
        //clickView(seleniumUtil);//跳转成功
        //Thread.sleep(3000);
        inputReply(seleniumUtil,words);
        clickSubmit2(seleniumUtil);
        clickQuit(seleniumUtil);
    }

}
