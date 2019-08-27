package by.etc.algorithmization.sort;
//Даны две последовательности Образовать из них новую последовательность чисел так,
// чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать
public class TaskTwo {

    public static void main(String[] args) {

        int masOne[];
        int masTwo[];
        int unionMas[];


        masOne=new int[]{1,3,7,9,17,19,22,55};
        masTwo=new int[]{2,4,6,8,11,11,34,35,55,80};
        unionMas= new int[masOne.length+masTwo.length];

        for(int i=0 , y=0; i<unionMas.length; i++){
            if(i<masOne.length) {
                unionMas[i] = masOne[i];
            }else{
                unionMas[i]=masTwo[y];
                y++;
            }
        }
        for(int i = 0 ; i < unionMas.length;i++){
            for(int y = 0 ; y < unionMas.length; y++){
                if(unionMas[i]<unionMas[y]){
                    int replace = unionMas[y];
                    unionMas[y]=unionMas[i];
                    unionMas[i]=replace;
                }
            }
        }
        for(int i = 0 ; i < unionMas.length ; i++){
            System.out.print(unionMas[i]+" ");
        }


    }
}
