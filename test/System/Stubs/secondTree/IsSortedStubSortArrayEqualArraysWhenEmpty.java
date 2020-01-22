package System.Stubs.secondTree;
import System.Stubs.IEqualArraysStub;
import System.Stubs.ISortArrayStub;
import System.Program;

public class IsSortedStubSortArrayEqualArraysWhenEmpty extends Program implements ISortArrayStub, IEqualArraysStub {

    @Override
    public int[] sortArray(int[] arr) {
        return ISortArrayStub.super.sortArray(arr);
    }

    @Override
    public boolean equalArrays(int[] arr1, int[] arr2) {
        return IEqualArraysStub.super.equalArrays(arr1, arr2);
    }
}
