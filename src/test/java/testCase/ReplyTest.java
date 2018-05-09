package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;

public class ReplyTest extends BasicTestCase{
    @Test
    public void replyBlog() throws InterruptedException {
        HelperLoginPage.replyBlog(seleniumUtil,"zhangze","password","这是一首简单的小情歌！！！");
    }
}
