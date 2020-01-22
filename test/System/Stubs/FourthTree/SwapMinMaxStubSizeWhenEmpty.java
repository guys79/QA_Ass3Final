package System.Stubs.FourthTree;
import System.Program;
import System.Stubs.ISizeStub;

public class SwapMinMaxStubSizeWhenEmpty extends Program implements ISizeStub {

    @Override
    public int size(int[] arr) {
        return ISizeStub.super.size(arr);
    }

}
