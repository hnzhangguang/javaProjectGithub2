package com.zhangg.algorithm.sort;

/**
 * 插入后的都是有序的
 */
public class 插入排序 {


    public static void swap(int[] arr,int i,int j){
        int nowData = arr[i];
        arr[i] = arr[j];
        arr[j] = nowData;
    }


    /**
     * 优化版本
     * @param arr
     */
    public static void insertSort(int[] arr){
        if (null == arr || arr.length == 1){
            return;
        }
        int N = arr.length;
        for (int end = 1;end < N;end++){
           for (int pre = end -1; pre>=0&&arr[pre]>arr[pre+1];pre--){
               swap(arr,pre,pre+1);
           }
        }
    }


    /**
     *
     * @param arr
     */
    public static void insertSort2(int[] arr){
        if (null == arr || arr.length == 1){
            return;
        }
        for (int i = 1;i<arr.length;i++){
            int newIndex = i;
            while (newIndex-1>=0 && arr[newIndex-1]>arr[newIndex]){//需要交换
                swap(arr,newIndex-1,newIndex);
                newIndex--;//当前index往前移
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{3,2,5,6,3,2,56,9};
        insertSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }



    }
}
