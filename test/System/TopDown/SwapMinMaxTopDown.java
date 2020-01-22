package System.TopDown;

import System.Stubs.FourthTree.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import System.Program;
public class SwapMinMaxTopDown {

    /**
     * This function will check the swapMinMax function when the input is null
     */
    @Test
    public void swapMinMaxWhenNull()
    {
        boolean pass = true;
        Program program;
        int [] arr;
        try
        {
            program = new SwapMinMaxStubCopyArrMaxValueIndexWhenNull();
            arr = program.swapMinMax(null);
            assertTrue(arr ==null);

            program = new SwapMinMaxStubCopyArrMaxValueWhenNull();
            arr = program.swapMinMax(null);
            assertTrue(arr ==null);

            program = new SwapMinMaxStubSizeWhenNull();
            arr = program.swapMinMax(null);
            assertTrue(arr ==null);

            program = new Program();
            arr = program.swapMinMax(null);
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
        Program program;
        int [] array = {};
        int [] arr;
        try
        {
            program = new SwapMinMaxStubCopyArrMaxValueIndexWhenEmpty();
            arr = program.swapMinMax(array);
            assertTrue(arr ==null);

            program = new SwapMinMaxStubCopyArrMaxValueWhenEmpty();
            arr = program.swapMinMax(array);
            assertTrue(arr ==null);

            program = new SwapMinMaxStubSizeWhenEmpty();
            arr = program.swapMinMax(array);
            assertTrue(arr ==null);

            program = new Program();
            arr = program.swapMinMax(array);
            assertTrue(arr ==null);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }

    /**
     * This function will check the swapMinMax function when the input is sorted
     */
    @Test
    public void swapMinMaxWhenSorted()
    {

        int [] array = {1,2,3,4,5,6};
        //int [] array2 = {1,5,4,3,2,6};
        int [] arr;
        boolean pass = true;
        int [] expected = {6,2,3,4,5,1};
        Program program;
        try
        {
            program = new SwapMinMaxStubCopyArrMaxValueIndexWhenValidSorted();
            arr = program.swapMinMax(array);
            assertTrue(areEqual(arr,expected));

            program = new SwapMinMaxStubCopyArrMaxValueWhenValidSorted();
            arr = program.swapMinMax(array);
            assertTrue(areEqual(arr,expected));

            program = new SwapMinMaxStubSizeWhenSorted();
            arr = program.swapMinMax(array);
            assertTrue(areEqual(arr,expected));

            program = new Program();
            arr = program.swapMinMax(array);
            assertTrue(areEqual(arr,expected));
        }
        catch(Exception e)
        {
            e.printStackTrace();
            pass = false;
        }
        assertTrue(pass);

    }
    /**
     * This function will check the swapMinMax function when the input is not sorted
     */
    @Test
    public void swapMinMaxWhenNotSorted()
    {

        int [] array = {1,5,4,3,2,6};
        int [] arr;
        boolean pass = true;
        int [] expected = {6,5,4,3,2,1};
        Program program;
        try
        {
            program = new SwapMinMaxStubCopyArrMaxValueIndexWhenValidNotSorted();
            arr = program.swapMinMax(array);
            assertTrue(areEqual(arr,expected));

            program = new SwapMinMaxStubCopyArrMaxValueWhenValidNotSorted();
            arr = program.swapMinMax(array);
            assertTrue(areEqual(arr,expected));

            program = new SwapMinMaxStubSizeWhenNotSorted();
            arr = program.swapMinMax(array);
            assertTrue(areEqual(arr,expected));

            program = new Program();
            arr = program.swapMinMax(array);
            assertTrue(areEqual(arr,expected));
        }
        catch(Exception e)
        {
            e.printStackTrace();
            pass = false;
        }
        assertTrue(pass);

    }
    private boolean areEqual(int [] arr1, int [] arr2)
    {
        if(arr1 == null && arr2 == null)
            return true;
        if(arr1 == null || arr2 == null)
            return false;
        if(arr1.length != arr2.length)
            return false;

        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}
