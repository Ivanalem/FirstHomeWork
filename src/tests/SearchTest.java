package tests;

import abstractClass.Candy;
import newYearPresent.ChildrenPresent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sweets.BubbleGum;
import sweets.ChocolateCandy;
import sweets.LollipopCandy;

import java.util.ArrayList;
import java.util.List;

class SearchTest {

    @Test
    void searchByWeight() {
        LollipopCandy lollipopCandy = new LollipopCandy("Леденец", 25, 70);
        BubbleGum bubbleGum = new BubbleGum("Хуба-буба", 56, 90);
        ChocolateCandy chocolateCandy = new ChocolateCandy("Аленка", 15, 50);
        List<Candy> candies = new ArrayList<>();
        candies.add(lollipopCandy);
        candies.add(bubbleGum);
        candies.add(chocolateCandy);
        ChildrenPresent childrenPresent = new ChildrenPresent(candies);
        int enterParam = 15, enterParam2 = 25;
        List<Candy> newList = new ArrayList<>();
        for (Candy candy : childrenPresent.getCandies()) {
            if (candy.getWeight() >= enterParam && candy.getWeight() <= enterParam2) {
                System.out.println("Сладость с подходящими параметрами: " + candy.getName() + " "
                        + candy.getWeight() + " g");
            }
        }
        newList.addAll(childrenPresent.getCandies());
        Assertions.assertEquals(childrenPresent.getCandies(), newList);
    }

    @Test
    void getFullWeight() {
        LollipopCandy lollipopCandy = new LollipopCandy("Леденец", 25, 70);
        BubbleGum bubbleGum = new BubbleGum("Хуба-буба", 56, 90);
        ChocolateCandy chocolateCandy = new ChocolateCandy("Аленка", 15, 50);
        List<Candy> candies = new ArrayList<>();
        candies.add(lollipopCandy);
        candies.add(bubbleGum);
        candies.add(chocolateCandy);
        ChildrenPresent childrenPresent = new ChildrenPresent(candies);
        int sumWeight = 0;
        for (Candy candyFullWeight : childrenPresent.getCandies()) {
            sumWeight += candyFullWeight.getWeight();
        }
        System.out.println("Вес подарка составляет:" + sumWeight + " грамм.");
        Assertions.assertEquals(sumWeight, bubbleGum.getWeight() + chocolateCandy.getWeight() + lollipopCandy.getWeight());
    }
}