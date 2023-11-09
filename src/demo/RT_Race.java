package demo;

public class RT_Race implements  Runnable{

    private  static String winner;

    @Override
    public void run(){
        for(int i=1;i<=100;++i){
            if( Thread.currentThread().getName().equals("兔子") && i%10 == 0 ){
                try{
                    Thread.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            boolean flag=gameover(i);
            if(flag){
                System.out.println("Winner is "+winner);
                break;
            }
            System.out.println(Thread.currentThread().getName()+"--->跑了"+i+"步数");
        }
    }

    private boolean gameover(int steps){
        if(winner != null){
            return true;
        }
        if(steps>=100){
            winner=Thread.currentThread().getName();
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        RT_Race t=new RT_Race();
        new Thread(t,"兔子").start();
        new Thread(t,"乌龟").start();
    }
}
