
import org.springframework.context.ApplicationListener;

public class EventHandler implements ApplicationListener<WithdrawEvent> {
	public void onApplicationEvent(WithdrawEvent event) {
		System.out.println("Custom Event Raised:: ");
		event.detail();
	}
}