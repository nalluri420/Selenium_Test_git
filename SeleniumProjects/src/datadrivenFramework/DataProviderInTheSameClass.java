package datadrivenFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInTheSameClass {
	
 @Test( dataProvider = "data-proider")
   public void testMethod(String param) 
{
	
	System.out.println(param);
	
}
	
@DataProvider(name="data-proider")
public Object[][] dataProviderMethod()
{
	
	return new Object[][] 
			{
		{"first set of data"},{"second set of daata"}
			
			};
	
}
}
