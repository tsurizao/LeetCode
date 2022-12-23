import java.util.Arrays;
import java.util.HashMap;

public class Main {

    /**
     * -=([{ Current unworkable exercises }])=-
     *
     */

    public static void main(String[] args) {
        System.out.println("100 == " + AddBinary.addBinary("11", "1"));
        System.out.println("10101 == " + AddBinary.addBinary("1010", "1011"));
        System.out.println("0 == " + AddBinary.addBinary("0", "0"));
        System.out.println("1 == " + AddBinary.addBinary("1", "0"));
        System.out.println("1 == " + AddBinary.addBinary("0", "1"));
        System.out.println("10 == " + AddBinary.addBinary("10", "0"));
        System.out.println("1000 == " + AddBinary.addBinary("1", "111"));
        System.out.println("unknown == " + AddBinary.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));

        //

//        System.out.println(RemoveDuplicatesFromSortedList.deleteDuplicates());

    }
}
