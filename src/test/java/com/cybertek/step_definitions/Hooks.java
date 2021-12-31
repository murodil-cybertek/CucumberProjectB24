package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
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

    @After
    public void tearDownScenario(Scenario scenario) {
        /**
         * Scenario scenario: represents current running cucumber scenario
         * -cast webdriver to TakesScreenshot interface.(TakesScreenshot)Driver.getDriver()
         * -call getScreenShotAs method and output type as OutputType.BYTES
         * -save the result into byte[] array: byte[] image
         * -attach the image into the scenario html report: scenario.attach(image, "image/png", scenario.getName());
         */
        byte[] image=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(image, "image/png", scenario.getName());

        System.out.println("AFTER - tearDown method is running after the scenario:" + scenario.getName());
        Driver.closeDriver();
    }

}
