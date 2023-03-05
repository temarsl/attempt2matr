import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scan.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("enter x");
        double x = scan.nextDouble();
        System.out.println("enter y");
        double y = scan.nextDouble();
        System.out.println(3*Math.cos(x - Math.PI)*Math.cos(x - Math.PI)/(0.5 + Math.sin(y*y)));
    }
}
