package zadanie4;

import java.util.Locale;
import java.util.Scanner;

public class Points {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Podaj wspolrzędną X:");
        int x=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Podaj wspolrzędną Y:");
        int y=scanner.nextInt();
        scanner.nextLine();
        String cw="I";
        if (x>0&&y<0){
            cw="II";
        }
        else if (x<0&&y<0){
            cw="III";
        }
        else if (x<0&&y>0){
            cw="IV";
        }
        System.out.print("Punkt ("+x+", "+y+") znajduje się w ćwiartce "+cw+", układu współrzędnych");

    }
}
