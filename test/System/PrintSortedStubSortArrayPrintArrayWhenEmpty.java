package System;


public class PrintSortedStubSortArrayPrintArrayWhenEmpty extends Program implements ISortArrayStub, IPrintArrStub {

    @Override
    public int[] sortArray(int[] arr) {
        return ISortArrayStub.super.sortArray(arr);
    }

    @Override
    public void printArr(int[] arr) {
        IPrintArrStub.super.printArr(arr);
    }
}
