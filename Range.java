import java.util.NoSuchElementException;    // Generic "out of bounds" exception.
import java.util.Iterator;

/**
 * An example for reference. Already completed.
 */

public class Range implements Iterable<Integer> {
    private int start, end, step;

    public Range(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public Iterator<Integer> iterator() {
        return new RangeIterator();
    }

    // Private iterator class.
    // Any iterable data structure should get its own
    // iterator.
    private class RangeIterator implements Iterator<Integer> {
        private int cursor;

        public RangeIterator() {
            this.cursor = start;
        }

        public boolean hasNext() {
            return this.cursor < end;
        }

        public Integer next() {
            if(this.hasNext()) {
                int current = cursor;
                cursor += step;
                return current;
            }
            throw new NoSuchElementException();
        }
    }


    public static void tester() {
        Range range1 = new Range(1, 10, 2);
        
        System.out.println("Iterator on range1:");
        Iterator<Integer> it1 = range1.iterator();
        while(it1.hasNext()) {
            int x = it1.next();
            System.out.println(x);
        }
        System.out.println();

        System.out.println("Enhanced for on range1:");
        for(Integer x : range1) {
            System.out.println(x);
        }
        System.out.println();
        
        Range range2 = new Range(10, 20, 3);
        
        Iterator<Integer> it2 = range2.iterator();
        System.out.println("Iterator on range2:");
        while(it2.hasNext()) {
            int x = it2.next();
            System.out.println(x);
        }
        System.out.println();
        
        System.out.println("Enhanced for on range2:");
        for(Integer x : range2) {
            System.out.println(x);
        }
        System.out.println();
        
        Range range3 = new Range(1, 10, 1);
        System.out.println("Range 3:");
        for(Integer x : range3) {
            System.out.println(x);
        }
        System.out.println();
        
        Iterator<Integer> ita = range3.iterator();
        Iterator<Integer> itb = range3.iterator();
        
        System.out.println("ita and itb are iterators on range3.");
        
        System.out.println("ita.next() " + ita.next());
        System.out.println("ita.next() " + ita.next());
        System.out.println("itb.next() " + itb.next());
        System.out.println("ita.next() " + ita.next());
        System.out.println("ita.next() " + ita.next());
        System.out.println("itb.next() " + itb.next());
    }
}