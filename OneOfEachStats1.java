/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int allChildren = 0;
		int families2 = 0;
		int families3 = 0;
		int families4 = 0;
		String common;
		
		for(int i=0;i<T;i++){

		String children = "";

		boolean boy = false;
		boolean girl = false;
		
		while (!(boy&&girl)) {

		int gender = (int)(Math.random()*2);

		if (gender==0) {
			children+="b";
			boy = true;
		} 
		else {
			children+="g";
			girl = true;
		}
			
		}	
		allChildren+=children.length();

		if(children.length()==2){
			families2++;
		} 
		else if(children.length()==3){
			families3++;
		} else{
			families4++;
		}

		}
		double average = (double)(allChildren)/T;

		int max = Math.max(families2,Math.max(families3, families4));

		if(max==families2){
			common = "2.";
		} else if(max==families3){
			common = "3.";
		} else{
			common = "4 or more.";
		}

		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + families2);
		System.out.println("Number of families with 3 children: " + families3);
		System.out.println("Number of families with 4 or more children: " + families4);
		System.out.println("The most common number of children is "+common);
		
	}
}
