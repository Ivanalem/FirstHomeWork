package tests;

import abstractClass.Candy;
import newYearPresent.ChildrenPresent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sweets.BubbleGum;
import sweets.ChocolateCandy;
import sweets.LollipopCandy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SortTest {

    @Test
    void sortCandyByWeight() {
        LollipopCandy lollipopCandy = new LollipopCandy("Леденец", 25, 70);
        BubbleGum bubbleGum = new BubbleGum("Хуба-буба", 56, 90);
        ChocolateCandy chocolateCandy = new ChocolateCandy("Аленка", 15, 50);
        List<Candy> candies = new ArrayList<>();
        candies.add(lollipopCandy);
        candies.add(bubbleGum);
        candies.add(chocolateCandy);
        ChildrenPresent childrenPresent = new ChildrenPresent(candies);
        sortCandyByWeight(childrenPresent);
        Assertions.assertEquals(candies, sortCandyByWeight(childrenPresent));
    }

    public static List<Candy> sortCandyByWeight(ChildrenPresent childrenPresent) {
        List<Candy> newList = new ArrayList<>();
        childrenPresent.getCandies().sort(Comparator.comparing(Candy::getWeight));
        newList.addAll(childrenPresent.getCandies());
        System.out.println("\nCandies were sorted by weight: " + childrenPresent.getCandies());
        return newList;
    }
}
