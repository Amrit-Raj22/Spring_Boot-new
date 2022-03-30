
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EventPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher = publisher;
	}	
	
	public void publish(BankAccount bank) {
		WithdrawEvent event = new WithdrawEvent(this);
		event.bank(bank);
		this.publisher.publishEvent(event);
	}
}