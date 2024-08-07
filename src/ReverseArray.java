import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] input = {1, 2,3, 4, 5, 6,7,8};
        reverseArray(input);
        System.out.println(Arrays.toString(input));
    }
    public static void reverseArray(int[] inputArr) {
        for(int i=0; i<inputArr.length/2; i++) {
            int temp = inputArr[i];
            inputArr[i] = inputArr[inputArr.length-1-i];
            inputArr[inputArr.length-1-i] = temp;
        }
    }
}
