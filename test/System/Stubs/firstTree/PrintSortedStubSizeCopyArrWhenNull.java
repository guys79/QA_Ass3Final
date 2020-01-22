package System.Stubs.firstTree;
import System.Program;
import System.Stubs.ISizeStub;

public class PrintSortedStubSizeCopyArrWhenNull extends Program implements ISizeStub {

    @Override
    public int size(int[] arr) {
        return ISizeStub.super.size(arr);
    }
}
