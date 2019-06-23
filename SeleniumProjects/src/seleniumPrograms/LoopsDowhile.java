package seleniumPrograms;

public class LoopsDowhile {
	
	public void forloop() {
		
		for(int z=0; z < 15; z=z+2) {
			
			System.out.println("for..loop:.....Value of z: "+z);
			System.out.print("\n");
			
			
			
		}
		
		
	}
	
	public void doWhile() {
	 int y = 10;
	 do {
		 System.out.println(" In do...while : Value of y: "+y);
		 y++;
		 System.out.print("\n");
		 			 
	 }while(y<15);
		
	}
	
	
	

	public static void main(String[] args) {
		int x = 10;
		while (x < 15 ) {
		System.out.println("Value of x: "+ x);	
		x++;
		System.out.print("\n");
		}
		
		LoopsDowhile dowhileTest = new LoopsDowhile();
		
		dowhileTest.doWhile();
		dowhileTest.forloop();
		
	}

}
