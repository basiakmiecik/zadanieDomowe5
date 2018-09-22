package zadanie6;

import java.util.Locale;
import java.util.Scanner;

public class NumberUser {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Podaj liczbę: ");
        double liczba=scanner.nextDouble();
        scanner.nextLine();
        if(liczba<100||liczba >200||liczba%3!=0) {
            do {
                if (liczba < 100) {
                    System.out.print("Podana liczba jest za mała. \nPodaj liczbę: ");
                } else if (liczba > 200) {
                    System.out.print("Podana liczba jest za duża. \nPodaj liczbę: ");
                } else if (liczba % 3 != 0) {
                    System.out.print("Podana liczba nie jest podzielna przez 3. \nPodaj liczbę: ");
                }
                liczba = scanner.nextDouble();
                scanner.nextLine();
            } while (liczba < 100 || liczba > 200 || liczba % 3 != 0);
        }
        if(liczba>100&&liczba<200&&liczba%3==0){
                System.out.println("Twoja liczba jest ok");
        }
    }
}
