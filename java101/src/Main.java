import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo, bkEndeks;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu (kg cinsinden) giriniz: ");
        kilo = inp.nextDouble();

        bkEndeks = kilo / (boy * boy);
        System.out.println("Vücut kitle endeksiniz: " + bkEndeks);


    }
}
