package Testngtutorial;

import org.testng.annotations.DataProvider;

public class CutsomDataProvider {
    @DataProvider(name="logindata")
    public Object[][] getData()
    {
        Object[][] data={{"sud","123"},{"chandra","456"}};
        return data;

    }
}
