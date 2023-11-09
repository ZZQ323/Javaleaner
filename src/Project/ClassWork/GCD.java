package Project.ClassWork;

import java.util.Scanner;

// 可以利用BigInteger里的a.gcd(b)方法求a和b的最大公约数
public class GCD {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int a,b;
        a=cin.nextInt();
        b=cin.nextInt();
        int t=gcd(a,b);
        System.out.println(a+"和"+b+"的最大公约数:"+t);
        System.out.println(a+"和"+b+"的最小公倍数:"+a/t*b);
        cin.close();
    }
    //    辗转相除法
    static int gcd(int a,int b){
        assert(a>0);
        assert(b>0);
        return (b==0)?a:gcd(b,a%b);
    }

    //    更相减损法
//    static int gcd(int a,int b){
//        if(a==b)return a;
//        else if(a>b)return gcd(a-b,b);
//        else return gcd(a,b-a);
//    }


    //    枚举法
//    static int gcd(int a,int b){
//        for(int i=a;i>0;--i){
//            for(int j=b;j>0;--j) {
//                if(a%i==0 && b%i==0 )
//                    return i;
//            }
//        }
//        return 0;
//    }

}

/*
-1
1
-1和1的最大公约数:1
-1和1的最小公倍数:-1

assert 没有报错不知道为什么。

 */
