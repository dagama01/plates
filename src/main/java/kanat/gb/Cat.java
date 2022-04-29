package kanat.gb;

public class Cat {
    private String name;
    private int appetite;
    private String satiety;

    public String getSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plate){
        plate.decreaseFood(appetite,satiety);
    }

}
