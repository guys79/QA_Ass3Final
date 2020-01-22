package System.Stubs.FiveTree;
import System.Program;
import System.Stubs.IMaxValueIndexStub;
import System.Stubs.IMinValueIndexStub;

public class SumMinMaxStubMinValueIndexMaxValueIndexWhenNull extends Program implements IMaxValueIndexStub, IMinValueIndexStub {
    @Override
    public int maxValueIndex(int[] arr) {
        return IMaxValueIndexStub.super.maxValueIndex(arr);
    }

    @Override
    public int minValueIndex(int[] arr) {
        return IMinValueIndexStub.super.minValueIndex(arr);
    }
}
