public class Main {
    public static void main(String[] args) {
        // Create repository instance
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject repository into service via constructor
        CustomerService service = new CustomerService(repository);

        // Use service
        service.getCustomerInfo("C1024");
    }
}
