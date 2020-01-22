package System.buttomUp;

import System.Program;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IsSortedBottomUp {
    private Program program= new Program();
    /**
     * This function will check the isSorted function when the input is null
     */
    @Test
    public void isSortedArrayWhenNull(){
        int [] array = null;
        assertTrue(program.isSorted(array));
    }
    /**
     * This function will check the isSorted function when the input is empty
     */
    @Test
    public void isSortedArrayWhenEmpty(){
        int [] array = {};
        assertTrue(program.isSorted(array));
    }
    /**
     * This function will check the isSorted function when the input is a sorted array
     */
    @Test
    public void isSortedArrayWhenNotSorted(){
        int [] array = {3,4,1};
        assertTrue(!program.isSorted(array));
    }
    /**
     * This function will check the isSorted function when the input is a not sorted array
     */
    @Test
    public void isSortedArrayWhenSorted(){
        int [] array = {1,2,3,4,5,5};
        assertTrue(program.isSorted(array));
    }
}
