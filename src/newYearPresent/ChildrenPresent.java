package newYearPresent;

import abstractClass.Candy;

import java.util.Arrays;
import java.util.Comparator;

public class ChildrenPresent {
    private Candy[] candies;

    public ChildrenPresent(Candy[] candies) {
        this.candies = candies;
    }

    //Общий вес подарка
    public int getFullWeight() {
        int sumWeight = 0;
        for (Candy candyFullWeight : getCandies()) {
            sumWeight += candyFullWeight.getWeight();
        }
        System.out.println("Вес подарка составляет:" + sumWeight + " грамм.");
        return sumWeight;
    }

    public Candy[] getCandies() {
        return candies;
    }

    //Поиск по весу
    public Candy[] searchByWeight(int enterParam, int enterParam2) {
        for (Candy candy : candies) {
            if (candy.getWeight() >= enterParam && candy.getWeight() <= enterParam2) {
                System.out.println("Сладость с подходящими параметрами: " + candy.getName() + " "
                        + candy.getWeight() + " g");
            }
        }
        return getCandies();
    }

    //Сортировка по весу
    public void sortCandyByWeight(Candy[] candies) {
        Arrays.sort(candies, Comparator.comparing(Candy::getWeight));
        System.out.println("\nCandies were sorted by weight: " + Arrays.toString(candies));
    }

    @Override
    public String toString() {
        return "В детском подарке содержится: " + Arrays.toString(getCandies());
    }
}
