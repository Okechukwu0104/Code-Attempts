    public class DividedBy3or4{
	public static void main (String args[]){

	int counter = 0;
	    for(int count = 100; count <=200; count++ ){
		if(count %3==0 || count %4==0 && count <=200){
		System.out.println(count);
		    counter++;	
		}
		
	if(counter%10 == 1)System.out.println(" ");
		
		
		
	    }
		


	}


    }