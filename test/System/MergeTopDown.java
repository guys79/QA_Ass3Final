package System;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import System.Program;
public class MergeTopDown {

    /**
     * This function will check the merge function when the inputs are two null arrays
     */
    @Test
    public void mergeTwoNull(){
        int [] array1 = null;
        int [] array2 = null;
        Program program;
        int [] merged;

        program = new MergeStubSortArrayWhenTwoNull();
        merged = program.merge(array1,array2);
        assertTrue(merged == null);

        program = new MergeStubSizeCopyArrWhenTwoNull();
        merged = program.merge(array1,array2);
        assertTrue(merged == null);

        program = new MergeStubSizeWhenTwoNull();
        merged = program.merge(array1,array2);
        assertTrue(merged == null);



    }
    /**
     * This function will check the merge function when the inputs are one array and one null array
     */
    @Test
    public void mergeOneNull(){
        int [] array1 = null;
        int [] array2 = {3,4,5,6,2,1};
        Program program;
        int [] expected = {1,2,3,4,5,6};
        int [] merged;

        program = new MergeStubSortArrayWhenOneNull();
        merged = program.merge(array1,array2);
        assertTrue(this.areEqual(merged,expected));
        merged = program.merge(array2,array1);
        assertTrue(this.areEqual(merged,expected));

        program = new MergeStubSizeCopyArrWhenOneNull();
        merged = program.merge(array1,array2);
        assertTrue(this.areEqual(merged,expected));
        merged = program.merge(array2,array1);
        assertTrue(this.areEqual(merged,expected));

        program = new MergeStubSizeWhenOneNull();
        merged = program.merge(array1,array2);
        assertTrue(this.areEqual(merged,expected));
        merged = program.merge(array2,array1);
        assertTrue(this.areEqual(merged,expected));


    }

    private boolean areEqual(int [] arr1, int [] arr2)
    {
        if(arr1 == null && arr2 == null)
            return true;
        if(arr1 == null || arr2 == null)
            return false;
        if(arr1.length != arr2.length)
            return false;

        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
    /**
     * This function will check the merge function when the inputs are two empty arrays
     */
    @Test
    public void mergeTwoEmpty(){
        int [] array1 = {};
        int [] array2 = {};
        Program program;
        int [] merged;

        program = new MergeStubSortArrayWhenTwoEmpty();
        merged = program.merge(array1,array2);
        assertTrue(merged != null);
        assertEquals(0,merged.length);

        program = new MergeStubSizeCopyArrWhenTwoEmpty();
        merged = program.merge(array1,array2);
        assertTrue(merged != null);
        assertEquals(0,merged.length);

        program = new MergeStubSizeWhenTwoEmpty();
        merged = program.merge(array1,array2);
        assertTrue(merged != null);
        assertEquals(0,merged.length);
    }
    /**
     * This function will check the merge function when the inputs are one empty array and one regular array
     */
    @Test
    public void mergeOneEmpty(){
        int [] array1 = {};
        int [] array2 = {3,4,5,6,2,1};
        Program program;
        int [] expected = {1,2,3,4,5,6};
        int [] merged;

        program = new MergeStubSortArrayWhenOneEmpty();
        merged = program.merge(array1,array2);
        assertTrue(this.areEqual(merged,expected));
        merged = program.merge(array2,array1);
        assertTrue(this.areEqual(merged,expected));

        program = new MergeStubSizeCopyArrWhenOneEmpty();
        merged = program.merge(array1,array2);
        assertTrue(this.areEqual(merged,expected));
        merged = program.merge(array2,array1);
        assertTrue(this.areEqual(merged,expected));

        program = new MergeStubSizeWhenOneEmpty();
        merged = program.merge(array1,array2);
        assertTrue(this.areEqual(merged,expected));
        merged = program.merge(array2,array1);
        assertTrue(this.areEqual(merged,expected));
    }

    /**
     * This function will check the merge function when the inputs are two arrays
     */
    @Test
    public void mergeTwoArrays(){
        int [] array1 = {1,2,3,4,5,6};
        int [] array2 = {3,4,5,6,2,1};
        Program program;
        int [] expected = {1,1,2,2,3,3,4,4,5,5,6,6};
        int [] merged;

        program = new MergeStubSortArrayWhenValid();
        merged = program.merge(array1,array2);
        assertTrue(this.areEqual(merged,expected));
        merged = program.merge(array2,array1);
        assertTrue(this.areEqual(merged,expected));

        program = new MergeStubSizeCopyArrWhenValid();
        merged = program.merge(array1,array2);
        assertTrue(this.areEqual(merged,expected));
        merged = program.merge(array2,array1);
        assertTrue(this.areEqual(merged,expected));

        program = new MergeStubSizeWhenValid();
        merged = program.merge(array1,array2);
        assertTrue(this.areEqual(merged,expected));
        merged = program.merge(array2,array1);
        assertTrue(this.areEqual(merged,expected));
    }
}
