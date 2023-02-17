import java.util.*;
import java.io.*;

public class CleanCodeAssignment {

        //Function for finding index of Array Elements with respect
        // to their position in sorted form of the Array.
        public static int[] convert(int[] noOfarrayElements, int sizeOfArray)
        {
            int[] resultArray = new int[sizeOfArray];
            int currentPositionOfArray = 0;

            // Iterate over the array, so that we get the current Index
            for (int currentIndex = 0; currentIndex < sizeOfArray; currentIndex++) {
                int minimumElementOfArray = Integer.MAX_VALUE;
                int index = -1;

                // Find the minimum element and keep
                // its position of occurrence
                for (int positionIndex = 0; positionIndex < sizeOfArray; positionIndex++) {
                    if (minimumElementOfArray> noOfarrayElements[positionIndex]) {
                        minimumElementOfArray= noOfarrayElements[positionIndex];
                        index = positionIndex;
                    }
                }

                // Update the result at minimum index element
                // with new Position
                resultArray[index] = currentPositionOfArray;

                // Incrementing the new position,
                // so that the current position of the array is on right position.
                currentPositionOfArray++;

                // Update the original element at current
                // minimum element with maximum value possible,
                // so that it won't be minimum in further
                // iteration
                noOfarrayElements[index] = Integer.MAX_VALUE;
            }

            // Return the result
            return resultArray;
        }
        // Another Function for Printing the Array.
        public static void printArray(int[] resultArray, int sizeOfArray)
        {
            for (int printIndexOfArray=0; printIndexOfArray < sizeOfArray; printIndexOfArray++) {
                System.out.print(resultArray[printIndexOfArray] + " ");
            }
        }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray;
        int currentIndex;

        System.out.println("Enter size of array you want to convert : ");
        sizeOfArray = sc.nextInt();

        int noOfarrayElements[]=new int[sizeOfArray];

        //Taking User input for the Array
        System.out.println("Enter the array elements one by one: ");
        for(currentIndex=0; currentIndex <sizeOfArray; currentIndex++)
        {
            noOfarrayElements[currentIndex]=sc.nextInt();
        }

        //Calling Function for Resultant Array
        int[] resultArray = convert(noOfarrayElements, sizeOfArray);

        System.out.println("\nConverted Array with their Index: ");
        printArray(resultArray, sizeOfArray);
    }
}


