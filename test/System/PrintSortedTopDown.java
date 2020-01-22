package System;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import System.Program;
public class PrintSortedTopDown {

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
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    /**
     * This function will restore the streams back to normal
     */
    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    /**
     * This function will check the printSorted function when the input is a null array
     */
    @Test
    public void printSortedNull(){

        int [] array = null;
        Program program;
        String output;
        String base = "\r\n";
        String expected = "No array"+ base;
        int outputLength = expected.length();

        program = new PrintSortedStubSortArrayPrintArrayWhenNull();
        program.printSorted(array);
        output = outContent.toString();
        assertEquals(expected,output);

        program = new PrintSortedStubSortArrayWhenNull();
        program.printSorted(array);
        output = outContent.toString();
        output = output.substring(0,outputLength);
        assertEquals(expected,output);

        program = new PrintSortedStubSizeCopyArrWhenNull();
        program.printSorted(array);
        output = outContent.toString();
        output = output.substring(0,outputLength);
        assertEquals(expected,output);

        program = new Program();
        program.printSorted(array);
        output = outContent.toString();
        output = output.substring(0,outputLength);
        assertEquals(expected,output);

    }
    /**
     * This function will check the printSorted function when the input is an empty array
     */
    @Test
    public void printSortedEmptyCheck(){
        int [] array ={};
        Program program;
        String output;
        String base = "\r\n";
        String expected = base+base+ base;
        int outputLength = expected.length();

        program = new PrintSortedStubSortArrayPrintArrayWhenEmpty();
        program.printSorted(array);
        output = outContent.toString();
        assertEquals(expected,output);

        program = new PrintSortedStubSortArrayWhenEmpty();
        program.printSorted(array);
        output = outContent.toString();
        output = output.substring(0,outputLength);
        assertEquals(expected,output);

        program = new PrintSortedStubSizeCopyArrWhenEmpty();
        program.printSorted(array);
        output = outContent.toString();
        output = output.substring(0,outputLength);
        assertEquals(expected,output);

        program = new Program();
        program.printSorted(array);
        output = outContent.toString();
        output = output.substring(0,outputLength);
        assertEquals(expected,output);
    }

    /**
     * This function will check the printSorted function when the input is a valid random array
     */
    @Test
    public void printSortedValidCheck(){
        int [] array ={2,3,4,5,6,1};
        Program program;
        String output;
        String base = "\r\n";
        String sorted = "1 2 3 4 5 6 "+ base;
        String notSorted = "2 3 4 5 6 1 "+ base;
        String expected = notSorted + sorted +notSorted;

        int outputLength = expected.length();

        program = new PrintSortedStubSortArrayPrintArrayWhenValid();
        program.printSorted(array);
        output = outContent.toString();
        assertEquals(expected,output);

        program = new PrintSortedStubSortArrayWhenValid();
        program.printSorted(array);
        output = outContent.toString();
        output = output.substring(0,outputLength);
        assertEquals(expected,output);

        program = new PrintSortedStubSizeCopyArrWhenValid();
        program.printSorted(array);
        output = outContent.toString();
        output = output.substring(0,outputLength);
        assertEquals(expected,output);

        program = new Program();
        program.printSorted(array);
        output = outContent.toString();
        output = output.substring(0,outputLength);
        assertEquals(expected,output);
    }
}
