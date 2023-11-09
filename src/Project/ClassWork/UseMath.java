package Project.ClassWork;

import java.util.Random;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.random;

public class UseMath {
    public static void main(String[] args) {
        int cnt=100;
        double maxn=0,minn=101;
        int ans=0;
        while(cnt-->0){
            double temp=random()*100;
            maxn=max(maxn,temp);
            minn=min(minn,temp);
            if(temp>50)
                ++ans;
        }
        System.out.println("最大:"+maxn);
        System.out.println("最小:"+minn);
        System.out.println("大于五十的个数:"+ans);
    }
}
