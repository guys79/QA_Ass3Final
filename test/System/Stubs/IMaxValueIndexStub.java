package System.Stubs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import System.Stubs.FiveTree.SumMinMaxStubMinValueIndexMaxValueIndexWhenEmpty;
import System.Stubs.FiveTree.SumMinMaxStubMinValueIndexMaxValueIndexWhenNull;
import System.Stubs.FiveTree.SumMinMaxStubMinValueIndexMaxValueIndexWhenValid;
import System.Stubs.FourthTree.SwapMinMaxStubCopyArrMaxValueIndexWhenValidNotSorted;
import System.Stubs.FourthTree.SwapMinMaxStubCopyArrMaxValueIndexWhenValidSorted;
import System.Stubs.FourthTree.SwapMinMaxStubCopyArrMaxValueIndexWhenEmpty;
import System.Stubs.FourthTree.SwapMinMaxStubCopyArrMaxValueIndexWhenNull ;

public interface IMaxValueIndexStub {


    default int Index5() {
        return 5;
    }
    default int IndexMinus1() {
        return -1;
    }

    default int maxValueIndex(int [] arr)
    {
        if(this instanceof SwapMinMaxStubCopyArrMaxValueIndexWhenValidSorted || this instanceof SwapMinMaxStubCopyArrMaxValueIndexWhenValidNotSorted || this instanceof SumMinMaxStubMinValueIndexMaxValueIndexWhenValid)
            return Index5();
        if(this instanceof SwapMinMaxStubCopyArrMaxValueIndexWhenNull || this instanceof SwapMinMaxStubCopyArrMaxValueIndexWhenEmpty || this instanceof SumMinMaxStubMinValueIndexMaxValueIndexWhenEmpty || this instanceof SumMinMaxStubMinValueIndexMaxValueIndexWhenNull)
            return IndexMinus1();
        throw new UnsupportedOperationException();

    }



}
