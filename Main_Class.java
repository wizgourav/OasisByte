package ATM_Machine;

import java.util.Scanner;

public class Main_Class {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ATMOperation op = new AtmOperationImplication();
		int atmnumber = 12345;
		int atmpin = 123;
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO ATM MACHINE");
		System.out.println("Enter ATM Number:");
		int atmNumber = sc.nextInt();
		System.out.println("Enter ATM Pin:");
		int atmPin = sc.nextInt();
		if((atmnumber==atmNumber)&&(atmpin==atmPin)) {
			while(true) {
				System.out.println(" 1.View Available Balance\n 2.Withdraw Amount \n 3.Deposit Amount \n 4.View Ministatement \n 5.Exit");
				System.out.println("Enter Choice:");
				int ch = sc.nextInt();
				if(ch==1) {
					op.viewBalance();
				}
				else if(ch==2) {
					System.out.println("Enter Withdraw Amount:");
					double withdrawAmount = sc.nextDouble();
					op.withdrawAmount(withdrawAmount);
					
				}
				else if(ch==3) {
			 		System.out.println("Enter Amount to be Deposit:");
					double depositAmount = sc.nextDouble();
					op.depositAmount(depositAmount);
				}
				else if(ch==4) {
					op.viewMiniStatement();				
				}
				else if(ch==5) {
					System.out.println("Collect your ATM Card\nThankyou for choosing ATM Machine!! \nHAVE A NICE DAY");
					System.exit(0);
				}
				else
				{
					System.out.println("Please Enter Correct Choice!!!");
				}
			}
		}
		else {
			System.out.println("Incorrect ATM Number or ATM pin:");
			System.exit(0);
		}
	}
}
