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
        if (plate.getFood() < appetite){
            System.out.println("Not enough food");
            plate.addFood(appetite);
        }
        if(appetite <= plate.getFood()) satiety = true;
        else if (appetite > plate.getFood()) System.out.println("Cat " + this.name + " hungry!");
        plate.decreaseFood(appetite);
        System.out.println("Cat " + this.name +" full");
        System.out.println("");
    }

}
