import java.util.Scanner;

public class Soru4 { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Şifrelemek istediğiniz mesajı giriniz: ");
        String mesaj = scanner.nextLine();

        System.out.print("Anahtar değerini giriniz: ");
        int anahtar = scanner.nextInt();

        String sonuc = sezarSifrele(mesaj, anahtar);
        System.out.println("Şifrelenmiş mesaj: " + sonuc);
        
        System.out.println("\n--- 2. Şifre Çözme ---");
        
        scanner.nextLine();

        System.out.print("Çözmek istediğiniz mesajı giriniz: ");
        String cozumMesaji = scanner.nextLine();

        System.out.print("Anahtar değerini giriniz: ");
        int cozumAnahtari = scanner.nextInt();

        String cozulmusSonuc = sezarCoz(cozumMesaji, cozumAnahtari);
        System.out.println("Çözülmüş mesaj: " + cozulmusSonuc);

    } 

    public static String sezarSifrele(String metin, int anahtar) {
        StringBuilder sifreliMetin = new StringBuilder();
        for(char karakter : metin.toCharArray()) {
            if(Character.isLetter(karakter)) {
                char baslangic = Character.isUpperCase(karakter) ? 'A' : 'a';

                int orijinalSira = karakter - baslangic;
                int yeniSira = (orijinalSira + anahtar) % 26;
                char yeniKarakter = (char) (baslangic + yeniSira);
                sifreliMetin.append(yeniKarakter);
            } else {
                sifreliMetin.append(karakter);
            }
        }
        return sifreliMetin.toString();
    }

    public static String sezarCoz(String metin, int anahtar){
        int tersAnahtar = 26 - (anahtar % 26);
        return sezarSifrele(metin, tersAnahtar);
    }

} 
