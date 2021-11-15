import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        String use;
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Sayı: ");
        a = scanner.nextInt();
        System.out.print("2. Sayı: ");
        b = scanner.nextInt();

        System.out.println("Lütfen işlem için tuşlayınız:\n1-)Toplama\n2-)Çıkarma\n3-)Çarpma\n4-)Bölme");
        use = scanner.next();

        switch (use){
            case "1":
                System.out.println("Toplam: "+(a+b));
                break;
            case "2":
                System.out.println("Çıkarma: "+(a-b));
                break;
            case "3":
                System.out.println("Çarpma: "+(a*b));
                break;
            case "4":
                if(b!=0)
                    System.out.println("Bölme: "+(a/b));
                else
                    System.out.println("Lütfen ikinci sayıyı sıfırdan farklı değer giriniz");
                break;
            default:
                System.out.println("Lütfen Doğru Tuşlayınız!");

        }
    }
}
