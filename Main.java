package com.company;

public class Main {

        public static void main(String[] args) {
            long kaishi=System.currentTimeMillis();
            for(int i=0;i<10000;i++)
            {
                System.out.println(i);
            }
            long jiehsu=System.currentTimeMillis();//与1970.1的毫秒差
            System.out.println((jiehsu)*1.0/1000/60/60/24/356+"年");
            System.out.println("执行的时间为"+(jiehsu-kaishi)+"毫秒");
        }
    }


