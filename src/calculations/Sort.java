package calculations;

import abstractClass.Candy;
import newYearPresent.ChildrenPresent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {

    //Sort by weight
    public static List<Candy> sortCandyByWeight(ChildrenPresent childrenPresent) {
        List<Candy> newList = new ArrayList<>();
        childrenPresent.getCandies().sort(Comparator.comparing(Candy::getWeight));
        newList.addAll(childrenPresent.getCandies());
        System.out.println("\nCandies were sorted by weight: " + childrenPresent.getCandies());
        return newList;
    }
}
