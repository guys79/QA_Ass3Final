package System.Stubs.FiveTree;
import System.Program;
import System.Stubs.ISizeStub;

public class SumMinMaxStubSizeWhenValid extends Program implements ISizeStub {

    @Override
    public int size(int[] arr) {
        return ISizeStub.super.size(arr);
    }
}
