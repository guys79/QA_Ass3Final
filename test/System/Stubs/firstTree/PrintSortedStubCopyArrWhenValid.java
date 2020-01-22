package System.Stubs.firstTree;
import System.Program;
import System.Stubs.ICopyArrStub;

public class PrintSortedStubCopyArrWhenValid  extends Program implements ICopyArrStub {

    @Override
    public int[] copyArr(int[] arr) {
        return ICopyArrStub.super.copyArr(arr);
    }
}
