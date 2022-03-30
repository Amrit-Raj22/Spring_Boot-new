import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Appmain{
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("ATMBean.xml");
		BankAccount save=new SavingAccount(1,"Amrit",50000);
		BankAccount curr=new CurrentAccount(2,"Amrit",100000);
		EventPublisher customEventPublish = (EventPublisher) context.getBean("customEventPublisher");
		
		save.withdraw(20000);
		customEventPublish.publish(save);
	}
}