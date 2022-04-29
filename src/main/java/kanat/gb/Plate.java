package kanat.gb;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public int getFood() {
        return food;
    }


    public void decreaseFood(int eaten, String satiety){
        if(this.food>eaten){
            this.food -= eaten;
            satiety = "Cat is full";
            System.out.println("Satiety: " + satiety);
        }else{
            addFood();
            this.food -= eaten;
            satiety = "Cat is full";
            System.out.println("Satiety: " + satiety);
        }
    }
    public void addFood(){
        this.food += 400;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Plate{");
        sb.append("food=").append(food);
        sb.append('}');
        return sb.toString();
    }
}
