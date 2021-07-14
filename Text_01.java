package src.com.hqyj.mc.Text;


import java.util.Scanner;

public class Text_01 {
    //打印五乘八的矩阵
    public void Demo1(){
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <8 ; j++) {
                System.out.print("1" + " ");
            }
            System.out.println();
        }
    }
    public void Demo2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入行数：");
        int i = sc.nextInt();
            for (int j = 1; j <= i ; j++) {
                for (int h = 1; h <= i-j ; h++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2*j-1 ; k++) {
                    System.out.print("*");

                }
                    System.out.println();


        }
    }
    public static void main(String[] args) {
        Text_01 t = new Text_01();
        t.Demo1();
        t.Demo2();

    }
}
