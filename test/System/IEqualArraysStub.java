package System;



/**
 * This interface represents a stub for equalArrays
 */
public interface IEqualArraysStub {

    /**
     * In case the function simulates true case
     * @return - true
     */
    default boolean trueCase()
    {
        return true;
    }

    /**
     * In case the function simulates true case
     * @return - true
     */
    default boolean falseCase()
    {
        return false;
    }

    /**
     * This function simulates the equalArrays method
     * @return - The simulated result
     */
    default boolean equalArrays(int [] arr1,int []arr2)
    {
        if(this instanceof IsSortedStubSortArrayEqualArraysWhenNull || this instanceof IsSortedStubSortArrayEqualArraysWhenSorted || this instanceof IsSortedStubSortArrayEqualArraysWhenEmpty)
            return trueCase();
        if(this instanceof IsSortedStubSortArrayEqualArraysWhenNotSorted)
            return falseCase();
        return true;
    }


}
