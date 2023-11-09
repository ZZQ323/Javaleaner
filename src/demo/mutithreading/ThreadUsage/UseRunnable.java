package demo.mutithreading.ThreadUsage;

public class UseRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=200;++i)
            System.out.println("我在看dm ----------"+i);
    }

    public static void main(String[] args) {
        //创建Runnable接口实现的类对象
        UseRunnable thread=new UseRunnable();
        // 创建线程对象，通过线程对象来开启我们的线程，代理分配资源的过程
        new Thread(thread).start();

        for(int i=1;i<=200;++i)
            System.out.println("我在main函数 ----------"+i);
    }
}

class A extends UseRunnable{

    public static void main(String[] args) {
        System.out.println("子类为什么不强制重写run了？？？？");
        System.out.println("而且为什么一个类可以有多个class");
    }
}
