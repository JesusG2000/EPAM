package by.etc.task.four.port;

public class Port {
    private Berth[] berths;
    private int capacity;
    private int carryingCapacity;
    private boolean allBerthsBusy;
    private int threadCount;

    public Port(Berth[] berths, int capacity, int carryingCapacity) {
        this.berths = berths;
        this.capacity = capacity;
        this.carryingCapacity = carryingCapacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    private void fill() {
        for (Berth berth : berths) {
            berth.setBusy(false);
        }
    }

    public synchronized void loading() {
        while (allBerthsBusy) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        allBerthsBusy = berthSetter();
    }

    private boolean berthSetter() {
        berths[threadCount].setBusy(true);
        threadCount++;
        return checkAllBusy(berths);
    }

    private boolean checkAllBusy(Berth[] berthBusy) {
        for (Berth b : berthBusy) {
            if (!b.isBusy()) {
                return false;
            }
        }
        return true;
    }

    public synchronized void stop() {
        notify();
        allBerthsBusy = false;
        threadCount--;
        fill();
    }
}
