package calculations;

import abstractClass.Candy;
import newYearPresent.ChildrenPresent;

import java.util.ArrayList;
import java.util.List;

public class Search {


    //Search by weight
    public static List<Candy> searchByWeight(int enterParam, int enterParam2, ChildrenPresent childrenPresent) {
        List<Candy> newList = new ArrayList<>();
        for (Candy candy : childrenPresent.getCandies()) {
            if (candy.getWeight() >= enterParam && candy.getWeight() <= enterParam2) {
                System.out.println("Сладость с подходящими параметрами: " + candy.getName() + " "
                        + candy.getWeight() + " g");
            }
        }
        newList.addAll(childrenPresent.getCandies());
        return newList;
    }

    //Total weight of the gift
    public static int getFullWeight(ChildrenPresent childrenPresent) {
        int sumWeight = 0;
        for (Candy candyFullWeight : childrenPresent.getCandies()) {
            sumWeight += candyFullWeight.getWeight();
        }
        System.out.println("Вес подарка составляет:" + sumWeight + " грамм.");
        return sumWeight;
    }


}
