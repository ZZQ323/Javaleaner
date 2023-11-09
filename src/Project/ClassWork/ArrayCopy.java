package Project.ClassWork;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        int []arr1={11,22,33,44,55};
        Scanner sc = new Scanner(System.in);
//        int[] arr1 = new int[3];
//        for(int i = 0 ; i< arr1.length ; i++){
//            arr1[i] = sc.nextInt();
//        }

//        int[] arr2=arr1.clone();//
//        int[] arr2=Arrays.copyOf(arr1,arr1.length);//[0,len)
//        int[] arr2=Arrays.copyOfRange(arr1,0,arr1.length);//[l,r)
        int[] arr2=new int[10];
//        System.arraycopy(arr1,0,arr2,3,5);

        for (int i = 0; i < arr1.length; ++i) {
            arr2[i]=arr1[i];
        }

        System.out.println("arr2::"+ Arrays.toString(arr2));
    }
}
