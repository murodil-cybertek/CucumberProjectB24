package com.cybertek.tests;

import com.cybertek.pages.VyTrackDashboardPage;
import com.cybertek.pages.VyTrackLoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VyTrackLoginDDTTest {
    @Before
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
    }

    @After
    public void tearDown() {
        //close browser here

    }

    @Test
    public void loginDDTTest() {
       String userName = "user1";
       String password = "UserUser123";
       String firstName = "John";
       String lastName = "Doe";

       VyTrackLoginPage loginPage = new VyTrackLoginPage();
       loginPage.login(userName, password);

       VyTrackDashboardPage dashboardPage = new VyTrackDashboardPage();
       System.out.println("Full name = " + dashboardPage.fullName.getText());

       String actualFullName = dashboardPage.fullName.getText();

       if(actualFullName.contains(firstName) && actualFullName.contains(lastName)) {
           System.out.println("PASS");
       } else {
           System.out.println("FAIL");
       }

    }

}
