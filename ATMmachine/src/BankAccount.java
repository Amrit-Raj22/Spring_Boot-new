abstract class BankAccount{
	long accNum;
	String accHolder;
	double accBalance;
	
	public BankAccount(long accNum, String accHolder, double accBalance) {
		this.accNum = accNum;
		this.accHolder = accHolder;
		this.accBalance = accBalance;
	}
	public abstract void showBalance();
	public abstract double withdraw(double amt);
	public abstract double deposit(double amt);
	public abstract void tostring();
}

class SavingAccount extends BankAccount{
	int withdraw_limit=30000;
	int transaction_limit=5;
	int deposit_limit=1000000;
	
	
	public SavingAccount(long accNum, String accHolder, double accBalance) {
		super(accNum, accHolder, accBalance);
	}
	@Override
	public void showBalance() {
		System.out.println(this.accBalance);		
	}
	@Override
	public double withdraw(double amt) {
		this.accBalance-=amt;
		return this.accBalance;
	}
	@Override
	public double deposit(double amt) {
		this.accBalance+=amt;
		return this.accBalance;
	}
	@Override
	public void tostring() {
		System.out.println("SavingAccount [ Balance:"+this.accBalance+"WithdrawLimit:"+this.withdraw_limit+"]");
		
	}
}
class CurrentAccount extends BankAccount{
	int withdraw_limit=100000;
	int transaction_limit=10;
	
	
	public CurrentAccount(long accNum, String accHolder, double accBalance) {
		super(accNum, accHolder, accBalance);
	}
	@Override
	public void showBalance() {
		System.out.println(this.accBalance);	
		
	}
	@Override
	public double withdraw(double amt) {
		this.accBalance-=amt;
		return this.accBalance;
		
	}
	@Override
	public double deposit(double amt) {
		this.accBalance+=amt;
		return this.accBalance;
	}
	@Override
	public void tostring() {
		System.out.println("SavingAccount [ Balance:"+this.accBalance+"WithdrawLimit:"+this.withdraw_limit+"]");
		
	}
}

