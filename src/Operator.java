import java.util.Scanner;

public class Operator {
    public void RelationalOperator(){
        System.out.println("Nhập vào số nguyên n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("n is equal to 0");
        } else {
            if (n < 0) {
                System.out.println("n is a negative number");
            } else {
                System.out.println("n is a positive number");
            }
        }
    }
    public void LogicalOperator(){
        boolean a = true, b = false, c;
        c = a && b;
        System.out.println("Ket qua phep (&&): " + c);
        c = a || b;
        System.out.println("Ket qua phep (||): " + c);
        c = !(a && b);
            System.out.println("Ket qua phep (!): " + c);
    }
    public void AllOperator(){
        int a = 55, b = 45 , c = 100;
        System.out.println("Tổng của a + b là:" + (a + b) );
        System.out.println("Hiệu của a - b là:" + (a - b) );
        System.out.println("Tích của a + b là:" + (a * b) );
        System.out.println("Thương của a + b là:" + (a / b) );
        System.out.println("Kết quả toán tử &&" + (c > a && c>b));
        System.out.println("Kết quả toán tử ||" + (c > a || c > b));
        System.out.println("Kết quả của phép Not" +(!(a>b)));
        String s = (a+b == c) ? "C là tổng a và b" : "C khác tổng a và b";
        System.out.println(s);
        if (a+b == c) {
            System.out.println("2. C bằng a+b");
        }
        else {
                if (a + b > c) {
                    System.out.println("2. C bé hơn a+b");
                } else {
                    System.out.println("2.C lớn hơn a+b");
                }
            }
    }
    private int n;
    public void numberOperator(int n){
        this.n = n;
        int number = 100;
        if (n == number) {
            System.out.println("n bằng number");
        } else {
            if (n < number) {
                System.out.println("n bé hơn number");
            } else {
                System.out.println("n lớn hơn number");
            }
        }
    }

    public static void main(String[] args){
        Operator rlOperator = new Operator();
        rlOperator.RelationalOperator();
        Operator lgOperator = new Operator();
        lgOperator.LogicalOperator();
        Operator allOperator = new Operator();
        allOperator.AllOperator();
        Operator nbOperator = new Operator();
        nbOperator.numberOperator(300);
    }
}
