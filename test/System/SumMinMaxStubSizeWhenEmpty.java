package System;
import System.Program;


public class SumMinMaxStubSizeWhenEmpty extends Program implements ISizeStub {

    @Override
    public int size(int[] arr) {
        return ISizeStub.super.size(arr);
    }
}
