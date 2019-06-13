import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final CustomerService customerService = new CustomerServiceImpl();
		System.out.println(customerService.findAll().get(0).getFirstName());

	}

}
