package examTest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Toy> toys = new ArrayList<>();

        Toy toy2 = new Toy(5,"Робот", 1.5);
        Toy toy3 = new Toy(3,"Конструктор", 0.8);
        Toy toy4 = new Toy(8,"Машинка", 0.9);
        Toy toy5 = new Toy(6,"Мишка ", 0.7);
        Toy toy6 = new Toy(10,"Робот", 1.0);

        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);
        toys.add(toy5);
        toys.add(toy6);

        StoreToys storeToys = new StoreToys(toys);

        storeToys.endResult();
    }
}