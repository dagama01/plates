package kanat.gb;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public boolean isSatiety() {
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
        if(appetite <= plate.getFood()) satiety = true;
        else if (appetite > plate.getFood()) System.out.println("Cat hungry!");
        plate.decreaseFood(appetite);
        System.out.println("Cat full");
    }

}
