package com.spartaglobal.ITVPipeline;

import com.spartaglobal.ITVPipeline.Pages.ITVHomepage;
import com.spartaglobal.ITVPipeline.Pages.ITVSignin;
import org.openqa.selenium.WebDriver;

public class ITVSite {
    private WebDriver driver;
    private ITVHomepage itvHomepage;
    private ITVSignin itvSignin;


   public ITVSite(WebDriver driver) {
       this.driver = driver;

       this.itvHomepage = new ITVHomepage(driver);
       this.itvSignin = new ITVSignin(driver);
   }

   public ITVHomepage itvHomepage(){
       return itvHomepage.goToHomepage();
   }

   public ITVSignin itvSignin(){
       return itvSignin;
   }
}
