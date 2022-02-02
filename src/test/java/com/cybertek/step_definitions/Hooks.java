package com.cybertek.step_definitions;

import com.cybertek.utilities.DBUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * similar to TestBase.java in TestNG framework
 * We open close browsers here etc.
 *
 */
public class Hooks {

    @Before()
    public void setUpScenario() {
        System.out.println("BEFORE - setUp method is running before the scenario ");
    }

    @Before("@db")
    public void setUpDb() {
        System.out.println("Setting up database connection");
        DBUtils.createConnection();
    }

    @After("@db")
    public void teardownDb() {
        System.out.println("Closing database connection");
        DBUtils.destroy();
    }

    @After
    public void tearDownScenario(Scenario scenario) {
        /**
         * Scenario scenario: represents current running cucumber scenario
         * -cast webdriver to TakesScreenshot interface.(TakesScreenshot)Driver.getDriver()
         * -call getScreenShotAs method and output type as OutputType.BYTES
         * -save the result into byte[] array: byte[] image
         * -attach the image into the scenario html report: scenario.attach(image, "image/png", scenario.getName());
         * -if scenario fails for any reason, it will automatically take a screenshot and attach to html report
         */
        if(scenario.isFailed()) {
            byte[] image = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(image, "image/png", scenario.getName());
        }

        System.out.println("AFTER - tearDown method is running after the scenario:" + scenario.getName());
        //Driver.closeDriver();
    }

    /**
     * @AfterStep - runs after each scenario step
     * -takes screenshot and attaches to the report for each step
     * -normally not needed but your project might require at some point.
     * @param scenario


    @AfterStep()
    public void tearDownStep(Scenario scenario) {
        byte[] image=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(image, "image/png", scenario.getName());
    }

     */

}
