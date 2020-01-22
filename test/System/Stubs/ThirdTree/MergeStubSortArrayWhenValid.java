package System.Stubs.ThirdTree;
import System.Program;
import System.Stubs.ISortArrayStub;

public class MergeStubSortArrayWhenValid  extends Program implements ISortArrayStub {

    @Override
    public int[] sortArray(int[] arr) {
        return ISortArrayStub.super.sortArray(arr);
    }
}
