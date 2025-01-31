import abstractClass.Candy;
import newYearPresent.ChildrenPresent;
import sweets.BubbleGum;
import sweets.ChocolateCandy;
import sweets.LollipopCandy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static calculations.Search.getFullWeight;
import static calculations.Search.searchByWeight;
import static calculations.Sort.sortCandyByWeight;

public class Main {

    public static void main(String[] args) {
        LollipopCandy lollipopCandy = new LollipopCandy("Леденец", 25, 70);
        BubbleGum bubbleGum = new BubbleGum("Хуба-буба", 56, 90);
        ChocolateCandy chocolateCandy = new ChocolateCandy("Аленка", 15, 50);
        List<Candy> candies = new ArrayList<>();
        candies.add(lollipopCandy);
        candies.add(bubbleGum);
        candies.add(chocolateCandy);
        ChildrenPresent childrenPresent = new ChildrenPresent(candies);
        System.out.println("В детском подарке содержится:" + Arrays.asList(childrenPresent.getCandies()));
        sortCandyByWeight(childrenPresent);
        getFullWeight(childrenPresent);
        searchByWeight(15, 25, childrenPresent);


    }

}
