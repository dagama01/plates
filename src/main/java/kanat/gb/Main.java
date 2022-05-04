package kanat.gb;

public class Main {
    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Artur", 300);
        cat[1] = new Cat("Boris", 200);
        cat[2] = new Cat("Tomi",70);
        Plate plate = new Plate(120);

        for(int i=0; i < cat.length; i++){
            cat[i].eat(plate);
        }
        System.out.println(plate);

    }
}
