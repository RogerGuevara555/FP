import java.util.Scanner;

public class ejerciciosConCondicionales {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String dia = sc.nextLine();

        switch (dia) {
            case "lunes":
                System.out.println("esgrima");
                break;
            case "martes":
                System.out.println("natacion");
                break;
            case "miercoles":
                System.out.println("musica");
                break;
            case "jueves":
                System.out.println("natacion");
                break;
            case "viernes":
                System.out.println("descanso");
                break;
            case ("sabado"):
                System.out.println("dia sin actividades");
                break;
            case "domingo":
                System.out.println("dia sin actividades");
                break;
            default:
                System.out.println("dia no valido");
                break;
        }

    }
}
