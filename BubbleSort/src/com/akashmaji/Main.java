package com.akashmaji;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] array = {1, 5, 3, 2, 9, 8, 19, 43, 23};

        System.out.println(Arrays.toString(array));
        BubbleSort sorter = new BubbleSort();
        sorter.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
