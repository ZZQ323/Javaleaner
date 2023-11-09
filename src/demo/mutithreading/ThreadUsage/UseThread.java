package demo.mutithreading.ThreadUsage;

public class UseThread extends Thread{

    @Override
    public void run(){
        for(int i=0;i<200;++i) {
            System.out.println("我在run里面----------" + i);
        }
    }

    public static void main(String[] args) {
        UseThread thread01=new UseThread();
        thread01.start();
//        thread01.join();
        for(int i=0;i<200;++i){
            System.out.println("我在main线程---"+i);
        }

    }
}
