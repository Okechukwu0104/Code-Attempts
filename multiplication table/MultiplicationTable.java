     public class MultiplicationTable{

	public static void main (String args[]){
	
		for (int number = 1; number<=9; number++){
		for (int count = 1; count<=9; count++){
		

		int result = number*count;
		System.out.print(count+"*"+number+"="+ result+"\t");
		
		
		}
		System.out.println();
	    }
	
	}

    }