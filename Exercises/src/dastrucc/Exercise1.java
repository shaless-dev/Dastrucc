package dastrucc;

class Exercise1 {
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5,6,8,7,9,10};
		for (int x = 0; x < myArray.length; x++) {
			}
			//largest value
			int max = myArray[0];
			for (int x= 0; x < myArray.length; x++) {
				if (myArray[x] > max) max = myArray[x];
			}
			System.out.println("Largest is " + max);
			//smallest value
			int min = myArray[0];
			
			for (int x= 0; x > myArray.length; x++) {
				if (myArray[x] > min) min = myArray[x];
			}
			System.out.println("Smallest is " + min);
			//sum of all array elements
			
			int total = 0;
			for(int x = 0; x < myArray.length; x++) {
				total += myArray[x];
			}
			System.out.println("Total is " + total);
			//ascending order
			System.out.println("Ascending:");
			for (int x = 0; x < myArray.length - 1; x++) {
	           for (int j = x + 1; j < myArray.length; j++){
	        	   if(myArray[x] > myArray[j]) {
	        		   int temp = myArray[x];
	        		   myArray[x] = myArray[j];
	        		   myArray[j] = temp;
	        	   }
	           }
			}
			
			for(int i = 0;i < myArray.length;i++) {
				System.out.print("[" + myArray[i] + "]");
			}
			//descending order
			System.out.println(" "); 
			System.out.println("Descending:");
			for (int x = 0; x < myArray.length - 1; x++) {
		           for (int j = x + 1; j < myArray.length; j++){
		        	   if(myArray[x] < myArray[j]) {
		        		   int temp = myArray[x];
		        		   myArray[x] = myArray[j];
		        		   myArray[j] = temp;
		        	   }
		           }
				}
				
				for(int i = 0;i < myArray.length;i++) {
					System.out.print("[" + myArray[i] + "]");
				}
			//average of array elements
	        System.out.println("");
	            double average = (double) total / myArray.length; 
	            System.out.println("Average is " + average);
			}
	}
