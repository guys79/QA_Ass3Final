package System;


public class SumMinMaxStubMinValueIndexMaxValueWhenValid extends Program implements IMinValueIndexStub, IMaxValueStub {
    @Override
    public int minValueIndex(int[] arr) {
        return IMinValueIndexStub.super.minValueIndex(arr);
    }

    @Override
    public int maxValue(int[] arr) {
        return IMaxValueStub.super.maxValue(arr);
    }
}
