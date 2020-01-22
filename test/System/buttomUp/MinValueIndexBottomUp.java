package System.buttomUp;
import System.Program;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MinValueIndexBottomUp {
    private Program program= new Program();
    /**
     * This function will check the minIndexValue function when the input is null
     */
    @Test
    public void  minValueIndexNullCheck()
    {
        boolean pass = true;
        try {
            program.minValueIndex(null);
        }
        catch(Exception e)
        {
            pass = false;

        }
        assertTrue(pass);
    }

    /**
     * This function will check the minValueIndex function when the input is valid
     */
    @Test
    public void  minValueIndexValidCheck()
    {
        int [] arr = {4,3,2,1};
        int index;
        index = program.minValueIndex(arr);
        assertEquals(3,index);
    }

    /**
     * This function will check the minValueIndex function when the input is an empty array
     */
    @Test
    public void  minValueIndexValidEmptyCheck()
    {
        int [] arr = {};
        int index;
        index = program.minValueIndex(arr);
        assertEquals(-1,index);
    }
}
