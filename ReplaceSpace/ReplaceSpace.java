package ReplaceSpace;

/**
 * Created by Dillon on 4/25/2016.
 */
public class ReplaceSpace {

    // MAIN FUNCTION OBSOLETE - driver class demos functionality, main no longer needed within class

//    public static void main(String[] args){
//        char[] input = "Mr John Smith    ".toCharArray();
//        for (char c : input){
//            System.out.print(c);
//        }
//        System.out.println();
//     //   System.out.println(Arrays.toString(input));
//        ReplaceSpace stringManipulator = new ReplaceSpace();
//        stringManipulator.replaceSpace(input, 13);
//      // System.out.println(Arrays.toString(input));
//        for (char c : input){
//            System.out.print(c);
//        }
//        System.out.println();
//    }

    public void replaceSpace(char[] input, int length){
        int spaceCount = 0, newLength, i;
        for (i = 0; i < length; i++){
            if (input[i] == ' '){
                spaceCount++;
            }
        }
        newLength = (length + (2 * spaceCount));
        for (i = length - 1; i >= 0; i--){
            if(input[i] == ' '){
                input[newLength-1] = '0';
                input[newLength-2] = '2';
                input[newLength-3] = '#';
                newLength = newLength-3;
            }
            else{
                input[newLength-1] = input[i];
                newLength--;
            }
        }
    }
}
