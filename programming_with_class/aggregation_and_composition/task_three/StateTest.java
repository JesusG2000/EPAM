package by.etc.programming_with_class.aggregation_and_composition.task_three;
// Создать объект класса Государство, используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
//
public class StateTest {

    public static void main(String[] args) {
        District[] districts = new District[3];
        City[] cities = new City[3];
        Region[] regions = new Region[3];
        String[] someDistricts = new String[]{"POP", "GGS", "RIVECT", "VIT"};
        String[] someCities = new String[]{"Zhadorozhie", "Kylic", "Piter", "Polowk"};
        String[] someRegions = new String[]{"Vitebsk", "Minsk", "Brest", "Grodno"};
        for (int i = 0; i < regions.length; i++) {
            for (int y = 0; y < cities.length; y++) {
                for (int x = 0; x < districts.length; x++) {
                    districts[x] = new District(someDistricts[(int) (Math.random() * someDistricts.length)]);
                }
                cities[y] = new City(someCities[(int) (Math.random() * someCities.length)], districts);
            }
            regions[i] = new Region(
                    someRegions[(int) (Math.random() * someRegions.length)],
                    "A" + i,
                    cities,
                    (int) (Math.random() * 800)
            );
        }
        State state = new State("Belarus", 0, regions);

        state.countOfRegions();
        System.out.println(state.getCapital());
        state.regionsCenters();
        state.stateArea();
    }
}
