package System;


public class MergeStubSizeWhenTwoEmpty  extends Program implements ISizeStub {

    @Override
    public int size(int[] arr) {
        return ISizeStub.super.size(arr);
    }
}
