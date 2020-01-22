package System.Stubs.firstTree;
import System.Program;
import System.Stubs.ICopyArrStub;
import System.Stubs.ISizeStub;

public class PrintSortedStubSizeCopyArrWhenEmpty extends Program implements ISizeStub, ICopyArrStub {

    @Override
    public int size(int[] arr) {
        return ISizeStub.super.size(arr);
    }

    @Override
    public int[] copyArr(int[] arr) {
        return ICopyArrStub.super.copyArr(arr);
    }
}
