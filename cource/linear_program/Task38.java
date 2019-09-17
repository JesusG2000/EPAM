package linear_program;

public class Task38 {
    public static void main(String[] args) {
        int x,y;
        boolean[][] mas1 = {
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, true , false, false, false, false, false, false},
                {false, false, false, false, false, false, true , true , true , false, false, false, false, false},
                {false, false, false, false, true , true , true , true , true , true , false, false, false, false},
                {false, false, false, true , true , true , true , true , true , true , true , false, false, false},
                {false, false, true , true , true , true , true , true , true , true , true , true , false, false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false}};
        x=1;
        y=1;
        System.out.println(mas1[-y+7][x+7]);

        boolean[][] mas2 = {
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false},
                {false, false, false, true , true , true , true , true , true , false, false, false, false, false},
                {false, false, false, true , true , true , true , true , true , false, false, false, false, false},
                {false, false, false, true , true , true , true , true , true , false, false, false, false, false},
                {false, false, false, true , true , true , true , true , true , false, false, false, false, false},
                {false, false, true , true , true , true , true , true , true , true , true , false, false, false},
                {false, false, true , true , true , true , true , true , true , true , true , false, false, false},
                {false, false, true , true , true , true , true , true , true , true , true , false, false, false},
                {false, false, true , true , true , true , true , true , true , true , true , false, false, false}};

        x=-2;
        y=4;
        System.out.println(mas2[-y+7][x+6]);

        boolean[][] mas3 = {
                {false, false, false, false, false, false, false, false, false, false, false, false, },
                {false, false, false, false, false, false, false, false, false, false, false, false, },
                {false, false, false, true , false, false, false, false, false, false, false, false, },
                {false, false, false, true , true , false, false, false, false, false, false, false, },
                {false, false, false, true , true , true , false, false, false, false, false, false, },
                {false, false, false, true , true , true , true , false, false, false, false, false, },
                {false, false, false, true , true , true , true , true , false, false, false, false, },
                {false, false, false, true , true , true , true , true , false, false, false, false, },
                {false, false, false, true , true , true , true , false, false, false, false, false, },
                {false, false, false, true , true , true , false, false, false, false, false, false, },
                {false, false, false, true , true , false, false, false, false, false, false, false, },
                {false, false, false, false, false, false, false, false, false, false, false, false, }};


        x=4;
        y=0;
        System.out.println(mas3[-y+6][x+3]);

    }
}
