package com.luucckkyy.jjeett.ertyfv;

import android.provider.Settings;
import android.widget.ImageView;

import com.luucckkyy.jjeett.ertyfv.jsl.LJ;

import java.util.Random;

public class SetImg1 {

    public static void setImg(ImageView imageView){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Random random1 = new Random();
                int c = random1.nextInt(30);
                for (int i = 0 ; i<c; i++){
                    imageView.post(new Runnable() {
                        @Override
                        public void run() {
                            Random random = new Random();
                            int a = random.nextInt(3);
                            if (a == 0){
                                imageView.setImageResource(R.drawable.a1);
                            }
                            if (a == 1){
                                imageView.setImageResource(R.drawable.a2);
                            }
                            if (a == 3){
                                imageView.setImageResource(R.drawable.coinc);
                            }

                        }
                    });
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();
    }

    public static int ifd(LJ lj){
        return Settings.Secure.getInt(lj.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
    }
}
