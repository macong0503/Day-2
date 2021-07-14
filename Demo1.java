package src.com.hqyj.mc.Text;

public class Demo1 {
    public static void main(String[] args) {
        //输出1-10所有的奇数
       // for (int i = 1; i <11 ; i++) {
         //   if (i%2!=0)
           // System.out.println(i);
        //输出1-100偶数和
        int sum = 0;
        for (int i = 0; i <=100 ; i++) {
            if (i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
