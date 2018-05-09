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
    public static void getBlogTitle(SeleniumUtil seleniumUtil){
        seleniumUtil.getText(SearchPage.BLOG_LINK_TITLE);
    }
    //比对帖子标题和期望值是否相同
    public static void compareTitle(SeleniumUtil seleniumUtil,String expected){

    }
}
