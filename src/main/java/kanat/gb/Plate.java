package kanat.gb;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public int getFood() {
        return food;
    }


    public void decreaseFood(int eaten){
            this.food -= eaten;

        }

    public void addFood(int eaten){
        if(eaten < 0){
            this.food += eaten *(-1);
        }
        this.food += eaten;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Plate{");
        sb.append("food=").append(food);
        sb.append('}');
        return sb.toString();
    }
}
