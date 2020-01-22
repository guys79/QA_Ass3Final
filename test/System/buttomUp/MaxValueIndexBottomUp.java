package System.buttomUp;
import System.Program;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MaxValueIndexBottomUp {
    private Program program= new Program();
    private final int BOUND = 100;//The bound
    private Random rand=new Random();// The random variable
    /**
     * This function will check the maxIndexValue function when the input is null
     */
    @Test
    public void  maxValueIndexNullCheck()
    {
        boolean pass = true;
        try {
            program.maxValueIndex(null);
        }
        catch(Exception e)
        {
            pass = false;

        }
        assertTrue(pass);
    }

    /**
     * This function will check the maxValueIndex function when the input is valid
     */
    @Test
    public void  maxValueIndexValidCheck()
    {
        int [] arr = {3,4,2,1};
        int index;
        index = program.maxValueIndex(arr);
        assertEquals(1,index);
    }

    /**
     * This function will check the maxValueIndex function when the input is an empty array
     */
    @Test
    public void  maxValueIndexValidEmptyCheck()
    {
        int [] arr = {};
        int index;
        index = program.maxValueIndex(arr);
        assertEquals(-1,index);
    }
    /**
     * This function will check the maxValueIndex function when the input is an array with the size of 1
     */
    @Test
    public void  maxValueIndexValidSingleCheck()
    {
        int [] arr = {this.rand.nextInt(this.BOUND)};
        int index;
        index = program.maxValueIndex(arr);
        assertEquals(0,index);
    }
}
