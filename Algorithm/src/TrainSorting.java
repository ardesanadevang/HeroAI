import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrainSorting {

    public void train_sort(int n, int[] trains) {
        if(n != trains.length){
            System.out.println("Incorrect input n and array");
            return;
        }
        if(n > 2000){
            System.out.println("Input n exceed limit");
            return;
        }


        List<Integer> cars = new ArrayList<>();
        for (int item : trains) {
            if (cars.isEmpty())
                cars.add(item);
            else if (cars.get(0) < item && cars.get(cars.size() - 1) < item)
                cars.add(item);
            else if (cars.get(cars.size() - 1) > item && cars.get(0) > item) {
                cars.add(cars.size() - 1, item);
            } else {
                // rejected
            }
        }

        System.out.println(String.valueOf(cars.size()));
    }
}
