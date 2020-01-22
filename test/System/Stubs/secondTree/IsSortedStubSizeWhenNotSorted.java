package System.Stubs.secondTree;
import System.Program;
import System.Stubs.ISizeStub;

public class IsSortedStubSizeWhenNotSorted  extends Program implements ISizeStub {

    @Override
    public int size(int[] arr) {
        return ISizeStub.super.size(arr);
    }
}