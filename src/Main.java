import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        //Kullanıcı veri girişi
        System.out.println("Sayı Giriniz : ");
        n = inp.nextInt();

        // Kuvvetleri hesaplarken girilen sayıya kadar olanları seçmesi için for döngüsü kullanıyorum.
        for (int i = 1; i <= n ; i *= 4) {
            System.out.println("4'ün kuvvetleri : " + i);
        }
        for (int j = 1; j <= n ; j *= 5) {
            System.out.println("5'in kuvvetleri : " + j);
        }



    }
}