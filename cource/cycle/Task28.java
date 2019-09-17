package cycle;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner forI = new Scanner(System.in);
        Scanner forS = new Scanner(System.in);
        double first;
        double second;
        String sign = "";

        while (!sign.equals("0")) {
            first = forI.nextDouble();
            second = forI.nextDouble();
            sign = forS.nextLine();
            if (second == 0) {
                System.out.println("Error");
            } else {
                switch (sign) {
                    case "+": {
                        System.out.println(first + second);
                        break;
                    }
                    case "-": {
                        System.out.println(first - second);
                        break;
                    }
                    case "/": {
                        System.out.println(first / second);
                        break;
                    }
                    case "*": {
                        System.out.println(first * second);
                        break;
                    }case "0": {
                        break;
                    }
                    default:{
                        System.out.println("Wrong sign");
                    }
                }
            }
        }
    }
}

