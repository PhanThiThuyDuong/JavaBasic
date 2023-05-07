import java.util.Scanner;
public class Calculator {

    public static int sum(int a, int b) {
        return a + b;
    }
    public static float Tich(float a, float b){
        return a*b;
    }
    public static void main(String[] args){
        int x= sum(2,4);
        float y= Tich(2,3);
        System.out.println("Tổng là:" + x);
        System.out.println("Tích là:" + y);
    }
}
