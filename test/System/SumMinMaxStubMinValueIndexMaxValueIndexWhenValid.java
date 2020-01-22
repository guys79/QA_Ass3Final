package System;


public class SumMinMaxStubMinValueIndexMaxValueIndexWhenValid extends Program implements IMaxValueIndexStub, IMinValueIndexStub {

    @Override
    public int maxValueIndex(int[] arr) {
        return IMaxValueIndexStub.super.maxValueIndex(arr);
    }

    @Override
    public int minValueIndex(int[] arr) {
        return IMinValueIndexStub.super.minValueIndex(arr);
    }
}
