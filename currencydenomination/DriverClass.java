package currencydenomination;

import java.util.Scanner;

public class DriverClass {

	
	public static void main(String[] args) {
		int amount = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int noOfDenominations= s.nextInt();
		int[] currencyDenominations = new int[noOfDenominations];
		System.out.println("enter the currency denominations value");
    	int dCounter = 0;
		while(dCounter < noOfDenominations) {
			int dInput = s.nextInt();
			if(dInput > 0) {
				currencyDenominations[dCounter] = dInput;				
			} else {
				dCounter--;
			}
			dCounter++;
		}
		do {
			System.out.println("Enter Payable Amount");
			amount = s.nextInt();
		} while(amount < 1);
		
		QuickSort quickSort = new QuickSort();
		quickSort.sort(currencyDenominations, 0, currencyDenominations.length - 1);
		
		int dCounterTwo = currencyDenominations.length - 1;
		while(dCounterTwo >= 0) {
			int tempCounter = 0;
			if(amount >= currencyDenominations[dCounterTwo]) {
				tempCounter = amount/currencyDenominations[dCounterTwo];
				amount -= (tempCounter * currencyDenominations[dCounterTwo]); 
				
			}
			if(tempCounter != 0) {
				System.out.println(currencyDenominations[dCounterTwo]+" : " +tempCounter);
			}
			
			dCounterTwo--;
		}
	}

}
