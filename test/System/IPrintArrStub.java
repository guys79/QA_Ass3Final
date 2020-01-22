package System;


/**
 * This interface represents a stub for printArr
 */
public interface IPrintArrStub {

    /**
     * In case the function simulates a null array
     */
    default void nullPrintCase()
    {
        return;
    }

    /**
     * This function prints the numbers from 1 to 4
     */
    default void oneToSixPrintCase()
    {
        for(int i=1;i<=6;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    default void regularArraySize6()
    {
        System.out.print(2+" ");
        System.out.print(3+" ");
        System.out.print(4+" ");
        System.out.print(5+" ");
        System.out.print(6+" ");
        System.out.print(1+" ");
        System.out.println();

    }

    /**
     * This function prints the numbers from 1 to 4
     */
    default void emptyPrintCase()
    {

        System.out.println();
    }
    /**
     * The simulated result of printArr
     */
    default void printArr(int [] array)
    {
        if(this instanceof PrintSortedStubSortArrayPrintArrayWhenEmpty)
            emptyPrintCase();
        if(this instanceof PrintSortedStubSortArrayPrintArrayWhenValid && realIsSortedPrintArr(array))
            oneToSixPrintCase();
        if(this instanceof PrintSortedStubSortArrayPrintArrayWhenValid && !realIsSortedPrintArr(array))
            regularArraySize6();

        if(this instanceof PrintSortedStubSortArrayPrintArrayWhenNull)
            nullPrintCase();
    }

    default boolean realIsSortedPrintArr(int [] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] >arr[i+1])
                return false;
        }
        return true;
    }


}
