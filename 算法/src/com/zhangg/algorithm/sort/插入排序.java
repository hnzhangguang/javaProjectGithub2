package com.zhangg.algorithm.sort;

public class �������� {


    public static void swap(int[] arr,int i,int j){
        int nowData = arr[i];
        arr[i] = arr[j];
        arr[j] = nowData;
    }


    public static void insertSort(int[] arr){
        if (null == arr || arr.length == 1){
            return;
        }
        for (int i = 1;i<arr.length;i++){
            int newIndex = i;
            while (newIndex-1>=0 && arr[newIndex-1]>arr[newIndex]){//��Ҫ����
                swap(arr,newIndex-1,newIndex);
                newIndex--;//��ǰindex��ǰ��
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
