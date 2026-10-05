import java.util.Scanner;

public class Utils {
    public static void main(String[] args) {

    }

    boolean esBisiesto (int year) {
        if (year%4 == 0 && year%100 != 0)
            return true;
        return false;
    }

    String esVocal (char c) {
        String vocales = "AEIOUÁÉÍÓÚÜaeiouáéíóúü";
        String cString = String.valueOf(c);
        if (vocales.contains(cString))
            return "VOCAL";
        return "NO VOCAL";
    }


}
