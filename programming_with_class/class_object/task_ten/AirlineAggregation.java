package by.etc.programming_with_class.class_object.task_ten;

public class AirlineAggregation {
    private Airline []airlines;

    public AirlineAggregation(Airline[] airlines) {
        this.airlines = airlines;
    }
    void listOFFlightByDestination(String destination){
        for(Airline a:airlines){
            if(a.getDestination().equals(destination)){
                System.out.println(a.getflightNumber() +"\n"+a.toString());
            }
        }
    }
    void listOFlightByDayOfWeek(int dayOfWeek){
        for(Airline a:airlines){
            if(a.getDayOfWeek()==dayOfWeek){
                System.out.println(a.getflightNumber()+"\n"+a.toString());
            }
        }
    }
    void listOFlightByTimeAndDayOfWeek(int dayOfWeek , int hour , int min){
        for(Airline a: airlines){
            if(a.getDayOfWeek()==dayOfWeek && hour*60+min<a.getHour()*60+a.getMin()){
                System.out.println(a.getflightNumber()+"\n"+a.toString());
            }
        }
    }

    public static void main(String[] args) {
        Airline []airline=new Airline[10];
        String []destination=new String[]{"Vitebsk","Minsk","Grodno","Brest"};
        String []planeType = new String[]{"Small","Middle","Big"};

        for(int i=0 ; i <airline.length ;i++){
            airline[i]=new Airline(
                    destination[(int)(Math.random()*destination.length)],
                    i,
                    planeType[(int)(Math.random()*planeType.length)],
                    (int)(Math.random()*24),
                    (int)(Math.random()*60),
                    (int)(Math.random()*7)
            );
        }
        AirlineAggregation aggregation = new AirlineAggregation(airline);
       // aggregation.listOFFlightByDestination("Vitebsk");
        //aggregation.listOFlightByDayOfWeek(0);
       // aggregation.listOFlightByTimeAndDayOfWeek(0,10,30);
    }
}
