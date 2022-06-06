package com.zhangg.algorithm.sort;


/**
 * 每次找到剩余元素的最小值/最大值
 */
public class 选择排序 {


    public static void selectorSort(int[] arr){
        if (arr == null || arr.length<2) {
            return;
        }
        int N = arr.length;
        // 0~n-1
        // 1~n-1
        for (int i=0;i<N;i++){
            int minIndex = i;
            for (int j=i+1;j<N;j++){
                minIndex=arr[j]<arr[minIndex]?j:minIndex;
            }
            swap(arr,i, minIndex);
        }
    }


    public static void swap(int[] arr,int i,int j){
        int nowData = arr[i];
        arr[i] = arr[j];
        arr[j] = nowData;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3,2,5,6,3,2,56,9};
        selectorSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
