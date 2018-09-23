package zadanie6;

import java.util.Locale;
import java.util.Scanner;

public class NumberUserVer2 {

        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            scanner.useLocale(Locale.US);
            double liczba;

                do {
                    System.out.print("Podaj liczbę: ");
                    liczba=scanner.nextDouble();
                    scanner.nextLine();
                    if (liczba < 100) {
                        System.out.println("Podana liczba jest za mała.");
                    }
                    else if (liczba > 200) {
                        System.out.println("Podana liczba jest za duża. ");
                    }
                    else if (liczba % 3 != 0) {
                        System.out.println("Podana liczba nie jest podzielna przez 3. ");
                    }
                    else{
                    System.out.println("Twoja liczba jest ok"); }

                } while (liczba < 100 || liczba > 200 || liczba % 3 != 0);


            }
        }
