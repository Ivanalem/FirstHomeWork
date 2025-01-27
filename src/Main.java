import abstractClass.Candy;
import newYearPresent.ChildrenPresent;
import sweets.BubbleGum;
import sweets.ChocolateCandy;
import sweets.LollipopCandy;

public class Main {

    public static void main(String[] args) {
        LollipopCandy lollipopCandy = new LollipopCandy("Леденец", 25, 70);
        BubbleGum bubbleGum = new BubbleGum("Хуба-буба", 56, 90);
        ChocolateCandy chocolateCandy = new ChocolateCandy("Аленка", 15, 50);
        Candy[] candies = {lollipopCandy, chocolateCandy, bubbleGum};
        ChildrenPresent childrenPresent = new ChildrenPresent(candies);
        System.out.println(childrenPresent);
        childrenPresent.getFullWeight();
        childrenPresent.searchByWeight(20, 50);
        childrenPresent.sortCandyByWeight(candies);


    }

}
