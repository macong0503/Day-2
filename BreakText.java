package src.com.hqyj.mc.Text;

public class BreakText {
    public static void main(String[] args) {
        //break 直接跳出循环
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j < 10; j++) {
                if (j==4){
                    System.out.println();
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println("这是外层循环：" +i);
        }

    }
}
