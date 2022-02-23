package sk.stupen;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Cviko1 {
    public static void main(String[] args) {

        int x = 5;
        int[] y = new int[]{1, 2, 3};

        System.out.println(x);
        testPrimitive(x);
        System.out.println(x);

        System.out.println(Arrays.toString(y));
        testArray(y);
        System.out.println(Arrays.toString(y));

    }
    public static void testPrimitive(int cislo){
        cislo=10;
        System.out.println(cislo);
    }

    public static void testArray(int[] array){
        array[0]= 10;
        System.out.println(Arrays.toString(array));
    }

}
