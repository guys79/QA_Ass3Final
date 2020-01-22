package System.Stubs.secondTree;
import System.Program;
import System.Stubs.ISizeStub;
import System.Stubs.ISortArrayStub;

public class IsSortedStubSortArraySizeWhenNotSorted extends Program implements ISortArrayStub, ISizeStub {

    @Override
    public int[] sortArray(int[] arr) {
        return ISortArrayStub.super.sortArray(arr);
    }

    @Override
    public int size(int[] arr) {
        return ISizeStub.super.size(arr);
    }
}
