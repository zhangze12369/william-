package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperAdminPage;

public class ManagerTest extends BasicTestCase{
        @Test
        public void deleBlog() throws InterruptedException {
            HelperAdminPage.deleBlog(seleniumUtil,"一农冬日逢一蛇，疑其僵，乃拾之入怀，以己之体暖之。蛇大惊，乃苏，以其本能故，以利齿啮农，竟杀之。农濒死而悔曰：“吾欲行善，然以学浅故，竟害己命，而遭此恶报哉。","admin","password");
           //创建新版块
            HelperAdminPage.createNewBoard(seleniumUtil,"password");


            }
}
