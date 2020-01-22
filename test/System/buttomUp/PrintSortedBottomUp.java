package System.buttomUp;
import System.Program;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class PrintSortedBottomUp {
    private Program program= new Program();
    private Random rand;// The random variable
    private final int BOUND = 100;//The bound
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

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
