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

    /**
     * This function will return a random array with a random size and random values
     * @return - Random array
     */
    private int [] randomArray()
    {
        int size = 1 + this.rand.nextInt(this.BOUND);
        return randomArray(size);
    }

    /**
     * This function will return a random array with a given size and random values
     * @param size  - given size
     * @return - Random array
     */
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
     * This function will return if the second array are has the same elements as the first array
     * @param array1 - The first given array
     * @param array2 - The second given array
     * @return - True IFF the first and second array have the same elements
     */
    private boolean sameElements(int [] array1,int [] array2)
    {
        HashMap<Integer,Integer> values = new HashMap<>();
        int num;
        int count;
        if(array1 == null && array2 == null)
            return true;

        if(array1 == null || array2 == null)
            return false;

        if(array1.length!=array2.length)
            return false;

        for(int i=0;i<array1.length;i++)
        {
            num = array1[i];
            if(!values.containsKey(num))
            {
                values.put(num,0);
            }
            count = values.get(num);
            values.put(num,count+1);
        }
        for(int i=0;i<array2.length;i++)
        {
            if(!values.containsKey(array2[i]))
                return false;
            count = values.get(array2[i]);
            values.put(array2[i],count-1);
        }


        for(Integer appear : values.values())
        {
            if(appear.intValue()!=0)
                return false;
        }
        return true;
    }
    /**
     * This function will check the sortArrayIndex function when the input is valid
     */
    @Test
    public void  sortArrayValidCheck()
    {
        int [] array = randomArray();
        int [] arr = Program.sortArray(array);
        assertTrue(arr!=array);
        assertEquals(arr.length,array.length);
       assertTrue(sameElements(array,arr));


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

    /**
     * This function will check the function equalArray when the inputs are 2 nulls
     */
   @Test
   public void equalArraysWhenBothNull()
   {
       int [] arr1 = null;
       int [] arr2 = null;
       assertTrue(Program.equalArrays(arr1,arr2));
       assertTrue(Program.equalArrays(arr2,arr1));
   }

    /**
     * This function will check the function equalArray when the inputs are one null object and one random array
     */
    @Test
    public void equalArraysWhenOnlyOneNull()
    {
        int [] arr1 = randomArray();
        int [] arr2 = null;
        assertTrue(!Program.equalArrays(arr1,arr2));
        assertTrue(!Program.equalArrays(arr2,arr1));
    }

    /**
     * This function will check the function equalArray when the inputs are 2 empty arrays
     */
    @Test
    public void equalArraysWhenBothEmpty()
    {
        int [] arr1 = {};
        int [] arr2 = {};
        assertTrue(Program.equalArrays(arr1,arr2));
        assertTrue(Program.equalArrays(arr2,arr1));
    }

    /**
     * This function will check the function equalArray when the inputs are 2 arrays with different sizes
     */
    @Test
    public void equalArraysDifferentSizes()
    {
        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3,4};
        assertTrue(!Program.equalArrays(arr1,arr2));
        assertTrue(!Program.equalArrays(arr2,arr1));
    }

    /**
     * This function will check the function equalArray when the inputs are 2 equal arrays
     */
    @Test
    public void equalArraysEquals()
    {
        int [] arr1 = randomArray();
        int [] arr2 = new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i] = arr1[i];
        }
        assertTrue(Program.equalArrays(arr1,arr2));
        assertTrue(Program.equalArrays(arr2,arr1));
    }

    /**
     * This function will check the function equalArray when the inputs are 2 non - equal arrays
     */
    @Test
    public void equalArraysNotEquals()
    {
        int [] arr1 = randomArray();
        int [] arr2 = new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i] = arr1[i];
        }
        arr2[0] = this.rand.nextInt(this.BOUND) +this.BOUND + 2;
        assertTrue(!Program.equalArrays(arr1,arr2));
        assertTrue(!Program.equalArrays(arr2,arr1));
    }

    /**
     * This function will check the isSorted function when the input is null
     */
    @Test
    public void isSortedArrayWhenNull(){
        int [] array = null;
        assertTrue(Program.isSorted(array));
    }
    /**
     * This function will check the isSorted function when the input is empty
     */
    @Test
    public void isSortedArrayWhenEmpty(){
        int [] array = {};
        assertTrue(Program.isSorted(array));
    }
    /**
     * This function will check the isSorted function when the input is a sorted array
     */
    @Test
    public void isSortedArrayWhenNotSorted(){
        int [] array = {3,4,1};
        assertTrue(!Program.isSorted(array));
    }
    /**
     * This function will check the isSorted function when the input is a not sorted array
     */
    @Test
    public void isSortedArrayWhenSorted(){
        int [] array = {1,2,3,4,5,5};
        assertTrue(Program.isSorted(array));
    }

    /**
     * This function will check the merge function when the inputs are two null arrays
     */
    @Test
    public void mergeTwoNull(){
        int [] array1 = null;
        int [] array2 = null;
        int [] merged = Program.merge(array1,array2);
        assertTrue(merged == null);
    }
    /**
     * This function will check the merge function when the inputs are one array and one null array
     */
    @Test
    public void mergeOneNull(){
        int [] array1 = {1,2,3,4};
        //int [] array1 = randomArray();
        int [] array2 = null;
        int [] merged = Program.merge(array1,array2);
        assertTrue(merged != null);
        assertTrue(sameElements(array1,merged));
        merged = array1;
        array1 = array2;
        array2 = merged;

        merged = Program.merge(array2,array1);
        assertTrue(merged != null);
        assertTrue(sameElements(array2,merged));

    }
    /**
     * This function will check the merge function when the inputs are two empty arrays
     */
    @Test
    public void mergeTwoEmpty(){
        int [] array1 = {};
        int [] array2 = {};
        int [] merged = Program.merge(array1,array2);
        assertTrue(merged != null);
        assertEquals(array1.length,0);
    }
    /**
     * This function will check the merge function when the inputs are one empty array and one regular array
     */
    @Test
    public void mergeOneEmpty(){
        int [] array1 = randomArray();
        int [] array2 = {};
        int [] merged = Program.merge(array1,array2);
        assertTrue(merged != null);
        assertTrue(sameElements(array1,merged));
        merged = array1;
        array1 = array2;
        array2 = merged;

        merged = Program.merge(array2,array1);
        assertTrue(merged != null);
        assertTrue(sameElements(array2,merged));
    }

    /**
     * This function will check the merge function when the inputs are two arrays
     */
    @Test
    public void mergeTwoArrays(){
        int [] array1 = randomArray();
        int [] array2 = randomArray();
        int [] merged = Program.merge(array1,array2);
        assertTrue(merged != null);
        assertEquals(array1.length+array2.length,merged.length);
        HashMap<Integer,Integer> values = new HashMap<>();
        int num;
        int count;



        for(int i=0;i<array1.length;i++)
        {
            num = array1[i];
            if(!values.containsKey(num))
            {
                values.put(num,0);
            }
            count = values.get(num);
            values.put(num,count+1);
        }
        for(int i=0;i<array2.length;i++)
        {
            num = array2[i];
            if(!values.containsKey(num))
            {
                values.put(num,0);
            }
            count = values.get(num);
            values.put(num,count+1);
        }

        for(int i=0;i<merged.length;i++)
        {
            assertTrue(values.containsKey(merged[i]));
            count = values.get(merged[i]);
            values.put(merged[i],count-1);
        }


        for(Integer appear : values.values())
        {
            assertEquals(appear.intValue(),0);

        }
    }
}