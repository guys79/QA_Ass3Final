import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * This class is responsible for the unit testing of the class
 */
public class ProgramTest {

    private Random rand;// The random variable
    private final int BOUND = 100;//The bound

    /**
     * This function will set up the class for the unit testing
     */
    @Before
    public void setUp()
    {
        this.rand = new Random();
    }

    /**
     * This function will check the size function when the input is null
     */
    @Test
   public void sizeCheckForNull()
   {
       boolean pass = true;
        try {
            Program.size(null);
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
       int size = Program.size(array);
       assertEquals(size,array.length);
   }


}