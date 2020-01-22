package System.Stubs.firstTree;
import System.Program;
import System.Stubs.IPrintArrStub;
import System.Stubs.ISortArrayStub;

public class PrintSortedStubSortArrayPrintArrayWhenValid extends Program implements ISortArrayStub, IPrintArrStub {

    @Override
    public int[] sortArray(int[] arr) {
        return ISortArrayStub.super.sortArray(arr);
    }

    @Override
    public void printArr(int[] arr) {
        IPrintArrStub.super.printArr(arr);
    }
}
