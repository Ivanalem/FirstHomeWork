package sweets;

import abstractClass.Candy;

public class LollipopCandy extends Candy {

    public LollipopCandy(String name, int weight, int sugarContent) {
        super(name, weight, sugarContent);
    }

    @Override
    public String toString() {
        return "LollipopCandy{name: " + getName() + ", weight: " + getWeight() + " g" + ", sugarContent: "
                + getSugarContent() + " g }";
    }
}
