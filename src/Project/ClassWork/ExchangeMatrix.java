package Project.ClassWork;

import java.util.Arrays;
import java.util.Scanner;

public class ExchangeMatrix {
    public static void main(String[] args) {
        // 创建3行3列的二维数组ma,mb
        int[][] ma,mb;
        ma = new int[3][3];
        mb = new int[3][3];
        int row, col;
        Scanner sc = new Scanner(System.in);
        // 输入9个整数，存入3行3列的数组ma中
        for (row = 0; row < 3; row++)
            for (col = 0; col < 3; col++)
				ma[row][col]=sc.nextInt();
        // 输出转置前的矩阵ma
        System.out.println("原始矩阵");
        for(int i=0;i<ma.length;++i){
            System.out.println(Arrays.toString(ma[i]));
        }

        //计算转置矩阵mb
        for(int i=0;i<ma.length;++i){
            for(int j=0;j<ma[i].length;++j){
                mb[i][j]=ma[j][i];
            }
        }

        // 输出转置后的矩阵
        System.out.println("转置后的矩阵");
        for(int i=0;i<ma.length;++i){
            System.out.println(Arrays.toString(ma[i]));
        }

        sc.close();
    }

    private static void swap(int[][] a,int x1,int y1,int x2,int y2) {
        int index=a[x1][y1];
        a[x1][y1]=a[x2][y2];
        a[x2][y2]=index;
    }
}
