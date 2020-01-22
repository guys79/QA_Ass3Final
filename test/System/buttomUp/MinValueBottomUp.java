package System.buttomUp;
import System.Program;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MinValueBottomUp {
    private Program program= new Program();
    /**
     * This function will check the minValue function when the input is null
     */
    @Test
    public void minValueWhenNull()
    {
        boolean pass = true;
        try
        {
            program.minValue(null);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }

    /**
     * This function will check the minValue function when the input is valid
     */
    @Test
    public void minValueValidInput()
    {
        int [] arr = {4,3,2,1};
        int value = program.minValue(arr);
        assertEquals(1,value);
    }

    /**
     * This function will check the minValue function when the input is an empty array
     */
    @Test
    public void minValueValidInputEmpty()
    {
        boolean pass= true;
        try
        {
            int [] arr = {};
            int value = program.minValue(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);

    }
}
