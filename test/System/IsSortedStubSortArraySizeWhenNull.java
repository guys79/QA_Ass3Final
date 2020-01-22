package System;


public class IsSortedStubSortArraySizeWhenNull extends Program implements ISortArrayStub, ISizeStub {

    @Override
    public int[] sortArray(int[] arr) {
        return ISortArrayStub.super.sortArray(arr);
    }

    @Override
    public int size(int[] arr) {
        return ISizeStub.super.size(arr);
    }
}