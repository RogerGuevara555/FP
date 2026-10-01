import java.util.Scanner;

public class resolucionEcuacion {
    public static void main(String[] args) {
        System.out.println("Introduce los argumentos de tu ecuación cuadrática:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = (b*b - 4*a*c);
        if (d < 0)
            System.out.println("D < 0: No tiene solución en los reales");
        else if (a == 0)
            System.out.println("a = 0: No es una ecuación cuadrática");
        else {
            double x_1 = (-1 * b + Math.sqrt(d)) / (2 * a);
            double x_2 = (-1 * b - Math.sqrt(d)) / (2 * a);
            if (x_1 == x_2)
                System.out.println("Solución doble: " + x_1);
            else
                System.out.println("x_1 = " + x_1 + "\nx_2 = " + x_2);
        }

        sc.close();
    }
}
