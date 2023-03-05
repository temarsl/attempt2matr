import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scan.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("enter an option");
        int num = scan.nextInt();
        double ans = 0;
        double x, y, a, n, b, c, d, w, a0, a1, a2;

        switch (num) {
            case (1):
                System.out.println("enter a");
                a = scan.nextDouble();
                System.out.println("enter n");
                n = scan.nextDouble();
                System.out.println("enter x");
                x = scan.nextDouble();
                System.out.println("enter b");
                b = scan.nextDouble();
                System.out.println("enter c");
                c = scan.nextDouble();
                ans = 5 * Math.pow(a, n * x) / (b + c) - Math.sqrt(Math.abs(Math.cos(Math.pow(x, 3))));
                System.out.println("Hello, " + name + " option = " + num + " , a = " + a + " , n = " + n + " , x = " + x + " , b = " + b + " , c = " + c + " ,ans = " + ans);
                break;
            case (2):
                System.out.println("enter x");
                x = scan.nextDouble();
                System.out.println("enter y");
                y = scan.nextDouble();
                System.out.println("enter a");
                a = scan.nextDouble();
                System.out.println("enter w");
                w = scan.nextDouble();
                ans = Math.abs(x-y)/(Math.pow((1+2*x),a)) - Math.exp(Math.sqrt(1+w));
                System.out.println("Hello, " + name + " option = " + num + " , a = " + a + " , x = " + x + " , y = " + y + " , w = " + w + " ,ans = " + ans);
                break;
            case (3):
                System.out.println("enter a0");
                a0 = scan.nextDouble();
                System.out.println("enter a1");
                a1 = scan.nextDouble();
                System.out.println("enter a2");
                a2 = scan.nextDouble();
                System.out.println("enter x");
                x = scan.nextDouble();
                ans = Math.sqrt(a0 + a1*x + a2*Math.cbrt(Math.abs(Math.sin(x))));
                System.out.println("Hello, " + name + " option = " + num + " , a0 = " + a0 + " , a1 = " + a1 + " , a2 = " + a2 + " , x = " + x + " ,ans = " + ans);
                break;
            case (4):
                System.out.println("enter a");
                a = scan.nextDouble();
                System.out.println("enter x");
                x = scan.nextDouble();
                ans = Math.log(Math.abs(Math.pow(a,7))) + Math.atan(x*x) + Math.PI/Math.sqrt(Math.abs(a+x));
                System.out.println("Hello, " + name + " option = " + num + " , a = " + a + " , x = " + x + " ,ans = " + ans);
                break;
            case (5):
                System.out.println("enter a");
                a = scan.nextDouble();
                System.out.println("enter b");
                b = scan.nextDouble();
                System.out.println("enter c");
                c = scan.nextDouble();
                System.out.println("enter d");
                d = scan.nextDouble();
                System.out.println("enter x");
                x = scan.nextDouble();
                ans = Math.pow(Math.pow((a+b),2)/(c+d) + Math.exp(Math.sqrt(x+1)),1/5);
                System.out.println("Hello, " + name + " option = " + num + " , a = " + a + " , b = " + b + " , c = " + c + " , d = " + d + " , x = " + x + " ,ans = " + ans);
                break;
            case (6):
                System.out.println("enter x");
                x = scan.nextDouble();
                ans = Math.exp((2*Math.sin(4*x) + Math.cos(x*x)*Math.cos(x*x))/3*x);
                System.out.println("Hello, " + name + " option = " + num + " , x = " + x + " ,ans = " + ans);
                break;
            case (7):
                System.out.println("enter x");
                x = scan.nextDouble();
                ans = 1/4 * ((1+x*x)/(1-x) + 1/2*Math.tan(x));
                System.out.println("Hello, " + name + " option = " + num + " , x = " + x + " ,ans = " + ans);
                break;
            default:
                System.out.println("invalid option number");
        }



    }
}
