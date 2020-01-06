import org.junit.Before;
import org.junit.Test;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashMap;
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

    /**
     * This function will check the printArr function when the input is null
     */
   @Test
    public void printArrNullCheck()
   {
       boolean pass = true;
       try {
           Program.printArr(null);
       }
       catch(Exception e)
       {
           pass = false;

       }
       assertTrue(pass);
   }

    /**
     * This function will check the minIndexValue function when the input is null
     */
    @Test
    public void  minValueIndexNullCheck()
    {
        boolean pass = true;
        try {
            Program.minValueIndex(null);
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
        index = Program.minValueIndex(arr);
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
        index = Program.minValueIndex(arr);
        assertEquals(-1,index);
    }

    /**
     * This function will check the maxIndexValue function when the input is null
     */
    @Test
    public void  maxValueIndexNullCheck()
    {
        boolean pass = true;
        try {
            Program.maxValueIndex(null);
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
        int [] arr = {4,3,2,1};
        int index;
        index = Program.maxValueIndex(arr);
        assertEquals(0,index);
    }

    /**
     * This function will check the maxValueIndex function when the input is an empty array
     */
    @Test
    public void  maxValueIndexValidEmptyCheck()
    {
        int [] arr = {};
        int index;
        index = Program.maxValueIndex(arr);
        assertEquals(-1,index);
    }

    /**
     * This function will check the maxValue function when the input is null
     */
    @Test
    public void maxValueWhenNull()
    {
        boolean pass = true;
        try
        {
            Program.maxValue(null);
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
        int value = Program.maxValue(arr);
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
            int value = Program.maxValue(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);

    }

    /**
     * This function will check the minValue function when the input is null
     */
    @Test
    public void minValueWhenNull()
    {
        boolean pass = true;
        try
        {
            Program.minValue(null);
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
        int value = Program.minValue(arr);
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
            int value = Program.minValue(arr);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);

    }

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
            int value = Program.sumMinMax(arr);
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
            int value = Program.sumMinMax(arr);
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
        int value = Program.sumMinMax(arr);
        assertEquals(5,value);
    }

    /**
     * This function will check the copyArr function when the input is null
     */
    @Test
    public void copyArrWhenNull()
    {
        boolean pass = true;
        try
        {
            int [] arr = Program.copyArr(null);
            assertTrue(arr ==null);
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }
    /**
     * This function will check the copyArr function when the input is empty
     */
    @Test
    public void copyArrWhenEmpty()
    {
        boolean pass = true;
        int [] array = {};
        try
        {
            int [] arr = Program.copyArr(array);
            assertTrue(arr !=null);
            assertEquals(array.length,arr.length);

        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }

    private int [] randomArray()
    {
        int size = 1 + this.rand.nextInt(this.BOUND);
        return randomArray(size);
    }
    private int [] randomArray(int size)
    {

        int [] array = new int[size];

        for(int i=0;i<size;i++)
        {
            array[i] =  this.rand.nextInt(this.BOUND);
        }
        return array;
    }
    /**
     * This function will check the copyArr function when the input is valid
     */
    @Test
    public void copyArrWhenValidInput()
    {
        boolean pass = true;
        int size = 2 + this.rand.nextInt(this.BOUND);
        int [] array = randomArray(size);
        array[0] = 0;
        array[1] = 1;
        try
        {
            int [] arr = Program.copyArr(array);
            assertTrue(arr != array);
            assertEquals(array.length,arr.length);
            for(int i=0;i<size;i++)
            {
                assertEquals(array[i],arr[i]);
            }
        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }


    /**
     * This function will check the swapMinMax function when the input is null
     */
    @Test
    public void swapMinMaxWhenNull()
    {
        boolean pass = true;
        try
        {
            int [] arr = Program.swapMinMax(null);
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
            int [] arr = Program.swapMinMax(array);
            assertTrue(arr !=null);
            assertEquals(array.length,arr.length);

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
        try
        {
            int [] arr = Program.swapMinMax(array);
            assertTrue(arr !=null);
            assertEquals(array.length,arr.length);

            assertEquals(arr[0],array[5]);
            assertEquals(array[0],arr[5]);

            for(int i=2;i<arr.length-1;i++)
            {
                assertEquals(array[i],arr[i]);
            }

        }
        catch(Exception e)
        {
            pass = false;
        }
        assertTrue(pass);
    }

    /**
     * This function will check the sortArrayIndex function when the input is valid
     */
    @Test
    public void  sortArrayValidCheck()
    {
        int [] array = randomArray();
        HashMap<Integer,Integer> values = new HashMap<>();
        int num;
        int count;
        for(int i=0;i<array.length-1;i++)
        {
            num = array[i];
            if(!values.containsKey(num))
            {
                values.put(num,0);
            }
            count = values.get(num);
            values.put(num,count+1);
        }

        int [] arr = Program.sortArray(array);
        assertTrue(arr!=array);
        assertEquals(arr.length,array.length);

        for(int i=0;i<arr.length-1;i++)
        {
            assertTrue(arr[i]<=arr[i+1]);
            assertTrue(values.containsKey(arr[i]));
            count = values.get(arr[i]);
            values.put(arr[i],count-1);
        }
        //last
        assertTrue(values.containsKey(arr[arr.length-1]));
        count = values.get(arr[arr.length-1]);
        values.put(arr[arr.length-1],count-1);

        for(Integer appear : values.values())
        {
            assertEquals(appear.intValue(),0);
        }
    }

    /**
     * This function will check the sortArray function when the input is an empty array
     */
    @Test
    public void  sortArrayValidEmptyCheck()
    {
        int [] array = {};
        int [] arr = Program.sortArray(array);
        assertTrue(arr!=array);
        assertEquals(arr.length,array.length);
    }
    /**
     * This function will check the sortArray function when the input is an empty array
     */
    @Test
    public void sortArrayNull()
    {
        int [] array = null;
        int [] arr = Program.sortArray(array);
        assertTrue(arr==null);

    }

   //@Test
   // public void
}