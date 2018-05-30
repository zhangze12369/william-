package pageHelper;

import page.SearchPage;
import util.SeleniumUtil;

public class HelperSearch {
    //搜索框写入文字
    public static void sendKeysSearch(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.sendKeys(SearchPage.HOME_LINK_SEARCH,text);
    }
    //点击搜索按钮
    public static void clickSearch(SeleniumUtil seleniumUtil){
        seleniumUtil.click(SearchPage.HOME_LINK_SEASUBMIT);
    }
    //进入搜索结果具有关键字的帖子
    public static void clickHaotest(SeleniumUtil seleniumUtil){
        seleniumUtil.click(SearchPage.SHOW_LINK_RESULT);
    }
    //获取博客详情页的标题
    public static String getBlogTitle(SeleniumUtil seleniumUtil){
        seleniumUtil.getText(SearchPage.BLOG_LINK_TITLE);
        String title=HelperSearch.getBlogTitle(seleniumUtil);
        return title;
    }
    //在搜索结果页面搜索框输入
    public static void inputSearch(SeleniumUtil seleniumUtil){
        seleniumUtil.sendKeys(SearchPage.SHOW_LINK_INPUTSEARCH,"haotest");
    }
    //点击返回列表
    public static void clickReturnList(SeleniumUtil seleniumUtil){
        seleniumUtil.click(SearchPage.BLOG_LINK_RETURNLIST);
    }
    //退出博客详情页的登录
    public static void clickBlogQuit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(SearchPage.BLOG_LINK_QUIT);
    }


}
