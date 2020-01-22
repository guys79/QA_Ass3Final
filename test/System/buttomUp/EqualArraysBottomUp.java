package System.buttomUp;
import System.Program;
import org.junit.Test;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class EqualArraysBottomUp {
    private final int BOUND = 100;//The bound
    private Random rand=new Random();// The random variable
    private Program program= new Program();


    /**
     * This function will return a random array with a random size and random values
     * @return - Random array
     */
    private int [] randomArray()
    {
        int size = 1 + this.rand.nextInt(this.BOUND);
        return randomArray(size);
    }

    /**
     * This function will return a random array with a given size and random values
     * @param size  - given size
     * @return - Random array
     */
    private int [] randomArray(int size)
    {

        int [] array = new int[size];

        for(int i=0;i<size;i++)
        {
            array[i] =  this.rand.nextInt(this.BOUND);
        }
        return array;
    }

    /**
     * This function will check the function equalArray when the inputs are 2 nulls
     */
    @Test
    public void equalArraysWhenBothNull()
    {
        int [] arr1 = null;
        int [] arr2 = null;
        assertTrue(program.equalArrays(arr1,arr2));
        assertTrue(program.equalArrays(arr2,arr1));
    }

    /**
     * This function will check the function equalArray when the inputs are one null object and one random array
     */
    @Test
    public void equalArraysWhenOnlyOneNull()
    {
        int [] arr1 = randomArray();
        int [] arr2 = null;
        assertTrue(!program.equalArrays(arr1,arr2));
        assertTrue(!program.equalArrays(arr2,arr1));
    }

    /**
     * This function will check the function equalArray when the inputs are 2 empty arrays
     */
    @Test
    public void equalArraysWhenBothEmpty()
    {
        int [] arr1 = {};
        int [] arr2 = {};
        assertTrue(program.equalArrays(arr1,arr2));
        assertTrue(program.equalArrays(arr2,arr1));
    }

    /**
     * This function will check the function equalArray when the inputs are 2 arrays with different sizes
     */
    @Test
    public void equalArraysDifferentSizes()
    {
        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3,4};
        assertTrue(!program.equalArrays(arr1,arr2));
        assertTrue(!program.equalArrays(arr2,arr1));
    }

    /**
     * This function will check the function equalArray when the inputs are 2 equal arrays
     */
    @Test
    public void equalArraysEquals()
    {
        int [] arr1 = randomArray();
        int [] arr2 = new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i] = arr1[i];
        }
        assertTrue(program.equalArrays(arr1,arr2));
        assertTrue(program.equalArrays(arr2,arr1));
    }

    /**
     * This function will check the function equalArray when the inputs are 2 non - equal arrays
     */
    @Test
    public void equalArraysNotEquals()
    {
        int [] arr1 = randomArray();
        int [] arr2 = new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i] = arr1[i];
        }
        arr2[0] = this.rand.nextInt(this.BOUND) +this.BOUND + 2;
        assertTrue(!program.equalArrays(arr1,arr2));
        assertTrue(!program.equalArrays(arr2,arr1));
    }


}
