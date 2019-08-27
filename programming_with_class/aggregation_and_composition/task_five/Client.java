package by.etc.programming_with_class.aggregation_and_composition.task_five;

public class Client {
   private Trip[] trips;

    public Client(Trip[] trips) {
        this.trips = trips;
    }
    void allTrips(){
        for(Trip t:trips){
            System.out.println(t.toString());
        }
    }
    void chooseTrip(int index){
        trips[index].setSelected(true);
    }
    void chooseTransport(int index, String transport){
        trips[index].setTransport(transport);
    }
    void chooseFood(int index,boolean food){
        trips[index].setFood(food);
    }
    void chooseCountOfDays(int index,int days){
        trips[index].setDays(days);
    }
    void sortByDays(){
        for(int i =0 ; i < trips.length ; i++){
            for(int y  = 0 ; y < trips.length ; y++){
                if(trips[i].getDays()>trips[y].getDays()){
                    Trip replace=trips[i];
                    trips[i]=trips[y];
                    trips[y]=replace;
                }
            }
        }
    }

}
