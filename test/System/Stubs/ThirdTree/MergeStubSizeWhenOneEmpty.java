package System.Stubs.ThirdTree;
import System.Program;
import System.Stubs.ISizeStub;

public class MergeStubSizeWhenOneEmpty  extends Program implements ISizeStub {

    @Override
    public int size(int[] arr) {
        return ISizeStub.super.size(arr);
    }
}
