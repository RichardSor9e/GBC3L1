package fruits;

import java.util.ArrayList;

public class Box<E extends Fruits> {

    private ArrayList<E> box = new ArrayList<E>(100);
private int arraySize = 100;
private int counter = 0;
private E aFruit;



    public void add( int count, E fruit) {
aFruit = fruit;
        for (int i = 0; i < count; i++) {

            box.add(i, fruit);
            counter++;
    }}


    public double getBoxWeight () {
            double a = 0;

            for (E fruit: box ){
               a = a + fruit.getWeight();
            }
        return a;
        }

        public boolean compare (Box box1) {

        if (this.getBoxWeight() == box1.getBoxWeight()) {
            return true;
        } else return false;
        }

        public void addBox (Box<E> box1){
            for (int i = 0; i < box1.getCount(); i++) {


                    box.add(this.getCount()+i-1, aFruit);
                    counter++;

            }
        }
        public int getCount () {
        return counter;
        }

    }




