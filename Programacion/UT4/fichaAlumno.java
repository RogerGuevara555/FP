import java.util.Scanner;

public class fichaAlumno {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce en este orden: Nombre, Apellidos y Edad");
        String nombre = sc.nextLine();
        String apellidos = sc.nextLine();
        String edad = sc.nextLine();

        if (Integer.parseInt(edad) < 18) {edad += " (m)";}

        System.out.println("+-------------------------------");
        System.out.println("| NOMBRE COMPLETO : " + apellidos + ", " + nombre);
        System.out.println("| EDAD : " + edad);
        System.out.println("+-------------------------------");
    }
}
