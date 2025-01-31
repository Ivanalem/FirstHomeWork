package abstractClass;

public abstract class Candy {


    private String name;
    private int weight;
    private int sugarContent;

    public Candy(String name, int weight, int sugarContent) {
        this.name = name;
        this.weight = weight;
        this.sugarContent = sugarContent;
    }

    //Геттеры
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getSugarContent() {
        return sugarContent;
    }

}
