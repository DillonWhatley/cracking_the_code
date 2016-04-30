package StringCompression;

import java.nio.CharBuffer;

/**
 * Created by Dillon on 4/30/2016.
 */

public class StringCompression {


    public String compress(String input){

        char currentChar = input.charAt(0);
        int charCount = 0;
        StringBuffer output = new StringBuffer();

        for(int i = 0; i < input.length(); i++){

            if (i == 0){
                charCount++;
            }

            else if(input.charAt(i) == currentChar){
                charCount++;
            }

            else{
                output.append(currentChar);
                output.append(charCount);
                currentChar = input.charAt(i);
                charCount = 1;
            }
        }
        String compString = output.toString();
        if (compString.length() < input.length()){
            return compString;
        }
        else {
            return input;
        }
    }



    public static void main(String[] args){

        StringCompression tester = new StringCompression();
        // String where compression should be preffered
        String compressable = "aabbbbccdddaba";
        // String where compression technique should be longer and hence not preferred
        String uncompressable = "abcdefghijkl";

        System.out.println("The following string should contain numbers, as its compressed:");
        // Should print out compressed version of the given string
        System.out.println(tester.compress(compressable));

        System.out.println();

        System.out.println("The following string should not contain numbers, as that would be longer than the input:");
        // Should print out uncompressed  version of the given string
        System.out.println(tester.compress(uncompressable));

    }
}
