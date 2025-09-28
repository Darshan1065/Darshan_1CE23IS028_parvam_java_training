import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class carsSorting {
    public static void main(String[] args) {

        List<cars> cars = new ArrayList<>();
        cars.add(new cars("Toyota", "Corolla", 2015));
        cars.add(new cars("Honda", "Civic", 2012));
        cars.add(new cars("Ford", "Focus", 2018));
        cars.add(new cars("Hyundai", "Elantra", 2010));


    Collections.sort(cars, Comparator.comparingInt(car -> car.year));


        System.out.println("Cars sorted by manufacturing year (ascending):");
        for (cars car : cars) {
            System.out.println(car);
        }
    }
}
