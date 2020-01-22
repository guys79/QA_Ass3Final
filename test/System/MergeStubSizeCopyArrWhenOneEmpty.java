package System;


public class MergeStubSizeCopyArrWhenOneEmpty extends Program implements ICopyArrStub, ISizeStub {

    @Override
    public int size(int[] arr) {
        return ISizeStub.super.size(arr);
    }

    @Override
    public int[] copyArr(int[] arr) {
        return ICopyArrStub.super.copyArr(arr);
    }
}
