package System.Stubs.firstTree;
import System.Program;
import System.Stubs.ISortArrayStub;

public class PrintSortedStubSortArrayWhenEmpty extends Program implements ISortArrayStub {

    @Override
    public int[] sortArray(int[] arr) {
        return ISortArrayStub.super.sortArray(arr);
    }
}