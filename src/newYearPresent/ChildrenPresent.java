package newYearPresent;

import abstractClass.Candy;

import java.util.List;

public class ChildrenPresent {
    private List<Candy> candies;

    public ChildrenPresent(List<Candy> candies) {
        this.candies = candies;
    }

    public List<Candy> getCandies() {
        return candies;
    }


    @Override
    public String toString() {
        return "В детском подарке содержится: " + getCandies();
    }
}
