
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean boy = false;
		boolean girl = false;
		int numOfChildren = 0;
		
		while (!(boy&&girl)) {
		numOfChildren++;	
		int gender = (int)(Math.random()*2);

		if (gender==0) {
			System.out.print("b ");
			boy = true;
		} 
		else {
			System.out.print("g ");
			girl = true;
		}
			
		}
		System.out.println();
		System.out.println("You made it... and you now have " + numOfChildren + " children.");
	}
}
