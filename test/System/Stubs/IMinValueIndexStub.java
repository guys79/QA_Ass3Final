package System.Stubs;

import System.Stubs.FiveTree.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public interface IMinValueIndexStub {


    default int Minus1() {
        return -1;
    }
    default int return0() {
        return 0;
    }

    default int minValueIndex(int [] arr)
    {
        if(this instanceof SumMinMaxStubMinValueIndexMaxValueWhenEmpty || this instanceof SumMinMaxStubMinValueIndexMaxValueWhenNull || this instanceof SumMinMaxStubMinValueIndexMaxValueIndexWhenEmpty || this instanceof SumMinMaxStubMinValueIndexMaxValueIndexWhenNull)
            return Minus1();
        if(this instanceof SumMinMaxStubMinValueIndexMaxValueWhenNull  || this instanceof SumMinMaxStubMinValueIndexMaxValueIndexWhenValid)
            return return0();

        return -18472938;

    }
}
