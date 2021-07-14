package src.com.hqyj.mc.Text;

public class ContinueText {
    public static void main(String[] args) {
        //continue时跳出本次循环
        for (int i = 0; i <10 ; i++) {
            if (i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
