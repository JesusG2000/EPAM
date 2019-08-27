package by.etc.basic_oop.task_two;
//Создать класс Payment с внутренним классом, с помощью объектов которого можно
// сформировать покупку из нескольких товаров.
 class Payment {
    private int cost;
    private Product[] products;

    Payment(int cost, Product[] products) {
        this.cost = cost;
        this.products = products;
    }

    void paid() {
        int cost = 0;
        for (Product p : products) {
            cost += p.getCost();
        }
        if (this.cost >= cost) {
            System.out.println("paid");
        } else {
            System.out.println("not paid");
        }
    }

    static class Product {
        private int cost;
        private String name;

        Product(int cost, String name) {
            this.cost = cost;
            this.name = name;
        }

        int getCost() {
            return cost;
        }
    }
}
