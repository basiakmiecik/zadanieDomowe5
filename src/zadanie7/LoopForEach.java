package zadanie7;

import java.util.Scanner;

public class LoopForEach {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String []names=new String[5];
        int i=5;
        do {
            System.out.print("Podaj imię: ");
            names[i-1]=scanner.nextLine();
            i-=1;
        }while(i>0);

        for (String name:names
        )
        {
            System.out.println("Cześć "+name);

        }
    }
}
