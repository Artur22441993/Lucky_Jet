package com.luucckkyy.jjeett.ertyfv;

import android.widget.ImageView;

import java.util.Random;

public class SetImg2 {

    public static void setImg2(ImageView imageView){

        new Thread(new Runnable() {
            @Override
            public void run() {

                Random random1 = new Random();
                int c = random1.nextInt(30);

                for (int i = 0; i< c;i++){

                    imageView.post(new Runnable() {
                        @Override
                        public void run() {
                            Random random = new Random();
                            int a = random.nextInt(3);
                            switch (a){
                                case 0:
                                    imageView.setImageResource(R.drawable.coinc);
                                    break;
                                case 1:
                                    imageView.setImageResource(R.drawable.a2);
                                    break;
                                case 2:
                                    imageView.setImageResource(R.drawable.a1);
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
}
