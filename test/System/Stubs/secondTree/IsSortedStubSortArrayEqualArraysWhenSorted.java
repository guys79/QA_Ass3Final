package System.Stubs.secondTree;
import System.Program;
import System.Stubs.IEqualArraysStub;
import System.Stubs.ISortArrayStub;

public class IsSortedStubSortArrayEqualArraysWhenSorted  extends Program implements ISortArrayStub, IEqualArraysStub {

    @Override
    public int[] sortArray(int[] arr) {
        return ISortArrayStub.super.sortArray(arr);
    }

    @Override
    public boolean equalArrays(int[] arr1, int[] arr2) {
        return IEqualArraysStub.super.equalArrays(arr1, arr2);
    }
}