package Project.ClassWork;

public class StarTriangle {
    public static void main(String[] args) {
        for(int i=1;i<=10;++i) {
            int tp = i;
            while (tp-- > 0)
                System.out.printf("*");
            System.out.printf("\n");
        }
        System.out.println("——————————我是华丽的分界线——————————");
        for(int i=10;i>0;--i) {
            int tp = i;
            while (tp-- > 0)
                System.out.printf("*");
            System.out.printf("\n");
        }
    }
}

