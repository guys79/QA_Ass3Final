package System.buttomUp;

import System.Program;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MaxValueBottomUp {
    private Program program= new Program();
    /**
     * This function will check the maxValue function when the input is null
     */
    @Test
    public void maxValueWhenNull()
    {
        boolean pass = true;
        try
        {
            program.maxValue(null);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }

    /**
     * This function will check the maxValue function when the input is valid
     */
    @Test
    public void maxValueValidInput()
    {
        int [] arr = {4,3,2,1};
        int value = program.maxValue(arr);
        assertEquals(4,value);
    }

    /**
     * This function will check the maxValue function when the input is an empty array
     */
    @Test
    public void maxValueValidInputEmpty()
    {
        boolean pass= true;
        try
        {
            int [] arr = {};
            int value = program.maxValue(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);

    }
}
