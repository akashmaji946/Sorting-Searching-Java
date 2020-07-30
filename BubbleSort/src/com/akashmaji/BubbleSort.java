package com.akashmaji;

public class BubbleSort {

    public void sort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[j] < arr[j-1])
                    swap(j,j-1, arr);
            }
        }



    }
    private void swap(int i, int j, int arr[]){
        var temp = arr[i];
        arr[i] = arr[j-1];
        arr[j-1] = temp;
    }


}
