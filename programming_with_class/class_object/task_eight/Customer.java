package by.etc.programming_with_class.class_object.task_eight;
// Создать класс Customer, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод  toString().
// Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
// Найти и вывести:
// Test) список покупателей в алфавитном порядке;
// b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

public class Customer {
    private int id;
    private String name;
    private String patronymic;
    private String address;
    private int cardNumber;
    private int bankBillNumber;

    public Customer(int id, String name, String patronymic, String address, int cardNumber, int bankBillNumber) {
        this.id = id;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankBillNumber = bankBillNumber;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getBankBillNumber() {
        return bankBillNumber;
    }

    public void setBankBillNumber(int bankBillNumber) {
        this.bankBillNumber = bankBillNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", bankBillNumber=" + bankBillNumber +
                '}';
    }
}
