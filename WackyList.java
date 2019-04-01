import java.util.*;

/**
 * Problem 2:
 * 
 * This class extends (IS-A) the familiar ArrayList.
 * All methods from the AP Subset work as usual.
 * 
 * The difference is that this can iterate in different "modes."
 * Write an iterator for each mode.
 */
public class WackyList<T> extends ArrayList<T>
{
    private static final String[] MODES = {"DEFAULT", "BACKWARD", "JUMP_FWD_BACK", "EVERY_TWO"}; 
    
    private int modeNum;
    private String mode;
    
    public WackyList() {
        modeNum = 0;
        mode = MODES[modeNum];
    }
    
    /**
     * Goes to the next mode in the list of modes above.
     */
    public void switchMode() {
        modeNum++;
        modeNum %= MODES.length;
        mode = MODES[modeNum];
    }
    
    /**
     * This method should return an iterator corresponding to which mode
     * we are in.
     * 
     * Modify this method to return a different kind of iterator
     * depending on the mode.
     */
    @Override
    public Iterator iterator() {
        if(mode.equals("DEFAULT")) {
            return new DefaultIterator();
        }
        else if(mode.equals("BACKWARD")) {
            return new BackwardIterator();
        }
        else if(mode.equals("JUMP_FWD_BACK")) {
            return new JumpIterator();
        }
        else if(mode.equals("EVERY_TWO")) {
            return new TwoIterator();
        }
    }
    
    private class DefaultIterator implements Iterator<Integer> {
        public boolean hasNext() {
            
        }
        public T next() {
            
        }
    }
    
    private class BackwardIterator implements Iterator<Integer> {
        public boolean hasNext() {
            
        }
        public T next() {
            
        }
    }
    
    private class JumpIterator implements Iterator<Integer> {
        public boolean hasNext() {
            
        }
        public T next() {
            
        }
    }
    
    private class TwoIterator implements Iterator<Integer> {
        public boolean hasNext() {
            
        }
        public T next() {
            
        }
    }
    
    /**
     * Write three private Iterator classes below, for "BACKWARD",
     * "JUMP_FWD_BACK", and "EVERY_TWO" modes.
     * 
     * You SHOULD NOT write a new Iterator for the "DEFAULT"
     * mode. Instead, figure out how to return the original one
     * that comes with the built-in ArrayList class.
     */
    
    // All iterator classes go here.
    
    /**
     * Tester code
     */
    public static void tester() {
        WackyList<Integer> list1 = new WackyList<Integer>();
        
        for(int i = 10; i < 15; i++) {
            list1.add(i);
        }
        
        WackyList<Integer> list2 = new WackyList<Integer>();
        for(int i = 20; i < 26; i++) {
            list2.add(i);
        }
        
        System.out.println("List " + list1 + " with DEFAULT mode");
        System.out.println("Should be: 10 11 12 13 14");
        System.out.print("Test: ");
        for(Integer x : list1) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        System.out.println("List " + list2 + " with DEFAULT mode");
        System.out.println("Should be: 20 21 22 23 24 25");
        System.out.print("Test: ");
        for(Integer x : list2) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        // Switch modes to BACKWARD
        list1.switchMode();
        list2.switchMode();
        
        System.out.println("List " + list1 + " with BACKWARD mode");
        System.out.println("Should be: 14 13 12 11 10");
        System.out.print("Test: ");
        for(Integer x : list1) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        System.out.println("List " + list2 + " with BACKWARD mode");
        System.out.println("Should be: 25 24 23 22 21 20");
        System.out.print("Test: ");
        for(Integer x : list2) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        // Switch modes to JUMP_FWD_BACK
        list1.switchMode();
        list2.switchMode();
        
        System.out.println("List " + list1 + " with JUMP_FWD_BACK mode");
        System.out.println("Should be: 10 14 11 13 12");
        System.out.print("Test: ");
        for(Integer x : list1) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        System.out.println("List " + list2 + " with JUMP_FWD_BACK mode");
        System.out.println("Should be: 20 25 21 24 22 23");
        System.out.print("Test: ");
        for(Integer x : list2) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        // Switch modes to EVERY_TWO
        list1.switchMode();
        list2.switchMode();
        
        System.out.println("List " + list1 + " with EVERY_TWO mode");
        System.out.println("Should be: 10 12 14 11 13");
        System.out.print("Test: ");
        for(Integer x : list1) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        System.out.println("List " + list2 + " with EVERY_TWO mode");
        System.out.println("Should be: 20 22 24");
        System.out.print("Test: ");
        for(Integer x : list2) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        // Switch modes back to DEFAULT
        list1.switchMode();
        list2.switchMode();
        
        System.out.println("List " + list1 + " with DEFAULT mode");
        System.out.println("Should be: 10 11 12 13 14");
        System.out.print("Test: ");
        for(Integer x : list1) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        System.out.println("List " + list2 + " with DEFAULT mode");
        System.out.println("Should be: 20 21 22 23 24 25");
        System.out.print("Test: ");
        for(Integer x : list2) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
