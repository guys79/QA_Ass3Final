package System.buttomUp;
import System.Program;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class SizeBottomUp {
    private Program program= new Program();
    private Random rand=new Random();// The random variable
    private final int BOUND = 100;//The bound
    /**
     * This function will check the size function when the input is null
     */
    @Test
    public void sizeCheckForNull()
    {
        boolean pass = true;
        try {
            program.size(null);
        }
        catch(Exception e)
        {
            pass = false;

        }
        assertTrue(pass);
    }

    /**
     * This function will check the size function when the input is valid
     */
    @Test
    public void validSizeCheck()
    {
        int arraySize = this.rand.nextInt(this.BOUND);
        int [] array = new int[arraySize];
        int size = program.size(array);
        assertEquals(size,array.length);
    }
}
