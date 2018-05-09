package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;

public class PostBlog extends BasicTestCase{
    @Test
    public void postBlog() throws InterruptedException {
        Thread.sleep(3000);
        HelperLoginPage.postReplyBlog(seleniumUtil,"zhangze","password","haotest haotest!!","estNG是一个设计用来简化广泛的测试需求的测试框架，从单元测试（隔离测试一个类）到集成测试（测试由有多个类多个包甚至多个外部框架组成的整个系统，例如运用服务器。","org.openqa.selenium.NoSuchSessionException: Session ID is null.");

    }
}
