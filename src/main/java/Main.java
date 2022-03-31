import fruits.Apple;
import fruits.Box;
import fruits.Orange;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        NewStorage<Integer> a = new NewStorage<>(10);
        a.set(10, 15, 5);
        System.out.println(
        );
        a.changePlacesFor(2, 3);

        System.out.println();
        ArrayList<Integer> b = a.arrayToArraylist();
        System.out.println("Array List: " + b);
        System.out.println();

        Box<Apple> boxA1 = new Box<>();
        Box<Apple> boxA2 = new Box<>();
        Box<Orange> boxO = new Box<>();

        boxA1.add(3, new Apple());
        boxA1.add(4, new Apple());
        boxA2.add(2, new Apple());
        boxO.add(7, new Orange());

        System.out.println(boxA1.getBoxWeight());
        System.out.println(boxO.getBoxWeight());

        System.out.println(boxA1.compare(boxO));

boxA1.addBox(boxA2);

        System.out.println(boxA1.getCount());
        System.out.println(boxA1.getBoxWeight());
    }
}
