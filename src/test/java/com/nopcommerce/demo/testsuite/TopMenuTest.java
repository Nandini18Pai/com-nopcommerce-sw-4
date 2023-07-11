package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenu;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    TopMenu topMenu = new TopMenu();

    @Test
    public void verifyPageNavigation() {
        topMenu.selectMenu("Computer");
        topMenu.clickOnComputer();


      //  String expectedPage = "https://demo.nopcommerce.com/computers";
     //   String actualPage = topMenu.currentUrl();
      //  Assert.assertEquals(expectedPage,actualPage, "Does not navigate");

    }


}
