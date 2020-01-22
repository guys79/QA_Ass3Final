package System;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
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
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private Program program= new Program();

    /**
     * This function will set up the class for the unit testing
     */
    @Before
    public void setUp()
    {
        this.rand = new Random();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }


    /**
     * This function will check the printArray function when the input is an empty array
     */
    @Test
    public void printArrayEmptyCheck(){
        int [] array = {};
        program.printArr(array);
        String output = outContent.toString();
        String base = "\r\n";
        assertEquals(base,output);

    }

    /**
     * This function will check the printArray function when the input is a valid random array
     */
    @Test
    public void printArrayValidCheck(){
        int [] array = randomArray();
        program.printArr(array);
        String output = outContent.toString();
        String [] values = output.split(" ");
        assertTrue(bagOfStringWords(array,values));
    }

    /**
     * This function will check if the elements in arr2 (only numbers in string type) are in arr1
     * @param arr1 - The first array
     * @param arr2 - The second array
     * @return - True IFF the elements in arr2 (only numbers in string type) are in arr1
     */
    private boolean bagOfStringWords(int [] arr1,String [] arr2)
    {
        if(arr1 == null && arr2 == null)
            return true;
        if(arr1 == null || arr2 == null)
            return false;
        if(arr1.length + 1!=arr2.length)
            return false;
        String base = "\r\n";
        HashMap<String,Integer> numbers = new HashMap<>();
        numbers.put(base,1);
        int count;
        String numString;
        for(Integer num : arr1)
        {
            numString = ""+num;
            if(!numbers.containsKey(numString))
            {
                numbers.put(numString,0);
            }
            count = numbers.get(numString);
            count++;
            numbers.put(numString,count);
        }


        for(String value : arr2)
        {
            if(!numbers.containsKey(value))
                return false;
            count = numbers.get(value);
            count -- ;
            numbers.put(value,count);

        }

        for(Integer occ : numbers.values())
        {
            if(occ.intValue()!=0)
                return false;
        }
        return true;
    }
    /**
     * This function will check the printSorted function when the input is a null array
     */
    @Test
    public void printSortedNull(){

        int [] array = null;
        program.printSorted(array);
        String output = outContent.toString();
        String base = "\r\n";
        assertEquals("No array"+ base,output);

    }
    /**
     * This function will check the printSorted function when the input is an empty array
     */
    @Test
    public void printSortedEmptyCheck(){
        int [] array = {};
        program.printSorted(array);
        String output = outContent.toString();
        String base = "\r\n";
        assertEquals(base+base+base,output);

    }

    /**
     * This function will check the printSorted function when the input is a valid random array
     */
    @Test
    public void printSortedValidCheck(){

        int [] array = randomArray();
        //int [] array = {2,1};
        program.printSorted(array);
        String output = outContent.toString();
        String [] tempValues = output.split(" ");
        assertTrue(tempValues.length%3==1);
        String [] values = new String[tempValues.length+2];
        int third = values.length /3;
        int j=0;
        for(int i=0;i<values.length;i++)
        {
            if(j==third-1 || j == 2*(third-1))
            {
                values[i] = "\r\n";
                values[i+1] = tempValues[j].substring(values[i].length());
                i++;
            }
            else
            {
                values[i] = tempValues[j];

            }
            j++;
        }

        assertTrue(values.length%3==0);
        String [] valuesNotSorted1 = new String[values.length/3];
        String [] valuesSorted = new String[values.length/3];
        String [] valuesNotSorted2 = new String[values.length/3];

        for(int i=0;i<valuesNotSorted1.length;i++)
        {
            valuesNotSorted1[i] = values[i];
            valuesSorted[i] = values[(values.length/3)+i];
            valuesNotSorted2[i] = values[(2*(values.length/3))+i];
        }

        assertTrue(bagOfStringWords(array,valuesNotSorted1));
        assertTrue(bagOfStringWords(array,valuesSorted));
        assertTrue(bagOfStringWords(array,valuesNotSorted2));

        int num1,num2;
        for(int i=0;i<valuesSorted.length - 2;i++)//Without '\r\n'
        {
            num1 = Integer.parseInt(valuesSorted[i]);
            num2 = Integer.parseInt(valuesSorted[i+1]);
            assertTrue(num2>=num1);

        }
        for(int i=0;i<valuesSorted.length - 1;i++)//Without '\r\n'
        {
            num1 = Integer.parseInt(valuesNotSorted1[i]);
            num2 = Integer.parseInt(valuesNotSorted2[i]);
            assertEquals(num2,num1);

        }


    }
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

    /**
     * This function will check the printArr function when the input is null
     */
    @Test
    public void printArrNullCheck()
    {
        boolean pass = true;
        try {
            program.printArr(null);
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

    /**
     * This function will check the maxIndexValue function when the input is null
     */
    @Test
    public void  maxValueIndexNullCheck()
    {
        boolean pass = true;
        try {
            program.maxValueIndex(null);
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
        int [] arr = {3,4,2,1};
        int index;
        index = program.maxValueIndex(arr);
        assertEquals(1,index);
    }

    /**
     * This function will check the maxValueIndex function when the input is an empty array
     */
    @Test
    public void  maxValueIndexValidEmptyCheck()
    {
        int [] arr = {};
        int index;
        index = program.maxValueIndex(arr);
        assertEquals(-1,index);
    }
    /**
     * This function will check the maxValueIndex function when the input is an array with the size of 1
     */
    @Test
    public void  maxValueIndexValidSingleCheck()
    {
        int [] arr = {this.rand.nextInt(this.BOUND)};
        int index;
        index = program.maxValueIndex(arr);
        assertEquals(0,index);
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
            program.maxValue(null);
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
        int value = program.maxValue(arr);
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
            int value = program.maxValue(arr);
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

    /**
     * This function will check the copyArr function when the input is null
     */
    @Test
    public void copyArrWhenNull()
    {
        boolean pass = true;
        try
        {
            int [] arr = program.copyArr(null);
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
            int [] arr = program.copyArr(array);
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
            int [] arr = program.copyArr(array);
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
        int [] arr = program.sortArray(array);
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
        int [] arr = program.sortArray(array);
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
        int [] arr = program.sortArray(array);
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
        assertTrue(program.equalArrays(arr1,arr2));
        assertTrue(program.equalArrays(arr2,arr1));
    }

    /**
     * This function will check the function equalArray when the inputs are one null object and one random array
     */
    @Test
    public void equalArraysWhenOnlyOneNull()
    {
        int [] arr1 = randomArray();
        int [] arr2 = null;
        assertTrue(!program.equalArrays(arr1,arr2));
        assertTrue(!program.equalArrays(arr2,arr1));
    }

    /**
     * This function will check the function equalArray when the inputs are 2 empty arrays
     */
    @Test
    public void equalArraysWhenBothEmpty()
    {
        int [] arr1 = {};
        int [] arr2 = {};
        assertTrue(program.equalArrays(arr1,arr2));
        assertTrue(program.equalArrays(arr2,arr1));
    }

    /**
     * This function will check the function equalArray when the inputs are 2 arrays with different sizes
     */
    @Test
    public void equalArraysDifferentSizes()
    {
        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3,4};
        assertTrue(!program.equalArrays(arr1,arr2));
        assertTrue(!program.equalArrays(arr2,arr1));
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
        assertTrue(program.equalArrays(arr1,arr2));
        assertTrue(program.equalArrays(arr2,arr1));
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
        assertTrue(!program.equalArrays(arr1,arr2));
        assertTrue(!program.equalArrays(arr2,arr1));
    }

    /**
     * This function will check the isSorted function when the input is null
     */
    @Test
    public void isSortedArrayWhenNull(){
        int [] array = null;
        assertTrue(program.isSorted(array));
    }
    /**
     * This function will check the isSorted function when the input is empty
     */
    @Test
    public void isSortedArrayWhenEmpty(){
        int [] array = {};
        assertTrue(program.isSorted(array));
    }
    /**
     * This function will check the isSorted function when the input is a sorted array
     */
    @Test
    public void isSortedArrayWhenNotSorted(){
        int [] array = {3,4,1};
        assertTrue(!program.isSorted(array));
    }
    /**
     * This function will check the isSorted function when the input is a not sorted array
     */
    @Test
    public void isSortedArrayWhenSorted(){
        int [] array = {1,2,3,4,5,5};
        assertTrue(program.isSorted(array));
    }

    /**
     * This function will check the merge function when the inputs are two null arrays
     */
    @Test
    public void mergeTwoNull(){
        int [] array1 = null;
        int [] array2 = null;
        int [] merged = program.merge(array1,array2);
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
        int [] merged = program.merge(array1,array2);
        assertTrue(merged != null);
        assertTrue(sameElements(array1,merged));

        merged = program.merge(array2,array1);
        assertTrue(merged != null);
        assertTrue(sameElements(array1,merged));

    }
    /**
     * This function will check the merge function when the inputs are two empty arrays
     */
    @Test
    public void mergeTwoEmpty(){
        int [] array1 = {};
        int [] array2 = {};
        int [] merged = program.merge(array1,array2);
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
        int [] merged = program.merge(array1,array2);
        assertTrue(merged != null);
        assertTrue(sameElements(array1,merged));
        merged = array1;
        array1 = array2;
        array2 = merged;

        merged = program.merge(array2,array1);
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
        int [] merged = program.merge(array1,array2);
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

    /**
     * This function will restore the streams back to normal
     */
    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}