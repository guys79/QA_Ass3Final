package System.Stubs.secondTree;
import System.Program;
import System.Stubs.ICopyArrStub;
import System.Stubs.ISizeStub;

public class IsSortedStubCopyArraySizeWhenNotSorted extends Program implements ICopyArrStub, ISizeStub {

    @Override
    public int[] copyArr(int[] arr) {
        return ICopyArrStub.super.copyArr(arr);
    }

    @Override
    public int size(int[] arr) {
        return ISizeStub.super.size(arr);
    }
}
