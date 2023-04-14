import java.util.Scanner;

public class UsHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int taban, us;
        double sonuc = 1;

        System.out.print("Taban değerini giriniz: ");
        taban = input.nextInt();

        System.out.print("Üs değerini giriniz: ");
        us = input.nextInt();

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println(taban + "^" + us + " = " + sonuc);
    }
}