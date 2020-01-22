package System;


public class SwapMinMaxStubCopyArrMaxValueWhenValidSorted extends Program implements ICopyArrStub, IMaxValueStub, IMinValueIndexStub {

    // Returns copy of the array "arr"
    public  int[] copyArr(int[] arr) {
        return ICopyArrStub.super.copyArr(arr);
    }

    //Returns the maximum value in the array witch is 6 in this case
    public  int maxValue(int[] arr) {
        return IMaxValueStub.super.maxValue(arr);
    }


}
