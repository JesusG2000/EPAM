package by.etc.programming_with_class.class_object.task_four;

import java.util.Scanner;
import java.util.regex.Matcher;

// Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train,
// добавьте возможность сортировки элементов массива по номерам поездов.
// Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения,
// причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления
public class Train {
    String place;
    int trainNumber;
    int hour;
    int min;

     Train(String place, int trainNumber, int hour, int min) {
        this.place = place;
        this.trainNumber = trainNumber;
        this.hour = hour;
        this.min = min;
    }

   static Train[] sortByTrainNumber(Train []train){
        for(int i = 0 ; i < train.length ; i++){
            for(int y = 0 ; y < train.length ; y++){
                if(train[i].trainNumber<train[y].trainNumber){
                    Train replace=train[i];
                    train[i]=train[y];
                    train[y]=replace;
                }
            }
        }
        return train;
    }



     void getInfo(){
        System.out.println("Place: "+place+" "+
                "train number: "+trainNumber+" "+
                "time: "+hour+"."+min);

    }
   static Train[] sortByPlace(Train []train) {
        for (int i = 0; i < train.length; i++) {
            for (int y = 0; y < train.length; y++) {
                if (train[i].place.toLowerCase().charAt(0) <= train[y].place.toLowerCase().charAt(0)) {
                    Train replace = train[i];
                    train[i] = train[y];
                    train[y] = replace;
                }
            }
        }
        for(int i = 0 ; i < train.length ; i++){
            for(int y = 0 ; y < train.length;y++){
                if (train[i].place.equals(train[y].place)) {
                    int timeFirst = train[i].hour * 60 + train[i].min;
                    int timeSecond = train[y].hour * 60 + train[y].min;
                    if (timeFirst < timeSecond) {
                        Train replace = train[i];
                        train[i] = train[y];
                        train[y] = replace;
                    }
                }
            }
        }
        return train;
    }

    public static void main(String[] args) {
        Train []trains=new Train[5];
        String []place=new String[]{"Vitebsck","Minsk","Grodno","Gomel","Brest"};
        int []number=new int[]{1,2,3,4,5,6};
        for(int i=0;i<trains.length;i++){
            int getPlace=(int)(Math.random()*place.length);
            int getNumber=(int)(Math.random()*number.length);
            int getHour=(int)(Math.random()*25);
            int getMin=(int)(Math.random()*61);
            trains[i]=new Train(place[getPlace],number[getNumber],getHour,getMin);
        }
        //sortByTrainNumber(trains);
      //  sortByPlace(trains);
//        for(int i=0;i<trains.length;i++){
//            System.out.println(trains[i].place+" "+trains[i].trainNumber+" " +trains[i].hour);
//        }
     //   trains[new Scanner(System.in).nextInt()].getInfo();

    }
}
