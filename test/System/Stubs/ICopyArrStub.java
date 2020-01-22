package System.Stubs;

import System.Stubs.FourthTree.*;
import System.Stubs.ThirdTree.*;
import System.Stubs.firstTree.PrintSortedStubCopyArrWhenEmpty;
import System.Stubs.firstTree.PrintSortedStubCopyArrWhenNull;
import System.Stubs.firstTree.PrintSortedStubCopyArrWhenValid;
import System.Stubs.secondTree.*;

/**
 * This interface represents a stub for copyArr
 */
public interface ICopyArrStub {

    /**
     * In case the function simulates a null array
     *
     * @return - null
     */
    default int[] nullCase() {
        return null;
    }

    /**
     * In case the function simulates a {1,3,2,4} array
     *
     * @return - {1,3,2,4}
     */
    default int[] oneTo6Case() {
        int[] array = {1, 5, 4, 3, 2, 6};
        return array;
    }

    /**
     * In case the function simulates a {1,3,2,4} array
     *
     * @return - {1,3,2,4}
     */
    default int[] oneTo6SortCase() {
        int[] array = {1, 2, 3, 4, 5, 6};
        return array;
    }

    /**
     * In case the function simulates a {1,3,2,4} array
     *
     * @return - {1,3,2,4}
     */
    default int[] oneTo6TwiceSortCase() {
        int[] array = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        return array;
    }

    /**
     * In case the function simulates a {} array
     *
     * @return - {}
     */
    default int[] emptyCase() {
        int[] array = {};
        return array;
    }

    /**
     * The simulated copyArr function
     *
     * @param array - The given array
     * @return - The simulated result
     */
    default int[] copyArr(int[] array) {
        if (this instanceof PrintSortedStubCopyArrWhenValid || this instanceof IsSortedStubCopyArraySizeWhenNotSorted || this instanceof MergeStubSizeCopyArrWhenOneNull || this instanceof MergeStubSizeCopyArrWhenOneEmpty || this instanceof SwapMinMaxStubCopyArrMaxValueWhenValidNotSorted ||this instanceof SwapMinMaxStubCopyArrMaxValueIndexWhenValidNotSorted)
            return oneTo6Case();
        if (this instanceof PrintSortedStubCopyArrWhenEmpty || this instanceof IsSortedStubCopyArraySizeWhenEmpty || this instanceof MergeStubSizeCopyArrWhenTwoEmpty || this instanceof SwapMinMaxStubCopyArrMaxValueWhenEmpty || this instanceof SwapMinMaxStubCopyArrMaxValueIndexWhenEmpty)
            return emptyCase();
        if (this instanceof PrintSortedStubCopyArrWhenNull || this instanceof IsSortedStubCopyArraySizeWhenNull || this instanceof MergeStubSizeCopyArrWhenTwoNull || this instanceof SwapMinMaxStubCopyArrMaxValueWhenNull || this instanceof SwapMinMaxStubCopyArrMaxValueIndexWhenNull )
            return nullCase();
        if (this instanceof IsSortedStubSortArrayEqualArraysWhenSorted || this instanceof IsSortedStubCopyArraySizeWhenSorted || this instanceof SwapMinMaxStubCopyArrMaxValueIndexWhenValidSorted  || this instanceof SwapMinMaxStubCopyArrMaxValueWhenValidSorted)
            return oneTo6SortCase();
        if (this instanceof MergeStubSizeCopyArrWhenValid)
            return oneTo6TwiceSortCase();


        return null;
    }


}
