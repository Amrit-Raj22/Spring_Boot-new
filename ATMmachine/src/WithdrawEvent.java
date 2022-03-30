import java.util.Date;

import org.springframework.context.ApplicationEvent;

public class WithdrawEvent extends ApplicationEvent {
	BankAccount bank;
	private static final long serialVersionUID = 1L;

	public WithdrawEvent(Object source) {
		super(source);
	}
	
	public void bank(BankAccount bank) {
		this.bank=bank;
		
	}
	public void detail() {
		System.out.println("BALANCE:"+bank.accBalance+"\t time:"+new Date());
	}
}