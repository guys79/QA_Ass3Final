package System.Stubs.ThirdTree;
import System.Program;
import System.Stubs.ICopyArrStub;
import System.Stubs.ISizeStub;

public class MergeStubSizeCopyArrWhenTwoEmpty  extends Program implements ICopyArrStub, ISizeStub {

    @Override
    public int size(int[] arr) {
        return ISizeStub.super.size(arr);
    }

    @Override
    public int[] copyArr(int[] arr) {
        return ICopyArrStub.super.copyArr(arr);
    }
}
