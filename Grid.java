import java.util.Iterator;

/**
 * Problem 3:
 * 
 * A 2D array that you can iterate over in different ways.
 */
public class Grid<T> implements Iterable<T>
{   
    private Object[][] a;
    private boolean rowMajor;
    
    public Grid(Object[][] a) {
        this.a = a;
        rowMajor = true;
    }
    
    /**
     * Cyles through the modes in the 
     */
    public void switchMode() {
        rowMajor = !rowMajor;
    }
    
    public Iterator iterator() {
        if(rowMajor) {
            return new RowMajorIterator();
        }
        else {
            return new ColumnMajorIterator();
        }
    }
    
    /**
     * Assignment: Write Iterator classes below,
     * then rewrite the iterator() method above
     * so that it returns instances of those,
     * instead of null.
     * 
     * One class should loop over the elements of the grid
     * in row-major order; the other should loop over the
     * elements of the grid in column-major order.
     */
    
    private class RowMajorIterator implements Iterator<Integer> {
        
    }
    
    private class ColumnMajorIterator implements Iterator<String> {
        
    }
    
    
    public static void tester() {
        Integer[][] a = new Integer[3][4];
        int x = 11;
        for(int row = 0; row < 3; row++) {
            for(int col = 0; col < 4; col++) {
                a[row][col] = x;
                x++;
            }
        }
        
        String[][] b = {{"ab", "cd"}, {"ef", "gh"}, {"ij", "kl"}};
        
        Grid<Integer> g1 = new Grid<Integer>(a);
        Grid<String> g2 = new Grid<String>(b);
        
        System.out.println("Row-major tester for g1");
        System.out.println("Should be: 11 12 13 14 15 16 17 18 19 20 21 22");
        for(Integer num : g1) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("Row-major tester for g2");
        System.out.println("Should be: ab cd ef gh ij kl");
        for(String str : g2) {
            System.out.print(str + " ");
        }
        System.out.println();
        
        g1.switchMode();
        g2.switchMode();
        
        System.out.println("Column-major tester for g1");
        System.out.println("Should be: 11 15 19 12 16 20 13 17 21 14 18 22");
        for(Integer num : g1) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("Column-major tester for g2");
        System.out.println("Should be: ab ef ij cd gh kl");
        for(String str : g2) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
