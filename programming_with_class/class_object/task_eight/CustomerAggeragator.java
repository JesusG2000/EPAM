package by.etc.programming_with_class.class_object.task_eight;



public class CustomerAggeragator {
   private Customer[] customers;

    public CustomerAggeragator(Customer[] customers) {
        this.customers = customers;
    }

    void showCustomers() {
        Customer[] customers = this.customers;
        for (int i = 0; i < customers.length; i++) {
            for (int y = 0; y < customers.length; y++) {
                if (customers[i].getName().toLowerCase().charAt(0) < customers[y].getName().toLowerCase().charAt(0)) {
                    Customer replace = customers[i];
                    customers[i] = customers[y];
                    customers[y] = replace;
                }
            }
        }
        for (Customer c : customers) {
            System.out.println(c.getName());
        }
    }

    void showCards(int begin, int end) {
        boolean available = false;
        for (Customer c : customers) {
            if (c.getCardNumber() >= begin && c.getCardNumber() <= end) {
                available = true;
                System.out.println(c.getName() + " " + c.getPatronymic() + " card number =" + c.getCardNumber());
            }
        }
        if (!available) {
            System.out.println("Nobody is found");
        }
    }

    public static void main(String[] args) {
        Customer[] customer = new Customer[10];
        String[] name = new String[]{"Ivan", "Petr", "Vova", "Andrew"};
        String[] patronymic = new String[]{"Ivanov", "Sergeyevich"};
        String[] address = new String[]{"Chkalova", "Belorussian"};
        int cardNumber;
        int bankBillNumber;
        for (int i = 0; i < customer.length; i++) {
            int setPatronymic = (int) (Math.random() * patronymic.length);
            int setAddress = (int) (Math.random() * address.length);
            int setName = (int) (Math.random() * name.length);
            cardNumber = (int) (Math.random() * 900 + 100);
            bankBillNumber = (int) (Math.random() * 900 + 100);
            customer[i] = new Customer(i, name[setName], patronymic[setPatronymic], address[setAddress], cardNumber, bankBillNumber);
        }
        CustomerAggeragator aggeragator = new CustomerAggeragator(customer);
        // aggeragator.showCustomers();
        //aggeragator.showCards(100,200);
    }
}
