package System;


public class MergeStubSizeCopyArrWhenTwoEmpty  extends Program implements ICopyArrStub, ISizeStub {

    @Override
    public int size(int[] arr) {
        return ISizeStub.super.size(arr);
    }

    @Override
    public int[] copyArr(int[] arr) {
        return ICopyArrStub.super.copyArr(arr);
    }
}
