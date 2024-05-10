package ATM_Machine;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImplication implements ATMOperation{
	ATM atm = new ATM();
	Map<Double,String> ministatement = new HashMap<>();
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available Balance is :"+atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stub
		if(withdrawAmount%500==0) {
			if(withdrawAmount<=atm.getBalance()) {
				ministatement.put(withdrawAmount, "Amount Withdrawn");
				System.out.println("Collect the Cash"+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBalance();
			}
			
			else {
				System.out.println("Insufficient Balance :( ");
			}

		}
		else {
			System.out.println("Please Enter Amount In Multiple Of 500-");
		}
	}

	@Override
	public void depositAmount(double depositAmount) {
		
		// TODO Auto-generated method stub
		ministatement.put(depositAmount, "Amount Deposited");
		System.out.println(depositAmount+" Deposited Successfully !!");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
		for(Map.Entry<Double,String>m:ministatement.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
	}
	
}
