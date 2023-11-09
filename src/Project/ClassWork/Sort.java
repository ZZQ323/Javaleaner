package Project.ClassWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //动态创建数组
        int[] arr = new int[sc.nextInt()];
        for(int i = 0 ; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        //冒泡排序
        BubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void BubbleSort(int[] arr) {
        for(int i=arr.length-1;i>=0;--i) {
            for (int j = 0; j < i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr,j + 1,j);
                }
            }
        }
    }

    private static void swap(int[] a, int i,int j) {
        int index=a[i];
        a[i]=a[j];
        a[j]=index;
    }
}
