package CircularArray;


import java.util.Iterator;

/**
 * Created by Dillon on 4/27/2016.
 */
public class CircularArray<T> implements Iterable<T> {


    private T[] items;

    // Constructor
    public CircularArray(T[] theArray) {
        items = theArray;
    }

    public static void main(String[] args) {

        // Test data
        Integer[] tester = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        String[] testTwo = new String[] {"bob", "sagget", "testing", "okay", "now", "rotate", "this", "please"};
        int position = 11;
        CircularArray<Integer> worker = new CircularArray<Integer>(tester);
        CircularArray<String> workerTwo = new CircularArray<String>(testTwo);

        // Print out original array
        for (int i = 0; i < tester.length; i++) {
            System.out.print(tester[i] + ", ");
        }
        System.out.println();
        for (Object o : workerTwo) {
            System.out.print(o + ", ");
        }

        // Rotate array at chosen position, i.e 5 for the 5th element
        worker.rotateArray(position);
        workerTwo.rotateArray(6);

        // Print out rotated array
        System.out.println();
        for (int i = 0; i < tester.length; i++) {
            System.out.print(tester[i] + ", ");
        }
        System.out.println();

        // Proof that iterator works
        for (Object o : worker) {
            System.out.print(o + ", ");
        }
        System.out.println();
        for (Object o : workerTwo) {
            System.out.print(o + ", ");
        }

    }

    // Rotates the array at a given position
    public void rotateArray(int position) {
        int index = position - 1;
        int length = items.length;
        int head = 0;
        int shiftAmt = (length - position) + 1;
        T tempOne = null;
        T tempTwo = null;
        for (int i = 0; i < length; i++) {

            if (i == 0) {
                tempOne = items[head];
                items[head] = items[index];
            } else if ((i % 2) == 0) {
                tempOne = items[(head + shiftAmt) % length];
                items[(head + shiftAmt) % length] = tempTwo;

                head += shiftAmt;
            } else {
                tempTwo = items[(head + shiftAmt) % length];
                items[(head + shiftAmt) % length] = tempOne;
                head += shiftAmt;
            }

        }

    }


    //Adding iterable functionality to this class
    public Iterator<T> iterator() {
        return new CircularArrayIterator<T>(this);
    }

    private class CircularArrayIterator<TI> implements Iterator<TI> {
        private int _current = -1;
        private TI[] _items;

        public CircularArrayIterator(CircularArray<TI> array) {
            _items = array.items;
        }

        @Override
        public boolean hasNext() {
            return _current < items.length - 1;
        }

        @Override
        public TI next() {
            _current++;
            TI item = (TI) _items[_current];
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("...");
        }
    }
}
