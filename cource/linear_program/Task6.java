package linear_program;

public class Task6 {
    public static void main(String[] args) {
        int cuntOfSmallCan=4;
        int countOfBigCan=2;
        double milkInSmallCan=80;
        double milkInBigCan=(milkInSmallCan/cuntOfSmallCan+12)*countOfBigCan;
        System.out.println(milkInBigCan);
    }
}
