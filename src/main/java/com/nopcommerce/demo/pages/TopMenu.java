package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
public class TopMenu extends Utility {

/**
 *
 * 1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
 * 1.2 This method should click on the menu whatever name is passed as parameter.
 * 1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
 *       select the Menu and click on it and verify the page navigation.
 */

    By computerLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");


    public void selectMenu(String menu){

    }

    public void clickOnComputer(){
        clickOnElement(computerLink);
    }

      public void currentUrl(){
        driver.getCurrentUrl();
      }

   // String expectedPage = "https://demo.nopcommerce.com/computers";
  //  String actualPage =   topMenu.currentUrl();
  //  Assert.assertEquals(expectedPage,actualPage, "Does not navigate");


}
