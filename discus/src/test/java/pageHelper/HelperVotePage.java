package pageHelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import page.VotePage;
import util.SeleniumUtil;

import java.util.List;


public class HelperVotePage {
    public static Logger logger=Logger.getLogger(SeleniumUtil.class);
    public static void publishVoit(SeleniumUtil seleniumUtil){
//        seleniumUtil.mousePerform(seleniumUtil.getElement(VotePage.PUBLISH_FVOTE));
    }
    public static void publishVoit1(SeleniumUtil seleniumUtil){
//        seleniumUtil.mouseclick(seleniumUtil.getElement(VotePage.PUBLISH_VOTE));
    }
    public static void title(SeleniumUtil seleniumUtil,String text){
//        seleniumUtil.sendKeys(seleniumUtil.getElement(VotePage.INPUT_TITLE),text);
    }
    public static void voteChiose(SeleniumUtil seleniumUtil,String count){
        int i=1;
        for(WebElement vote:seleniumUtil.getElements(VotePage.INPUT_VOTE)){
            if(i<=3) {
                vote.sendKeys(count + i);
                i++;
            }else{
                break;
            }
        }
    }
//    public static void postText(SeleniumUtil seleniumUtil,String article){
//        seleniumUtil.sendKeys(seleniumUtil.getElement(VotePage.INPUT_TEXTARER),article);
//    }
//    public static void postSubmit(SeleniumUtil seleniumUtil){
//        seleniumUtil.click(seleniumUtil.getElement(VotePage.POST_SUBMIT));
//    }
//    public static void postRedio(SeleniumUtil seleniumUtil){
//        seleniumUtil.click(seleniumUtil.getElement(VotePage.BUTTON_REDIO));
//    }
//    public static void pollSubmit(SeleniumUtil seleniumUtil){
//        seleniumUtil.click(seleniumUtil.getElement(VotePage.POLL_SUBMIT));
//    }
//    public static void getOpptionvalue(SeleniumUtil seleniumUtil){
//        seleniumUtil.getText(seleniumUtil.getElement(VotePage.POLL_OPPTION_VOTE));
//    }
//    public static void getTitlevalue(SeleniumUtil seleniumUtil,String value){
//        seleniumUtil.assertPage(seleniumUtil.getText(seleniumUtil.getElement(VotePage.TITLE_NAME)),value);
//    }
//    public static void project(SeleniumUtil seleniumUtil,String text,String count,String article,String value){
//        seleniumUtil.waitForElementLoad(VotePage.PUBLISH_FVOTE,10);
//     publishVoit(seleniumUtil);
//        seleniumUtil.waitForElementLoad(VotePage.PUBLISH_VOTE,10);
//        publishVoit1(seleniumUtil);
//        seleniumUtil.waitForElementLoad(VotePage.INPUT_TITLE,10);
//        title(seleniumUtil,text);
//        seleniumUtil.waitForElementLoad(VotePage.INPUT_VOTE,10);
//        voteChiose(seleniumUtil,count);
//        seleniumUtil.waitForElementLoad(VotePage.INPUT_TEXTARER,10);
//        postText(seleniumUtil,article);
//        seleniumUtil.waitForElementLoad(VotePage.POST_SUBMIT,10);
//        postSubmit(seleniumUtil);
//        seleniumUtil.waitForElementLoad(VotePage.BUTTON_REDIO,10);
//        postRedio(seleniumUtil);
//        seleniumUtil.waitForElementLoad(VotePage.POLL_SUBMIT,10);
//        pollSubmit(seleniumUtil);
//        seleniumUtil.waitForElementLoad(VotePage.POLL_OPPTION_VOTE,10);
//        getOpptionvalue(seleniumUtil);
//        seleniumUtil.waitForElementLoad(VotePage.TITLE_NAME,10);
//        getTitlevalue(seleniumUtil,value);
//
//    }
//

}
