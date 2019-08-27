package by.etc.programming_with_class.aggregation_and_composition.task_four;
//. Счета. Клиент может иметь несколько счетов в банке.
// Учитывать возможность блокировки/разблокировки счета.
// Реализовать поиск и сортировку счетов.
// Вычисление общей суммы по счетам.
// Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
public class ClientTest {
    public static void main(String[] args) {
        Bill[] bills = new Bill[5];
        for (int i = 0; i < bills.length; i++) {
            bills[i] = new Bill((int) (Math.random() * 1000 - 500), false, i);
        }
        Client client = new Client(bills);
        client.showAllBills();
        client.findSertainBill(0);
        System.out.println(client.getBillsValue());
        System.out.println(client.getNegativeBillsValue());
        System.out.println(client.getPositiveBillsValue());
        client.billSort();
        client.findSertainBill(0);
        client.blockBill(0);
        client.findSertainBill(0);
        client.unblockBill(0);
        client.findSertainBill(0);

    }
}
