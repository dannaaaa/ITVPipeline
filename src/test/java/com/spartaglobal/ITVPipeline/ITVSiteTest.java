package com.spartaglobal.ITVPipeline;

import static org.junit.Assert.assertTrue;

import com.spartaglobal.ITVPipeline.SeleniumConfig.SeleniumConfig;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ITVSiteTest {

    private static ITVSite itvSite;

    @BeforeClass
    public static void setup(){
        //Enter your own driver path and remember to change it before running tests
        SeleniumConfig chromeDriverConfig = new SeleniumConfig("chrome", "chromedriver");
        itvSite = new ITVSite(chromeDriverConfig.getDriver());

        itvSite.itvHomepage();
     //   itvSite.itvSignin().clickOnSignin();

    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
