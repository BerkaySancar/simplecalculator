import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
         /*
        Basit hesap makinesi...

        1)Kullanıcıdan 2 tane sayı al,
        2)Hangi işlemi yapmak istediğini sor,
        3)Sonucu yazdır.
         */
        Scanner input = new Scanner(System.in);
        int a, b, op;
        System.out.print("1. sayı: ");
        a = input.nextInt();
        System.out.print("2. sayı: ");
        b = input.nextInt();
        System.out.print("1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme\nHangi işlemi yapmak istiyorsunuz?:");
        op = input.nextInt();

        switch (op) {
            case 1:
                System.out.print("Sonuç: " + (a + b));
                break;
            case 2:
                System.out.print("Sonuç: " + (a - b));
                break;
            case 3:
                System.out.print("Sonuç: " + (a * b));
                break;
            case 4:
                switch (b) {
                    case 0:
                        System.out.print("Bir sayı 0'a bölünemez.");
                        break;
                    default:
                        System.out.print("Sonuç: " + (a / b));
                }
                break;
            default:
                System.out.print("Hatalı işlem seçimi girdiniz.");

        }
    }
}
