package System.TopDown;

import System.Stubs.FiveTree.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import System.Program;
public class SumMinMaxTopDown {
    /**
     * This function will check the sumMinMax function when the input is null
     */
    @Test
    public void sumMinMaxWhenNull()
    {
        boolean pass= true;
        Program program;
        try
        {
            program = new SumMinMaxStubMinValueIndexMaxValueIndexWhenNull();
            int [] arr = null;
            int value = program.sumMinMax(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);

        try
        {
            program = new SumMinMaxStubMinValueMaxValueWhenNull();
            int [] arr = null;
            int value = program.sumMinMax(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);

        try
        {
            program = new SumMinMaxStubMinValueIndexMaxValueWhenNull();
            int [] arr = null;
            int value = program.sumMinMax(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);

        try
        {
            program = new SumMinMaxStubSizeWhenNull();
            int [] arr = null;
            int value = program.sumMinMax(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);

        try
        {
            program = new Program();
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
        Program program;
        try
        {
            program = new SumMinMaxStubMinValueIndexMaxValueIndexWhenEmpty();
            int [] arr = {};
            int value = program.sumMinMax(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);

        try
        {
            program = new SumMinMaxStubMinValueMaxValueWhenEmpty();
            int [] arr = {};
            int value = program.sumMinMax(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);

        try
        {
            program = new SumMinMaxStubMinValueIndexMaxValueWhenEmpty();
            int [] arr = {};
            int value = program.sumMinMax(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);

        try
        {
            program = new SumMinMaxStubSizeWhenEmpty();
            int [] arr = {};
            int value = program.sumMinMax(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);

        try
        {
            program = new Program();
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
        Program program;
        int [] arr = {1,5,4,3,2,6};
        int expected = 7;

        program = new SumMinMaxStubMinValueIndexMaxValueIndexWhenEmpty();
        int value = program.sumMinMax(arr);
        assertEquals(expected,expected);

        program = new SumMinMaxStubMinValueMaxValueWhenEmpty();
        value = program.sumMinMax(arr);
        assertEquals(expected,expected);

        program = new SumMinMaxStubMinValueIndexMaxValueWhenEmpty();
        value = program.sumMinMax(arr);
        assertEquals(expected,expected);


        program = new SumMinMaxStubSizeWhenEmpty();
        value = program.sumMinMax(arr);
        assertEquals(expected,expected);


        program = new Program();
        value = program.sumMinMax(arr);
        assertEquals(expected,expected);



    }
}
