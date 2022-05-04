package kanat.gb;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    private static int period = 0;

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public static int getPeriod() {
        return period;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        period++;
        if (period>3){
            System.out.println("stop");
        }else {
            if (plate.getFood() < appetite) {
                System.out.println("Not enough food");
                plate.addFood(appetite);
            }
            if (appetite <= plate.getFood()) satiety = true;
            else if (appetite > plate.getFood()) System.out.println("Cat " + this.name + " hungry!");
            plate.decreaseFood(appetite);
            System.out.println("Cat " + this.name + " full");
            System.out.println("");
            if (period > 3) {
                System.out.println("stop");
            }
        }
    }
}
