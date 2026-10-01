import java.util.Scanner;

public class actividadesExtraescolares {
    public static void main (String args[]) {
        System.out.print("Introduce el dia: ");
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
            case "sabado": case "domingo":
                System.out.println("dia sin actividades");
                break;
            default:
                System.out.println("dia no valido");
                break;
        }

        sc.close();
    }
}
