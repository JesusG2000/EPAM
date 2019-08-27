package by.etc.algorithmization.decomposition;
// На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие,
// между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
public class TaskFour {


    public static void main(String[] args) {
        int[][] area;
        int n;

        area = new int[10][10];
        n = 6;

        fillArea(area,n);
        show(area);
        System.out.println(longestDistance(area)[0]+ " " + longestDistance(area)[1]);
    }

    static void fillArea(int[][] area, int count) {

        int x;
        int y;
        for (int i = 0; i < count; i++) {
            x = (int) (Math.random() * area.length);
            y = (int) (Math.random() * area.length);
            area[y][x] = i+1;

        }
    }

    static void show(int[][] area) {
        for (int i = 0; i < area.length; i++) {
            for (int y = 0; y < area[i].length; y++) {
                System.out.print(area[i][y]+" ");
            }
            System.out.println();
        }
    }

    static int [] longestDistance(int[][] area) {
        int firstNumber=0;
        int secondNumber=0;
        int x1;
        int y1;
        int x2;
        int y2;
        double max = 0;
        for (int i = 0; i < area.length; i++) {
            for (int z = 0; z < area[i].length; z++) {
                if(area[i][z]!=0) {
                    x1=z;
                    y1=i;

                    for (int j = 0; j < area[i].length; j++) {
                        for (int k = 0; k < area[i].length; k++) {
                            if(area[j][k]!=0){
                                x2=k;
                                y2=j;

                                double distance =Math.pow(Math.pow(x1-x2,2)+Math.pow(y1-y2,2),0.5);
                                if(max<distance){
                                    max=distance;
                                    firstNumber=area[i][z];
                                    secondNumber=area[j][k];
                                }
                            }
                        }
                    }
                }
            }
        }


        return new int[]{firstNumber,secondNumber};
    }
}
