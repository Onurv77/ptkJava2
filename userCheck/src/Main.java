import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, use, newPassword;
        Scanner scanner = new Scanner(System.in);


        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName = scanner.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        password = scanner.nextLine();

        if (userName.equals("patika") && password.equals("java"))
            System.out.println("Başarıyla giriş yapılmıştır!");
        else{
            if (!(userName.equals("patika")))
                System.out.println("Bilgileriniz Yanlış");
            else{
                System.out.println("Şifrenizi Yanlış Girdiniz," +
                    " şifrenizi sıfırlamak istiyor musunuz?\n Evet/y\n Hayır/n");
                use = scanner.nextLine();
                while (true){
                    switch (use) {
                        case "n":

                            break;
                        case "y":
                            System.out.print("Lütfen yeni şifrenizi giriniz: ");
                            newPassword = scanner.nextLine();
                            if (!(newPassword.equals(password)) && !(newPassword.equals("java")))
                                System.out.println("Şifre oluşturulmuştur.");
                            else{
                                System.out.println("Şifre oluşturulamadı lütfen başka şifre giriniz!");
                                continue;
                            }
                            break;

                        default:
                            System.out.println("Lütfen doğru tuşlayınız! (n/y)");
                            use = scanner.nextLine();
                            continue;
                    }
                    break;
                }
            }
        }

    }
}
