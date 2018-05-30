package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageHelper.HelperAdminPage;
import pageHelper.HelperLoginPage;

public class ManagerTest extends BasicTestCase{
        @Test
        public void deleBlog() throws InterruptedException {
            HelperAdminPage.deleBlog(seleniumUtil,"一农冬日逢一蛇，疑其僵，乃拾之入怀，以己之体暖之。蛇大惊，乃苏，以其本能故，以利齿啮农，竟杀之。农濒死而悔曰：“吾欲行善，然以学浅故，竟害己命，而遭此恶报哉。","admin","password");
           //创建新版块
            HelperAdminPage.createNewBoard(seleniumUtil,"password");
            seleniumUtil.defalutIframe();
            //管理中心退出
            HelperAdminPage.manAdminQuit(seleniumUtil);
            //管理员退出
            HelperAdminPage.adminQuit(seleniumUtil);
            //普通用户登录
            Thread.sleep(3000);
            HelperLoginPage.postReplyBlog(seleniumUtil,"zhangze","password","haotest haotest!!","estNG是一个设计用来简化广泛的测试需求的测试框架，从单元测试（隔离测试一个类）到集成测试（测试由有多个类多个包甚至多个外部框架组成的整个系统，例如运用服务器。","org.openqa.selenium.NoSuchSessionException: Session ID is null.");

            }
}
