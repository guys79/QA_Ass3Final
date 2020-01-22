package System.buttomUp;
import System.Program;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class SumMinMaxBottomUp {
    private Program program= new Program();

    /**
     * This function will check the sumMinMax function when the input is null
     */
    @Test
    public void sumMinMaxWhenNull()
    {
        boolean pass= true;
        try
        {
            int [] arr = null;
            int value = program.sumMinMax(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }

    /**
     * This function will check the sumMinMax function when the input is empty
     */
    @Test
    public void sumMinMaxWhenEmpty()
    {
        boolean pass= true;
        try
        {
            int [] arr = {};
            int value = program.sumMinMax(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }

    /**
     * This function will check the sumMinMax function when the input is valid
     */
    @Test
    public void sumMinMaxValidInput()
    {
        int [] arr = {4,3,2,1};
        int value = program.sumMinMax(arr);
        assertEquals(5,value);
    }

}
