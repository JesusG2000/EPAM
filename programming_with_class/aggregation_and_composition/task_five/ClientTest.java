package by.etc.programming_with_class.aggregation_and_composition.task_five;
// Туристические путевки.
// Сформировать набор предложений клиенту по выбору туристической путевки различного типа
// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней.
// Реализовать выбор и сортировку путевок.
public class ClientTest {
    public static void main(String[] args) {
        Trip[] trips = new Trip[10];
        String []someTrips=new String[]{"Rest","Excursion","Treating","Shopping"};
        String []someTransport=new String[]{"Plane","Car","Train"};

        for(int i = 0 ; i< trips.length ; i++){
            trips[i]=new Trip(
                    someTrips[(int)(Math.random()*someTrips.length)],
                    someTransport[(int)(Math.random()*someTransport.length)],
                    true,
                    (int)(Math.random()*30),
                    false
            );
        }
        Client client =new Client(trips);
        client.allTrips();
        System.out.println();
        client.chooseTrip(2);
        client.chooseCountOfDays(2,46);
        client.chooseFood(2,false);
        client.chooseTransport(2,"Plane");
        System.out.println();
        client.allTrips();
        System.out.println();
        client.sortByDays();
        client.allTrips();
    }
}
