public class CustomerService {
    private final CustomerRepository repository;

    // Constructor-based dependency injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void getCustomerInfo(String customerId) {
        String customer = repository.findCustomerById(customerId);
        System.out.println("Fetched Customer: " + customer);
    }
}
