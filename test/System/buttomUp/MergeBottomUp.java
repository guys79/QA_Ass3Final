package System.buttomUp;
import System.Program;
import org.junit.Test;

import java.util.HashMap;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MergeBottomUp {
    private Program program = new Program();
    private final int BOUND = 100;//The bound
    private Random rand = new Random();// The random variable
    /**
     * This function will check the merge function when the inputs are two null arrays
     */

    /**
     * This function will return a random array with a random size and random values
     *
     * @return - Random array
     */
    private int[] randomArray() {
        int size = 1 + this.rand.nextInt(this.BOUND);
        return randomArray(size);
    }

    /**
     * This function will return a random array with a given size and random values
     *
     * @param size - given size
     * @return - Random array
     */
    private int[] randomArray(int size) {

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = this.rand.nextInt(this.BOUND);
        }
        return array;
    }


    /**
     * This function will return if the second array are has the same elements as the first array
     *
     * @param array1 - The first given array
     * @param array2 - The second given array
     * @return - True IFF the first and second array have the same elements
     */
    private boolean sameElements(int[] array1, int[] array2) {
        HashMap<Integer, Integer> values = new HashMap<>();
        int num;
        int count;
        if (array1 == null && array2 == null)
            return true;

        if (array1 == null || array2 == null)
            return false;

        if (array1.length != array2.length)
            return false;

        for (int i = 0; i < array1.length; i++) {
            num = array1[i];
            if (!values.containsKey(num)) {
                values.put(num, 0);
            }
            count = values.get(num);
            values.put(num, count + 1);
        }
        for (int i = 0; i < array2.length; i++) {
            if (!values.containsKey(array2[i]))
                return false;
            count = values.get(array2[i]);
            values.put(array2[i], count - 1);
        }


        for (Integer appear : values.values()) {
            if (appear.intValue() != 0)
                return false;
        }
        return true;
    }

    @Test
    public void mergeTwoNull() {
        int[] array1 = null;
        int[] array2 = null;
        int[] merged = program.merge(array1, array2);
        assertTrue(merged == null);
    }

    /**
     * This function will check the merge function when the inputs are one array and one null array
     */
    @Test
    public void mergeOneNull() {
        int[] array1 = {1, 2, 3, 4};
        //int [] array1 = randomArray();
        int[] array2 = null;
        int[] merged = program.merge(array1, array2);
        assertTrue(merged != null);
        assertTrue(sameElements(array1, merged));

        merged = program.merge(array2, array1);
        assertTrue(merged != null);
        assertTrue(sameElements(array1, merged));

    }

    /**
     * This function will check the merge function when the inputs are two empty arrays
     */
    @Test
    public void mergeTwoEmpty() {
        int[] array1 = {};
        int[] array2 = {};
        int[] merged = program.merge(array1, array2);
        assertTrue(merged != null);
        assertEquals(array1.length, 0);
    }

    /**
     * This function will check the merge function when the inputs are one empty array and one regular array
     */
    @Test
    public void mergeOneEmpty() {
        int[] array1 = randomArray();
        int[] array2 = {};
        int[] merged = program.merge(array1, array2);
        assertTrue(merged != null);
        assertTrue(sameElements(array1, merged));
        merged = array1;
        array1 = array2;
        array2 = merged;

        merged = program.merge(array2, array1);
        assertTrue(merged != null);
        assertTrue(sameElements(array2, merged));
    }

    /**
     * This function will check the merge function when the inputs are two arrays
     */
    @Test
    public void mergeTwoArrays() {
        int[] array1 = randomArray();
        int[] array2 = randomArray();
        int[] merged = program.merge(array1, array2);
        assertTrue(merged != null);
        assertEquals(array1.length + array2.length, merged.length);
        HashMap<Integer, Integer> values = new HashMap<>();
        int num;
        int count;


        for (int i = 0; i < array1.length; i++) {
            num = array1[i];
            if (!values.containsKey(num)) {
                values.put(num, 0);
            }
            count = values.get(num);
            values.put(num, count + 1);
        }
        for (int i = 0; i < array2.length; i++) {
            num = array2[i];
            if (!values.containsKey(num)) {
                values.put(num, 0);
            }
            count = values.get(num);
            values.put(num, count + 1);
        }

        for (int i = 0; i < merged.length; i++) {
            assertTrue(values.containsKey(merged[i]));
            count = values.get(merged[i]);
            values.put(merged[i], count - 1);
        }
    }
}
