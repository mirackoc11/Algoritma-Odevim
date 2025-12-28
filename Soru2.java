import java.util.Scanner;

public class Soru2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kaç adet üçgen sayı yazılsın (N): ");
        int n = scanner.nextInt();
        System.out.print("Üçgen Sayılar: ");
        ucgenSayiDizisiYazdir(n, 1);
        System.out.println();

        System.out.print("\nÜçgen çizimi için bir sayı girin: ");
        int boyut = scanner.nextInt();
        gorselUcgenCiz(boyut);
    }

    public static int ucgenSayiHesapla(int n) {
        if (n == 1) return 1;
        return n + ucgenSayiHesapla(n - 1);
    }

    public static void ucgenSayiDizisiYazdir(int hedef, int suanki) {
        if (suanki > hedef) return;
        System.out.print(ucgenSayiHesapla(suanki) + " ");
        ucgenSayiDizisiYazdir(hedef, suanki + 1);
    }

    public static void gorselUcgenCiz(int n) {
        int sayac = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(sayac + " ");
                sayac++;
            }
            System.out.println();
        }
    }
}
