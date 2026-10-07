import java.util.Scanner;
import java.util.Random;

public class ejsSet1 {
    public static void main(String[] args) {
        //ej210();
        //ej211();
        //ej212();
        //ej213();
        //ej214();
        //ej215();
        //ej216();
        //ej217();
        ej218();
    }


    static void ej210 () {
        // Descuento
        final double DESCUENTO = 0.08;
        final double IMPORTE_MINIMO = 100;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el importe");
        double importe = sc.nextDouble();

        if (importe >= IMPORTE_MINIMO) {
            importe -= importe*DESCUENTO;
            System.out.println("Con un descuento de " + DESCUENTO*100+"%, su paga será de " + importe);
        } else {
            System.out.println("Su paga es de " + importe);
        }

        sc.close();
    }


    static void ej211 () {
        // Notas
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota:");
        double nota = sc.nextDouble();
        
        if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        } else if (nota >= 6.5 && nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 5 && nota <= 6.5) {
            System.out.println("Suficiente");
        } else if (nota >= 0 && nota < 5) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("Nota no válida");
        }

        sc.close();
    }


    static void ej212 () {
        // Descuento modificado
        final double DESCUENTO = 0.08;
        final double IMPORTE_MINIMO = 100;
        final double IMPORTE_MAXIMO = 500;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el importe");
        double importe = sc.nextDouble();

        if (importe < 0) {
            importe = 0;
            System.out.println("El importe es negativo. No se realizará la paga.");
        } else if (importe >= IMPORTE_MINIMO && importe <= IMPORTE_MAXIMO) {
            importe -= importe*DESCUENTO;
        } else if (importe > IMPORTE_MAXIMO) {
            importe -= IMPORTE_MAXIMO*DESCUENTO;
        }

        System.out.println("Su paga es de " + importe);

        sc.close();
    }


    static void ej213 () {
        // Operacion
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números y la operación a realizar entre medias \n(+, -, *, /)");
        double a = sc.nextDouble();
        String operacion = sc.next();
        double b = sc.nextDouble();

        switch (operacion) {
            case "+" : System.out.println(a + b); break;
            case "-" : System.out.println(a - b); break;
            case "*" : System.out.println(a * b); break;
            case "/" : 
                if (b != 0) System.out.println(a / b);
                else System.out.println("ERROR");
                break;
        }

        sc.close();
    }


    static void ej214 () {
        // Días del mes
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el indice del mes: ");
        int mes = sc.nextInt();

        switch (mes) {
            case 2: 
                System.out.println("28 o 29 días"); 
                break; //febrero
            case 4: case 6: case 9: case 11: 
                System.out.println("30 días"); 
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
                System.out.println("31 días"); 
                break;
            default:
                System.out.println("Número de mes incorrecto"); 
                break;
        }

        sc.close();
    }


    static void ej215 () {
        // Termostato
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir temperatura: ");
        double temperatura = sc.nextDouble();

        if (temperatura > 21) 
            System.out.println("Activar el aire acondicionado");
        else 
            System.err.println("Parar el arie acondicionado");

        sc.close();
    }


    static void ej216 () {
        // Horarios
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora");
        int hora = sc.nextInt();
        boolean trabajo1 = (hora >= 9 && hora <= 14);
        boolean trabajo2 = (hora >= 16 && hora <= 19);
        boolean descanso = (hora > 14 && hora < 16);

        if (trabajo1 || trabajo2) System.out.println("TRABAJO");
        else if (descanso)        System.out.println("DESCANSO");
        else                      System.out.println("FUERA DE HORARIO");

        sc.close();
    }


    static void ej217 () {
        // Adivinar numero
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        int numero = rn.nextInt(100) + 1; // numero entre 1 y 100

        System.out.println("Adivina el número entre 1 y 100");
        while (true) {
            int intento = sc.nextInt();
            if (intento == numero) {
                System.out.println("Felicidades, haas adivinado el número");
                break;
            }
            if (intento < numero)
                System.out.println("El número es mayor que eso");
            if (intento > numero)
                System.out.println("El número es menor que eso");
        }

        sc.close();
    }


    static void ej218 () {
        // Adivinar numero a la menos uno
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        boolean adivinado = false;
        int iteracion = 1;
        int cotaSuperior = 100;
        int cotaInferior = 1;
        int intento = rn.nextInt(100)+1;
        int probabilidadSalto = 0; // da igual este valor ahora

        System.out.println("Piensa en un número entre 1 y 100. \nDime si es mayor (>), menor (<) o igual (=) que mi intento");
        while (!adivinado) {
            System.out.println(intento+"?");
            String respuesta = sc.nextLine();

            switch (respuesta) {
                case ">": cotaInferior = intento; break;
                case "<": cotaSuperior = intento; break;
                case "=":
                    System.out.println("Lo logré en "+iteracion+" intentos :)");
                    adivinado = true;
                    break;
                } iteracion++;
            
            intento = (cotaSuperior + cotaInferior) / 2;
                
            probabilidadSalto = rn.nextInt(5);
            if (probabilidadSalto == 0 && cotaSuperior-cotaInferior > 3) {
                int numeroRandom = rn.nextInt((cotaSuperior-1) - (cotaInferior+1)) + cotaInferior;
                intento = numeroRandom;
                System.out.println("Salto random");
                continue;
            }   
        }

        sc.close();
    }
}












