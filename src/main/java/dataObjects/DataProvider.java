package dataObjects;

public class DataProvider {

    public String Mail = ""+(int)(Math.random()*Integer.MAX_VALUE)+"@gmail.com";

    @org.testng.annotations.DataProvider(name = "dataMethod")
    public  Object[][] dataProviderMethod() {
        return new Object[][]
                {
                        { "irakli", "bla@gmail.com"},
                        { "giorgi","ffaaa@gmail.com",},
                };
    }
}