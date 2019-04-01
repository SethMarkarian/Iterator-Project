import java.util.Iterator;

/**
 * Problem 1: Writing an "exponential range" class.
 * 
 * You don't need to change the ExpRange class itself, just the
 * ExpRangeIterator class below.
 */
public class ExpRange implements Iterable<Integer>
{
    private int start, factor, num;
    
    public ExpRange(int start, int factor, int num) {
        this.start = start;
        this.factor = factor;
        this.num = num;
    }
    
    public Iterator iterator() {
        return new ExpRangeIterator();
    }
    
    /**
     * Complete this Iterator class.
     */
    private class ExpRangeIterator implements Iterator<Integer> {
        private int current, count;
        public ExpRangeIterator() {
            this.current = start;
        }
        
        public Integer next() {
            int ans = current;
            count++;
            current *= factor;
            return ans;
        }
        
        public boolean hasNext() {
            return count < num;
        }
    }
    
    /**
     * Tester code -- don't change.
     */
    public static void tester() {
        ExpRange e1 = new ExpRange(1, 2, 5);
        System.out.print("Should be: 1 2 4 8 16");
        System.out.print("Test: ");
        for(Integer x : e1) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println();
        
        ExpRange e2 = new ExpRange(5, 4, 6);
        System.out.print("Should be: 5 20 80 320 640 1280");
        System.out.print("Test: ");
        for(Integer x : e2) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println();
        
        ExpRange e3 = new ExpRange(3, -2, 4);
        System.out.print("Should be: 3 -6 12 -24");
        System.out.print("Test: ");
        for(Integer x : e3) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println();
    }
}
