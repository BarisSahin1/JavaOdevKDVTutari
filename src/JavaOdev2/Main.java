package JavaOdev2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float fiyat,KDVfiyat;

        System.out.println("Hosgeldiniz KDV tutarını hesaplamak istediginiz ürünün fiyatını giriniz:");
        fiyat = scanner.nextFloat();

        if(fiyat > 0 && fiyat < 1000){
            KDVfiyat = fiyat + fiyat * 18/100;
        }
        else KDVfiyat = fiyat + fiyat * 8/100;

        System.out.println("KDVli fiyatınız : " + KDVfiyat);
    }
}
