package System;


public class IsSortedStubCopyArraySizeWhenNull extends Program implements ICopyArrStub, ISizeStub {

    @Override
    public int[] copyArr(int[] arr) {
        return ICopyArrStub.super.copyArr(arr);
    }

    @Override
    public int size(int[] arr) {
        return ISizeStub.super.size(arr);
    }
}
