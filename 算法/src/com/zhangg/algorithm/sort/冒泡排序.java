package com.zhangg.algorithm.sort;

/**
 * 每一轮选出最大的一个放到最后
 */
public class 冒泡排序 {



    public static void bubbleSort(int[] arr){
        if (arr == null || arr.length<2) {
            return;
        }
        int N = arr.length;
        // 0~n-1
        // 0~n-2
        // 0~n-3
        for (int end=N-1;end >=0;end--){
            for (int second =1;second<=end;second++){
                if (arr[second-1]>arr[second]){
                    swap(arr,second-1,second);
                }
            }
        }
    }


    public static void swap(int[] arr,int i,int j){
        int nowData = arr[i];
        arr[i] = arr[j];
        arr[j] = nowData;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3,2,5,6,3,2,56,9};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


}
