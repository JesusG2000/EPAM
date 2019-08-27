package by.etc.task.four;

import by.etc.task.four.port.Berth;
import by.etc.task.four.port.Port;
import by.etc.task.four.ship.Ship;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Задание 4. Многопоточность. Порт .
// Корабли заходят в порт для разгрузки/загрузки контейнеров. Число контейнеров,
// находящихся в текущий момент в порту и на корабле,
// должно быть неотрицательным и превышающим заданную грузоподъемность судна и вместимость порта.
// В порту работает несколько причалов. У одного причала может стоять один корабль.
// Корабль может загружаться у причала или разгружаться.
public class Test {
    public static void main(String[] args){
        int countOfShips=5;
        int countOfBerths=3;
        Berth[] berths = new Berth[countOfBerths];
        for(int i = 0; i < berths.length ; i++){
            berths[i]=new Berth();
        }
        Port port = new Port(berths,countOfShips*100,countOfShips*100);
        ExecutorService executorService= Executors.newFixedThreadPool(countOfShips);

        for(int i = 0 ; i <countOfShips ; i++){
            executorService.submit(new Ship(i,port,10+10*i,10+10*i));
        }
        executorService.shutdown();
    }
}
