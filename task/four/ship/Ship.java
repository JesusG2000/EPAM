package by.etc.task.four.ship;


import by.etc.task.four.port.Port;

public class Ship implements Runnable{
   private int index;
   private Port port;
   private int capacity;
   private int carryingCapacity;

    public Ship(int index, Port port, int capacity, int carryingCapacity) {
        this.index = index;
        this.port = port;
        this.capacity = capacity;
        this.carryingCapacity = carryingCapacity;
    }

   private void pause(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while(true) {
        action(" loading", "stop loading");
        actionWithGoods(port.getCapacity() - capacity, port.getCarryingCapacity() - carryingCapacity);

        action(" unloading", "stop unloading");
        actionWithGoods(port.getCapacity()+capacity, port.getCarryingCapacity()+carryingCapacity);
          }
    }

    private void actionWithGoods(int capacity, int carryingCapacity) {
        port.setCapacity(capacity);
        port.setCarryingCapacity(carryingCapacity);
    }

    private void action(String s, String s2) {
        pause();
        port.loading();
        System.out.println(this + s);
        actionTime();
        System.out.println(this + s2);
        port.stop();

    }

    private void actionTime() {
        try {
            Thread.sleep(capacity*30+carryingCapacity*30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String toString() {
        return "Ship{" +
                "index=" + index +
                '}';
    }
}
