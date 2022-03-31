import java.util.List;
import java.sql.Date;
import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Worker.Worker;
import WorkerJDBC.WorkerJdbc;
public class MainApp {

		public static void main(String[] args) throws SQLException{
			ApplicationContext context = new ClassPathXmlApplicationContext("Worker.xml");
			
			WorkerJdbc workerJDBC = (WorkerJdbc) context.getBean("workerJDBC");
			
	        Worker worker = new Worker(20, "Amrit", "mail@email.com");

	        workerJDBC.add(worker);

	        workerJDBC.delete(10);

	        Worker obj = workerJDBC.getWorker(8);
	        System.out.println(obj);

	        List<Worker> workers = workerJDBC.getWorkers();
	        workers.forEach(System.out::println);

	        Worker updateWorker = new Worker(10, "Amrit", "Raj", 5000,
	                Date.valueOf("2022-04-10"), "SDE", "mail@update");
	        workerJDBC.update(updateWorker);
	        
		}
	}

