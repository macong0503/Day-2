package src.com.hqyj.mc.Text;

public class RecursionText {
    //斐波那契数列：1 1 2 3 5 8 13 21 34
    public static int demo1(int i){

            if (i == 1 )
                return 1;
            if (i == 2)
                return 1;
            return demo1(i - 1) + demo1(i - 2);

    }

    public static int demo2(int i){
        if(i == 1)
            return 1;
        return i*demo2(--i);
    }


    public static void main(String[] args) {
        for (int j = 1; j <=10 ; j++) {
            System.out.print(demo1(j)+" ");
        }
        System.out.println();
        int sum = 0;
        for (int k = 1; k <11 ; k++) {
            demo2(k);
            sum=sum+demo2(k);
        }
        System.out.println(sum);



    }
}
