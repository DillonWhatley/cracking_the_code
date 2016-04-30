/**
 * Created by Dillon on 4/25/2016.
 */
import CustomHashTable.CustomHashTable;
import ReplaceSpace.ReplaceSpace;
import CustomHashTable.*;
import StringCompression.StringCompression;
import CircularArray.CircularArray;

public class Driver {

    // This class is provided as a workhorse to instantiate and demonstrate multiple classes
    // The classes in question are derived as solutions to book problems from:
    // Gayle Laakmann McDowell's - Cracking The Coding Interview


    // The section labels correspond to chapter interview questions
    // An example being,   ***** 1.1 **** corresponds to chapter 1 interview question 1
    // This is the same labeling pattern as in the book


    // You may un-comment any of the following sections, delimited by a commented line of:
    // ************************************************ X.X **********************************************************

    public static void main(String[] args) {

        // The first section of this driver is unique in that it does not contain interview questions but rather
        // My implementations of some common data structures / algorithms
        // This corresponds to the VI.Technical Questions - Technical Preparation section of the book


        // ************************************************ VI.HashMap************************************************

          // Basic implementation of a HashMap
          // Todo: Implement Collision resolution

//        // Initialize worker object and array of test data
//        CustomHashTable theTable = new CustomHashTable();
//        Student[] students = {new Student("Danny"), new Student("Bob"), new Student("Smith")};
//
//        // Build the mapping
//        theTable.buildMap(students);
//
//        // ***Test that we can lookup based on hashed id***
//
//        // Given we wish to check if a given name resides in the map find their hashed id based off name
//        int tempID = theTable.hash("Danny", theTable.getTableSize());
//
//        // Check if hashed value maps to a null cell, if not, check if cell contains given name
//        String tempName;
//        if ((tempName = theTable.getMap()[tempID].getName()) != null) {
//            System.out.println("Expecting Danny....");
//            System.out.println("Cell Id: " + tempID + "  -- Cell Value: " + tempName);
//       }

        // ************************************************ VI.******************************************************



        // ********************************************* Chapter 1 **************************************************
        // ************************************************ 1.4 *****************************************************

        // Replace whitespace in a string with %20
        // Test data initialization and printing to should its form
//        char[] input = "Mr John Smith    ".toCharArray();
//        for (char c : input){
//            System.out.print(c);
//        }
//        System.out.println();
//
//        // Change whitespace in a string to urlencoded form, %20
//        ReplaceSpace stringManipulator = new ReplaceSpace();
//        stringManipulator.replaceSpace(input, 13);
//
//        // Print out newly formatted string
//        for (char c : input){
//            System.out.print(c);
//        }
//
//        System.out.println();

        // ************************************************ 1.5 *****************************************************

        // Compress a given string of characters, example aabbbc becomes a2b3c1
//        StringCompression tester = new StringCompression();
//        // String where compression should be preffered
//        String compressible = "aabbbbccdddaba";
//        // String where compression technique should be longer and hence not preferred
//        String incompressible = "abcdefghijkl";
//
//        System.out.println("The following string should contain numbers, as its compressed:");
//        // Should print out compressed version of the given string
//        System.out.println(tester.compress(compressible));
//
//        System.out.println();
//
//        System.out.println("The following string should not contain numbers, as that would be longer than the input:");
//        // Should print out uncompressed  version of the given string
//        System.out.println(tester.compress(incompressible));


        // ************************************************ 14.6 *****************************************************

        // Ability to rotate an array of generic type.  Includes iterator functionality

//        // Test data
//        Integer[] tester = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
//        String[] testTwo = new String[] {"bob", "sagget", "testing", "okay", "now", "rotate", "this", "please"};
//
//        // Instance of class used to rotate Integer array
//        CircularArray<Integer> worker = new CircularArray<Integer>(tester);
//        // Instance of class used to rotate String array
//        CircularArray<String> workerTwo = new CircularArray<String>(testTwo);
//
//        // Print out original array
//        System.out.println("***Printing out original arrays***");
//        // Integer Array
//        System.out.print("Integer Array: ");
//        for (int i = 0; i < tester.length; i++) {
//            System.out.print(tester[i] + ", ");
//        }
//        System.out.println();
//        System.out.print("String Array: ");
//        // String Array
//        for (Object o : workerTwo) {
//            System.out.print(o + ", ");
//        }
//
//        // Rotate arrays at chosen position, i.e 5 for the 5th element
//        worker.rotateArray(11);
//        workerTwo.rotateArray(6);
//
//        System.out.println();
//        System.out.println();
//        System.out.println("***Printing out rotated arrays***");
//
//        // Print out rotated arrays using iterator
//
//        // Integer Array
//        System.out.print("Integer Array: ");
//
//        for (Object o : worker) {
//            System.out.print(o + ", ");
//        }
//
//        System.out.println();
//
//        // String Array
//        System.out.print("String Array: ");
//
//        for (Object o : workerTwo) {
//            System.out.print(o + ", ");
//        }








    }
}