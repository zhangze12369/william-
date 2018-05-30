package testCase;

import com.sun.deploy.ref.Helpers;
import org.testng.annotations.Test;
import page.SearchPage;
import pageHelper.HelperLoginPage;
import pageHelper.HelperSearch;
import util.SeleniumUtil;

public class SearchTest extends BasicTestCase{
    @Test
    public void SeaechBlog () throws InterruptedException {
        //用户登录
        HelperLoginPage.sendUser(seleniumUtil,"zhangze");
        HelperLoginPage.sendPwd(seleniumUtil,"password");
        HelperLoginPage.clickLoginLink(seleniumUtil);
        //写入搜索框
        Thread.sleep(2500);
        HelperSearch.sendKeysSearch(seleniumUtil,"haotest");
        //seleniumUtil.exchangeHandle();
        HelperSearch.clickSearch(seleniumUtil);
        //进入搜索的帖子
        Thread.sleep(2500);
        seleniumUtil.exchangeHandle();
       // HelperSearch.inputSearch(seleniumUtil);
        HelperSearch.clickHaotest(seleniumUtil);
        //seleniumUtil.exchangeHandle();
        //HelperSearch.clickReturnList(seleniumUtil);
        seleniumUtil.newPage();
        seleniumUtil.assertPage(SearchPage.BLOG_LINK_TITLE,"haotest");
        HelperSearch.clickBlogQuit(seleniumUtil);





    }
}
