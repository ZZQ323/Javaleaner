package demo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class DownloadPicture extends Thread{
    private String url;
    private String name;

    public DownloadPicture(String url,String name){
        this.url=url;
        this.name=name;
    }

    @Override
    public  void run(){
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.downloader(url, name);
        System.out.println("下载了文件名为:"+name);
    }

    public static void main(String[] args) {
        DownloadPicture DP1=new DownloadPicture("https://communityovercode.files.wordpress.com/2023/03/hcc-exterior-3.jpg", "digging/pic1.jpg");
        DownloadPicture DP2=new DownloadPicture("https://communityovercode.files.wordpress.com/2023/03/halifax_boardwalk-1.jpeg", "digging/pic2.jpg");
        DP1.start();
        DP2.start();
    }
}

class WebDownLoader{
    //    下载方法
    public void downloader(String url,String name){
        try{
            FileUtils.copyURLToFile(new URL(url), new File(name));
        }catch(IOException e){
            e.printStackTrace();
            System.out.printf("IO异常, downloader方法出现问题\n");
        }
    }
}
