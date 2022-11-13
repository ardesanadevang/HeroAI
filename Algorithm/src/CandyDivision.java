import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CandyDivision {
    public void divide_candy(int numberOfCandies){
        if(!(numberOfCandies > 1 && numberOfCandies <= Math.pow(10,12))){
            System.out.println("Number of Candies value out of bound");
            return;
        }

        List<Integer> result = new ArrayList<>();

        int i = 1;
        while (i <= numberOfCandies){
            if(numberOfCandies % i == 0)
                result.add(i-1);
            i++;
        }

        System.out.println(Arrays.toString(result.toArray()));
    }
}
