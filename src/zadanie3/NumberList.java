package zadanie3;

public class NumberList {
    public static void main(String[] args) {

        double start=0;

        while (start<3.10){

            System.out.println(Math.round(start*100)/100.0);
            start=start+0.10;
        }
        double start2=0;
        do{

            System.out.println(Math.round(start2*100)/100.0);
            start2+=0.1;
        }while(start2<3.1);
    }
}
