package System.Stubs;

import System.Stubs.FiveTree.SumMinMaxStubMinValueMaxValueWhenEmpty;
import System.Stubs.FiveTree.SumMinMaxStubMinValueMaxValueWhenNull;
import System.Stubs.FiveTree.SumMinMaxStubMinValueMaxValueWhenValid;
import System.buttomUp.MinValueBottomUp;

public interface IMinValueStub {

    default int minValue1()
    {
        return 1;
    }
    default int minValueMinus1() {
        return -1;
    }


    default int minValue(int [] arr)
    {
        if(this instanceof SumMinMaxStubMinValueMaxValueWhenValid)
            return minValue1();
        if(this instanceof SumMinMaxStubMinValueMaxValueWhenEmpty || this instanceof SumMinMaxStubMinValueMaxValueWhenNull)
            return minValueMinus1();

        return -290128371;

    }
}
