

interface CustomerRepository {
    String findCustomerById(int id);
}

class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(int id) {
        return "Customer#" + id;
    }
}

class CustomerService {
    private CustomerRepository repository;

    // constructor injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void printCustomer(int id) {
        System.out.println("Found: " + repository.findCustomerById(id));
    }
}

public class Main {
    public static void main(String[] args) {
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo); // dependency injected

        service.printCustomer(1);
    }
}
