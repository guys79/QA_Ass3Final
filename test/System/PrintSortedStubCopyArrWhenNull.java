package System;


public class PrintSortedStubCopyArrWhenNull extends Program implements ICopyArrStub {

    @Override
    public int[] copyArr(int[] arr) {
        return ICopyArrStub.super.copyArr(arr);
    }
}
