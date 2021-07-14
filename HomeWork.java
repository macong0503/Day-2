package src.com.hqyj.mc.HomeWork;

import javax.imageio.stream.ImageInputStream;
import java.util.concurrent.Callable;

public class HomeWork {
    //输出1~100内前5个可以被3整除的数
    public static void A(){
        int a=0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && a<5){
                a++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    //用for循环和while打印九九乘法表
    //for循环
    public static void B1(){
        System.out.println("for循环");
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }
    //while循环
    public static void B2(){
        System.out.println("while循环");
        int i = 1;
        while(i<10){
            int j = 1;
            while(j<=i){
                System.out.print(j+"*"+i+"="+(i*j)+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    //4.输出101~200内的质数
    public static void C(){
        System.out.print("101~200内的质数: ");
        for (int i = 101; i <201 ; i++) {
            for (int j = 2; j <i ; j++) {
                if (i % j == 0){
                    break;
                }
                if (j==i-1)
                System.out.print(i + "  ");
            }
            }
        System.out.println();

    }
    //5.计算2000年1月1日到2008年1月1日相距多少天
    public static void D() {
        int day = 0;
        int sum = 0;
        for (int i = 2000; i < 2008; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                day = 366;
                sum=sum+day;
            } else {
                day = 365;
                sum = sum + day;
            }
        }
        System.out.println("2000年1月1日到2008年1月1日相距 "+sum+" 天");
        }
        //7.用for循环求2+22+222+2222+22222+…的和
    public static void E(){
        int a=2;
        int b=0;
        int sum=0;
        for (int i = 1; i <6 ; i++) {
            b=b*10+2;
            sum=sum+b;
        }
        System.out.println("2+22+222+2222+22222="+sum);
    }

    public static void main (String[] args){
        A();
        B1();
        B2();
        C();
        D();
        E();


    }
    }