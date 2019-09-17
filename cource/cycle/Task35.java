package cycle;

public class Task35 {
    public static void main(String[] args) {
        int num = 12354;
        int counter = 0;
        for (int i = 0; i < (num + "").length(); i++) {
            if ((int) (num / Math.pow(10, i) % 10) % 2 == 0) {
                counter++;
            }
        }

    }
}
