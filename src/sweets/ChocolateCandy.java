package sweets;

import abstractClass.Candy;

public class ChocolateCandy extends Candy {

    public ChocolateCandy(String name, int weight, int sugarContent) {
        super(name, weight, sugarContent);
    }

    @Override
    public String toString() {
        return "ChocolateCandy{name: " + getName() + ", weight: " + getWeight() + " g" + ", sugarContent: "
                + getSugarContent() + " g },";
    }
}
