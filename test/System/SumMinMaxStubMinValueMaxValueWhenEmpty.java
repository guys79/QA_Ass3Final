package System;


public class SumMinMaxStubMinValueMaxValueWhenEmpty  extends Program implements IMinValueStub, IMaxValueStub {
    @Override
    public int minValue(int[] arr) {
        return IMinValueStub.super.minValue(arr);
    }

    @Override
    public int maxValue(int[] arr) {
        return IMaxValueStub.super.maxValue(arr);
    }
}

