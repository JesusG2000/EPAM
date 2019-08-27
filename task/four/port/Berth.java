package by.etc.task.four.port;

public class Berth {
   private boolean isBusy;

    public Berth() {
        isBusy =false;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }
}
