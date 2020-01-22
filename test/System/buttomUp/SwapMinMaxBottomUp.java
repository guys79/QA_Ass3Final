package System.buttomUp;
import System.Program;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class SwapMinMaxBottomUp {
    private Program program= new Program();

    /**
     * This function will check the swapMinMax function when the input is null
     */
    @Test
    public void swapMinMaxWhenNull()
    {
        boolean pass = true;
        try
        {
            int [] arr = program.swapMinMax(null);
            assertTrue(arr ==null);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }
    /**
     * This function will check the swapMinMax function when the input is empty
     */
    @Test
    public void swapMinMaxWhenEmpty()
    {
        boolean pass = true;
        int [] array = {};
        try
        {
            int [] arr = program.swapMinMax(array);
            assertTrue(arr ==null);


        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }

    /**
     * This function will check the swapMinMax function when the input is valid
     */
    @Test
    public void swapMinMaxWhenValid()
    {
        boolean pass = true;
        int [] array = {6,5,4,3,2,1};
        int [] array2 = {1,5,4,3,2,6};
        try
        {
            int [] arr = program.swapMinMax(array);

            assertTrue(arr !=null);
            assertEquals(array.length,arr.length);

            assertEquals(arr[0],array[5]);
            assertEquals(array[0],arr[5]);

            for(int i=2;i<arr.length-1;i++)
            {
                assertEquals(array[i],arr[i]);
            }

            arr = program.swapMinMax(array2);
            assertTrue(arr !=null);
            assertEquals(array2.length,arr.length);

            assertEquals(arr[0],array2[5]);
            assertEquals(array2[0],arr[5]);

            for(int i=2;i<arr.length-1;i++)
            {
                assertEquals(array2[i],arr[i]);
            }

        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }

}
