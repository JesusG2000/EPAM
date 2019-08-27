package by.etc.programming_with_class.aggregation_and_composition.task_four;

public class Client {
    private Bill[] bills;

    public Client(Bill[] bills) {
        this.bills = bills;
    }

    void blockBill(int index) {
        bills[index].setBlock(true);
    }

    void unblockBill(int index) {
        bills[index].setBlock(false);
    }

    void findSertainBill(int index) {
        if (bills[index].isBlock()) {
            System.out.println("This bill is blocked");
        } else {
            System.out.println(bills[index].toString());
        }
    }

    void billSort() {
        for (int i = 0; i < bills.length; i++) {
            for (int y = 0; y < bills.length; y++) {
                if (bills[i].getIndex() > bills[y].getIndex()) {
                    Bill replace = bills[i];
                    bills[i] = bills[y];
                    bills[y] = replace;
                }
            }
        }
    }

    int getBillsValue() {
        int value = 0;
        for (Bill b : bills) {
            value += b.getValue();
        }
        return value;
    }

    int getPositiveBillsValue() {
        int value = 0;
        for (Bill b : bills) {
            if (b.getValue() > 0) {
                value += b.getValue();
            }
        }
        return value;
    }

    int getNegativeBillsValue() {
        int value = 0;
        for (Bill b : bills) {
            if (b.getValue() < 0) {
                value += b.getValue();
            }
        }
        return value;
    }
    void showAllBills(){
        for(Bill b: bills){
            if(b.isBlock()){
                System.out.println("Bill number "+b.getIndex()+" is blocked");
            }else{
                System.out.println(b.toString());
            }
        }
    }
}
