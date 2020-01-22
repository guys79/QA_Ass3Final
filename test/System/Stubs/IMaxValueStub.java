package System.Stubs;
import System.Stubs.FiveTree.SumMinMaxStubMinValueIndexMaxValueWhenEmpty;
import System.Stubs.FiveTree.SumMinMaxStubMinValueIndexMaxValueWhenNull;
import System.Stubs.FiveTree.SumMinMaxStubMinValueIndexMaxValueWhenValid;
import System.Stubs.FourthTree.SwapMinMaxStubCopyArrMaxValueWhenValidNotSorted;
import System.Stubs.FourthTree.SwapMinMaxStubCopyArrMaxValueWhenValidSorted;
import System.Stubs.FourthTree.SwapMinMaxStubCopyArrMaxValueWhenNull;
import System.Stubs.FourthTree.SwapMinMaxStubCopyArrMaxValueWhenEmpty;

public interface IMaxValueStub {

    default int maxValue6()
    {
        return 6;
    }
    default int maxValueMinus1() {
        return -1;
    }

    default int maxValue(int [] arr)
    {
        if(this instanceof SwapMinMaxStubCopyArrMaxValueWhenValidSorted || this instanceof SwapMinMaxStubCopyArrMaxValueWhenValidNotSorted || this instanceof SumMinMaxStubMinValueIndexMaxValueWhenValid)
            return maxValue6();
        if(this instanceof SwapMinMaxStubCopyArrMaxValueWhenNull|| this instanceof SwapMinMaxStubCopyArrMaxValueWhenEmpty || this instanceof SumMinMaxStubMinValueIndexMaxValueWhenNull || this instanceof SumMinMaxStubMinValueIndexMaxValueWhenEmpty)
            return maxValueMinus1();

        return -109090;
    }
}
