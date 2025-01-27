package sweets;

import abstractClass.Candy;

public class BubbleGum extends Candy {

    public BubbleGum(String name, int weight, int sugarContent) {
        super(name, weight, sugarContent);
    }

    @Override
    public String toString() {
        return "BubbleGum{name: " + getName() + ", weight: "+getWeight()+" g"+", sugarContent: "
                + getSugarContent()+" g }";
    }
}
