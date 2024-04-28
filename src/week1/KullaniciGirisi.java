package week1;

import java.util.Scanner;


public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName,password,password2;
        int select;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Kullanıcı adını giriniz : ");
        userName = scanner.nextLine();

        System.out.print("Şifreinizi giriniz : ");
        password = scanner.nextLine();

        if (userName.equals("java") && password.equals("java123")) {
            System.out.println("Giriş yaptınız!");

        }else {
            System.out.println("Bilgileriniz yanlış!");
            System.out.println("Şifrenizi sıfırlamak isterseniz 1e istemiyorsanız 2 ye basın");

            select = scanner.nextInt();
                     scanner.nextLine();

            if (select == 1){

                System.out.println("Lütfen yeni şifrenizi giriniz : ");
                password2 = scanner.nextLine();

                if (password2.equals("java123")){

                    System.out.println("şifreniz aynı olamaz");

                }else {

                    System.out.println("şifreniz oluşturldu");
                }

            }else {
                System.out.println("iyi günler dileriz");
            }

        }
    }
}

