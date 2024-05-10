package ATM_Machine;

public interface ATMOperation {
	public void viewBalance();
	public void withdrawAmount(double withdrawAmount);
	public void depositAmount(double depositAmount);
	public void viewMiniStatement();
}
