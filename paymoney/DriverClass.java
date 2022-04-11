package paymoney;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction");
		int size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the values of the array");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNo=sc.nextInt();
		 Transaction transaction= new Transaction();
		 while(targetNo !=0) {
			
			 	System.out.println("Enter the value of the target");
				int target= sc.nextInt();
				int result= transaction.achievableTarget(target, arr);
				if(result>0) {
				System.out.println("Target achieved after "+result+ " transactions");
				}else {
				System.out.println("Given target is not achieved");
				}
				targetNo--;	
				}
			
				}
			}


