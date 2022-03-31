import java.util.ArrayList;
import java.util.Arrays;

public class NewStorage<E> {

    private E[] data;
    private int currentSize;
    private static final int DEFAULT_SIZE = 10;




    public NewStorage(int size){
        this.data = (E[]) new Object[size];
        currentSize = 0;

    }

    public void set(E... a) {

        for (int i = 0; i < a.length; i++) {

            data[i] = a[i];
        }

    }
    public NewStorage (){this(DEFAULT_SIZE);}

    public void changePlacesFor (int a, int b) {
        System.out.println("Actual array: ");
        System.out.println(Arrays.stream(data).toList());
        E c = data[a-1];
        E v = data[b-1];

        data[b-1] = c;
        data[a-1] = v;

        System.out.println("Now " + c + " and " + v + " replaced:");
        System.out.println(Arrays.stream(data).toList());
    }

    public ArrayList<E> arrayToArraylist (){

        ArrayList<E> a = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {

            a.add(data[i]);
        }
        return a;
    }







    }

