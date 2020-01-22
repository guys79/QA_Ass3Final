package System.Stubs;

import System.Stubs.ThirdTree.*;
import System.Stubs.firstTree.*;
import System.Stubs.secondTree.*;

/**
 * This interface represents a stub for sortArray
 */
public interface ISortArrayStub {

    /**
     * In case the function simulates a null array
     * @return - null
     */
    default int [] nullSortCase()
    {
        return null;
    }
    /**
     * In case the function simulates a {1,2,3,4} array
     * @return - {1,2,3,4}
     */
    default int [] oneTo6Case()
    {
        int [] array = {1,2,3,4,5,6};
        return array;
    }

    default int [] oneTwo6Twice()
    {
        int [] array = {1,1,2,2,3,3,4,4,5,5,6,6};
        return array;
    }

    /**
     * In case the function simulates a {1,2,3,4} array
     * @return - {1,2,3,4}
     */
    default int [] emptySortCase()
    {
        int [] array = {};
        return array;
    }
    /**
     * The simulated result of sortArray
     * @param arr - The given array
     * @return - the simulated result
     */
    default int [] sortArray(int [] arr)
    {
        if(this instanceof PrintSortedStubSortArrayWhenNull || this instanceof PrintSortedStubSortArrayPrintArrayWhenNull || this instanceof IsSortedStubSortArrayEqualArraysWhenNull || this instanceof IsSortedStubSortArraySizeWhenNull || this instanceof MergeStubSortArrayWhenTwoNull)
            return nullSortCase();
        if(this instanceof PrintSortedStubSortArrayWhenEmpty || this instanceof PrintSortedStubSortArrayPrintArrayWhenEmpty || this instanceof IsSortedStubSortArrayEqualArraysWhenEmpty || this instanceof IsSortedStubSortArraySizeWhenEmpty || this instanceof MergeStubSortArrayWhenTwoEmpty)
            return emptySortCase();
        if(this instanceof PrintSortedStubSortArrayWhenValid || this instanceof PrintSortedStubSortArrayPrintArrayWhenValid || this instanceof IsSortedStubSortArrayEqualArraysWhenNotSorted || this instanceof IsSortedStubSortArrayEqualArraysWhenSorted || this instanceof IsSortedStubSortArraySizeWhenNotSorted || this instanceof IsSortedStubSortArraySizeWhenSorted || this instanceof MergeStubSortArrayWhenOneEmpty || this instanceof MergeStubSortArrayWhenOneNull || (this instanceof MergeStubSortArrayWhenValid && arr.length == 6))
            return oneTo6Case();
        if((this instanceof MergeStubSortArrayWhenValid && arr.length == 12))
            return oneTwo6Twice();
        return null;
    }


}
