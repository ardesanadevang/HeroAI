public class Main {
    public static void main(String[] args) {
        CandyDivision candyDivision = new CandyDivision();
        candyDivision.divide_candy(25);
        candyDivision.divide_candy(30);

        int[] trains1 = {1, 2, 3};
        int[] trains2 = {10, 2, 12, 20, 3};
        TrainSorting trainSorting = new TrainSorting();
        trainSorting.train_sort(3, trains1);
        trainSorting.train_sort(5, trains2);
    }
}