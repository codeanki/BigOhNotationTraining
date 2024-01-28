package Training;

import java.util.Scanner;

public class PatternQuestion {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();  // Take Input equals to the count of '*'
	        for(int i=1;i<=(n+2);i++){ //linear loop to traverse                           the number of rows
	            for(int j=1;j<=(n+2);j++){ //linear loop to traverse the number of columns 
	                if(i== j){  //If the values of i and j are same,print the symbol '\' in place of '*'
	                    System.out.print('\\'); //Condition to print '\'
	                }
	                else if((n +2) -i +1 == j) {
	                	System.out.print('/');  //Condition to print '/'
	                }else {
	                	System.out.print('*');  // Else print '*' character
	                }
	            }
	            System.out.println();  //Change for the next line
	        } 
	     System.out.println();   //Change for the next line
	}
}
