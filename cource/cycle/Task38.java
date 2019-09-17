package cycle;

public class Task38 {
    public static void main(String[] args) {
        int number=963;
        boolean contain=true;
        int mas[]=new int[(number+"").length()];
        for(int i=0;i<mas.length;i++){
            mas[i]=(int)(number/Math.pow(10,i)%10);
        }
        int differrent=mas[0]-mas[1];
        for(int i=0 ; i < mas.length-1;i++){
            if(mas[i]-mas[i+1]!=differrent){
                contain=false;
                break;
            }
        }
        if(contain){
            System.out.println("contain");
        }else{
            System.out.println("dont contain");
        }
    }
}
