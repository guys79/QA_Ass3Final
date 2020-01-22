package System;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import System.Program;
public class IsSortedTopDown {

    /**
     * This function will check the isSorted function when the input is null
     */
    @Test
    public void isSortedArrayWhenNull(){
        int [] array = null;
        Program program;

        program = new IsSortedStubSortArrayEqualArraysWhenNull();
        assertTrue(program.isSorted(array));

        program = new IsSortedStubSortArraySizeWhenNull();
        assertTrue(program.isSorted(array));

        program = new IsSortedStubCopyArraySizeWhenNull();
        assertTrue(program.isSorted(array));

        program = new IsSortedStubSizeWhenNull();
        assertTrue(program.isSorted(array));

        program = new Program();
        assertTrue(program.isSorted(array));
    }
    /**
     * This function will check the isSorted function when the input is empty
     */
    @Test
    public void isSortedArrayWhenEmpty(){
        int [] array = {};
        Program program;

        program = new IsSortedStubSortArrayEqualArraysWhenEmpty();
        assertTrue(program.isSorted(array));

        program = new IsSortedStubSortArraySizeWhenEmpty();
        assertTrue(program.isSorted(array));

        program = new IsSortedStubCopyArraySizeWhenEmpty();
        assertTrue(program.isSorted(array));

        program = new IsSortedStubSizeWhenEmpty();
        assertTrue(program.isSorted(array));

        program = new Program();
        assertTrue(program.isSorted(array));
    }
    /**
     * This function will check the isSorted function when the input is a sorted array
     */
    @Test
    public void isSortedArrayWhenNotSorted(){
        int [] array = {1,5,4,3,2,6};
        Program program;

        program = new IsSortedStubSortArrayEqualArraysWhenNotSorted();
        assertTrue(!program.isSorted(array));

        program = new IsSortedStubSortArraySizeWhenNotSorted();
        assertTrue(!program.isSorted(array));

        program = new IsSortedStubCopyArraySizeWhenNotSorted();
        assertTrue(!program.isSorted(array));

        program = new IsSortedStubSizeWhenNotSorted();
        assertTrue(!program.isSorted(array));

        program = new Program();
        assertTrue(!program.isSorted(array));
    }
    /**
     * This function will check the isSorted function when the input is a not sorted array
     */
    @Test
    public void isSortedArrayWhenSorted(){
        int [] array = {1,2,3,4,5,6};
        Program program;

        program = new IsSortedStubSortArrayEqualArraysWhenSorted();
        assertTrue(program.isSorted(array));

        program = new IsSortedStubSortArraySizeWhenSorted();
        assertTrue(program.isSorted(array));

        program = new IsSortedStubCopyArraySizeWhenSorted();
        assertTrue(program.isSorted(array));

        program = new IsSortedStubSizeWhenSorted();
        assertTrue(program.isSorted(array));

        program = new Program();
        assertTrue(program.isSorted(array));
    }
}
