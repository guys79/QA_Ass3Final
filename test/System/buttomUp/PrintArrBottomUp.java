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


public class PrintArrBottomUp {
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
     * This function will restore the streams back to normal
     */
    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }


}
