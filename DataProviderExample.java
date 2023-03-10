package Testngtutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderExample {
    @Test(dataProvider ="logindata",dataProviderClass =CutsomDataProvider.class )
    public void loginTest(String name,String password)
    {
        System.out.println("name is"+name+" "+"passsword is"+password  );


    }



}
