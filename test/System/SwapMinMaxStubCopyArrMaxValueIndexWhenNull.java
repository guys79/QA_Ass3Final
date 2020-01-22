package System;

public class SwapMinMaxStubCopyArrMaxValueIndexWhenNull extends Program implements ICopyArrStub, IMaxValueIndexStub {
    // Returns copy of the array "arr"
    public  int[] copyArr(int[] arr) {
        return ICopyArrStub.super.copyArr(arr);
    }
    public  int maxValueIndex(int[] arr) {
        return IMaxValueIndexStub.super.maxValueIndex(arr);
    }

}