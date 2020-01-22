package System.Stubs;

import System.Stubs.FiveTree.SumMinMaxStubSizeWhenEmpty;
import System.Stubs.FiveTree.SumMinMaxStubSizeWhenNull;
import System.Stubs.FiveTree.SumMinMaxStubSizeWhenValid;
import System.Stubs.FourthTree.SwapMinMaxStubSizeWhenEmpty;
import System.Stubs.FourthTree.SwapMinMaxStubSizeWhenNotSorted;
import System.Stubs.FourthTree.SwapMinMaxStubSizeWhenNull;
import System.Stubs.FourthTree.SwapMinMaxStubSizeWhenSorted;
import System.Stubs.ThirdTree.*;
import System.Stubs.firstTree.PrintSortedStubSizeCopyArrWhenValid;
import System.Stubs.firstTree.PrintSortedStubSortArrayPrintArrayWhenEmpty;
import System.Stubs.firstTree.PrintSortedStubSortArrayPrintArrayWhenNull;
import System.Stubs.firstTree.PrintSortedStubSortArrayPrintArrayWhenValid;
import System.Stubs.secondTree.*;

/**
 * This interface represents a stub for Size
 */
public interface ISizeStub {

    /**
     * In case the function simulates null array
     * @return - -1
     */
    default int demoNull()
    {
        return-1;
    }

    /**
     * In case the function simulates a size 6 array
     * @return - 6
     */
    default int demoValidSize6() {
        return 6;
    }

    /**
     * In case the function simulates a size 12 array
     * @return - 6
     */
    default int demoValidSize12() {
        return 12;
    }

    /**
     * In case the function simulates an empty array
     * @return - 0
     */
    default int demoValidSizeEmpty() {
        return 0;
    }

    /**
     * The simulated size function
     * @param arr - The given array
     * @return - The simulated result
     */
    default int size(int [] arr)
    {
        if(this instanceof PrintSortedStubSortArrayPrintArrayWhenNull || this instanceof IsSortedStubSortArraySizeWhenNull || this instanceof IsSortedStubCopyArraySizeWhenNull || this instanceof IsSortedStubSizeWhenNull || this instanceof MergeStubSizeCopyArrWhenTwoNull || this instanceof MergeStubSizeWhenTwoNull || this instanceof SwapMinMaxStubSizeWhenNull || this instanceof SumMinMaxStubSizeWhenNull)
            return demoNull();
        if(this instanceof PrintSortedStubSortArrayPrintArrayWhenEmpty || this instanceof IsSortedStubSortArraySizeWhenEmpty ||  this instanceof IsSortedStubCopyArraySizeWhenEmpty || this instanceof IsSortedStubSizeWhenEmpty || this instanceof MergeStubSizeCopyArrWhenTwoEmpty || this instanceof MergeStubSizeWhenTwoEmpty || this instanceof SwapMinMaxStubSizeWhenEmpty || this instanceof SumMinMaxStubSizeWhenEmpty)
            return demoValidSizeEmpty();
        if(this instanceof PrintSortedStubSortArrayPrintArrayWhenValid || this instanceof IsSortedStubSortArraySizeWhenNotSorted || this instanceof IsSortedStubSortArraySizeWhenSorted || this instanceof IsSortedStubCopyArraySizeWhenSorted || this instanceof IsSortedStubCopyArraySizeWhenNotSorted || this instanceof IsSortedStubSizeWhenNotSorted || this instanceof IsSortedStubSizeWhenSorted || this instanceof MergeStubSizeCopyArrWhenOneEmpty || this instanceof MergeStubSizeCopyArrWhenOneNull || this instanceof MergeStubSizeCopyArrWhenValid || this instanceof MergeStubSizeWhenOneEmpty || this instanceof MergeStubSizeWhenOneNull  || this instanceof PrintSortedStubSizeCopyArrWhenValid || this instanceof SwapMinMaxStubSizeWhenSorted || this instanceof SwapMinMaxStubSizeWhenNotSorted || this instanceof SumMinMaxStubSizeWhenValid)
            return demoValidSize6();
        if(this instanceof MergeStubSizeWhenValid)
            return demoValidSize12();
        return -1;
    }



}
