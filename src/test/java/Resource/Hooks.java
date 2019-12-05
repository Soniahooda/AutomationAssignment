package Resource;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import utils.Driver;

public class Hooks {

    Driver driver= new Driver();

    @Before
    public void LaunchBrowser() throws Exception {
        driver.initializeBrowser();
    }

    @After
    public void teardown() throws Exception {

        driver.closeDriver();
    }
}
