import java.util.Scanner;
import java.util.Random;

public class piedraPapelTijeras {


    public static void main (String[] args) {
        int p1points = 0;
        int p2points = 0;
        int empates = 0;
        int[] stats = {p1points, p2points, empates};

        player1_vs_player2(stats);
        //player1_vs_PC(stats);
    }


    static void player1_vs_player2 (int[] stats) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Jugada de P1 > ");
            String jugada1 = sc.nextLine();
            System.out.print("Jugada de P2 > ");
            String jugada2 = sc.nextLine();

            if (jugada1 == "q" || jugada2 == "q") break;

            comprobarGanador(jugada1,jugada2,stats);
            printPoints(stats);
        }

        sc.close();
        stats = resetPoints(stats);
    }


    static void player1_vs_PC (int[] stats) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        while (true) {
            System.out.print("Jugada de P1 > ");
            String jugada1 = sc.nextLine();
            String jugada2 = "";

            int rng = rn.nextInt(2);
            switch (rng) {
                case 0 : jugada2 = "piedra"; break;
                case 1 : jugada2 = "papel"; break;
                case 2 : jugada2 = "tijeras"; break;
            }

            if (jugada1 == "q") break;

            comprobarGanador(jugada1,jugada2,stats);
            printPoints(stats);
        }

        sc.close();
        stats = resetPoints(stats);
    }


    static void PC_vs_PC (int[] stats) {}


    static void comprobarGanador (String jugada1, String jugada2, int[] stats) {
        if      (jugada1 == "piedra" && jugada2 == "tijeras")  {stats[0]++;}
        else if (jugada1 == "piedra" && jugada2 == "papel")    {stats[1]++;}

        else if (jugada1 == "papel" && jugada2 == "piedra")    {stats[0]++;}
        else if (jugada1 == "papel" && jugada2 == "tijeras")   {stats[1]++;}

        else if (jugada1 == "tijeras" && jugada2 == "papel")   {stats[0]++;}
        else if (jugada1 == "tijeras" && jugada2 == "piedra")  {stats[1]++;}


        else if (jugada1 == "piedra" && jugada2 == "piedra")   {stats[2]++;}
        else if (jugada1 == "papel" && jugada2 == "papel")     {stats[2]++;}
        else if (jugada1 == "tijeras" && jugada2 == "tijeras") {stats[2]++;}
    }

    static void printPoints (int[] stats) {
        int p1points = stats[0];
        int p2points = stats[1];
        int empates = stats[2];
        System.out.println("Jugador1 " + p1points + "ptos");
        System.out.println("Jugador2 " + p2points + "ptos");
        System.out.println("Han empatado " + empates + " veces");
    }

    static int[] resetPoints (int[] stats) {
        return new int[]{0, 0, 0};
    }
}
