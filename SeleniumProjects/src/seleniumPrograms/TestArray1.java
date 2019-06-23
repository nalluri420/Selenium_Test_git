package seleniumPrograms;

public class TestArray1 {

	public static void main(String[] args) {
		double[]myList =  {1.9,2.9,3.4,3.5 };
		
		for(int i=0; i < myList.length; i++) {
			
			System.out.println(myList[i]+" ");
			//Summing all element
			
		}
		System.out.print("=============");
		System.out.print("\n");
		
		double total = 0;
		for(int i=0; i<myList.length; i++) {
			total += myList[i];
			
		}
		
		System.out.println("Max is "+total);
		
	}

	
	
	
}
