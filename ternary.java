import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a= sc.nextInt();
        System.out.println(a>0?+a+"=number posetive":+a+"=number negative");
    }
}
