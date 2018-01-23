package com.ljm;

import java.util.Timer;
import java.util.TimerTask;
import static com.ljm.CountDown.*;

public class test {

    public static void main(String[] args) {
            long second=500;
        initDate(second);
        System.out.println(second);
        System.out.println(secondNotAlready);

        new Timer().schedule(new TimerTask(){
            public void run(){
                if(secondNotAlready){
                    startCount();
                }else{
                    cancel();
                    System.out.println("关闭");
                }
            }
        },0,1000);
    }

}
