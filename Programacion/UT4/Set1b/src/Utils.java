import java.util.Scanner;

public class Utils {
    public static void main(String[] args) {
        precioEnvio();
    }

    public static boolean esBisiesto (int year) {
        if (year%4 == 0 && year%100 != 0)
            return true;
        return false;
    }

    public static String esVocal (char c) {
        String vocales = "AEIOUÁÉÍÓÚÜaeiouáéíóúü";
        String cString = String.valueOf(c);
        if (vocales.contains(cString))
            return "VOCAL";
        return "NO VOCAL";
    }

    public static void precioEnvio () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el peso de tu artículo (en gramos)");
        double coste = 0;
        double razon = 0;
        double peso = sc.nextDouble();
        boolean error = false;

        if (peso > 0 && peso <= 5000) {
            System.out.println("Introdice la zona (AN, AC, SA, EU, AS)");
            String zona = sc.next();

            switch (zona) {
                case "AN": razon = 2.4; break;
                case "AC": razon = 2.0; break;
                case "SA": razon = 2.1; break;
                case "EU": razon = 1.0; break;
                case "AS": razon = 1.8; break;
                default:
                    System.out.println("Código ISO incorrecto");
                    error = true;
                    break;
            }
        } else {
            System.out.println("Pesa más de 5kg");
            error = true;
        }
        if (!error) {
            coste = peso*razon;
            System.out.println("Coste del transporte: "+coste+"$");
        }
    }

    public static void recuadro (int ancho, int alto) {
        boolean codicionAltura = ancho > 0 && ancho < 77;
        boolean condicionAncho = alto >= 0 && alto <= 22;
        boolean condicionGeneral = (codicionAltura && condicionAncho);
        String techo = "\n****";
        String interior1 = "\n* ";
        String interior2 = "\n* ";


        if (condicionGeneral) {
            for (int i=1; i<=ancho; i++) {techo += "*";}
            for (int i=1; i<=ancho; i++) {interior1 += i;}
            for (int i=1; i<=ancho; i++) {interior2 += " ";}

            interior1 += " *";
            interior2 += " *";

            if (alto == 0) {}
        }
    }
}











