package System;


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
