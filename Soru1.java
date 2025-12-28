import java.util.Random;
import java.util.Arrays;

public class Soru1 {
    
    private static final int AY_SAYISI = 12;

    public static void main(String[] args) {
        int[] cirolar = veriOlustur();

        System.out.println("--- Aylık Cirolar ---");
        System.out.println(Arrays.toString(cirolar));

        yatayGrafikCiz(cirolar);
        dikeyGrafikCiz(cirolar);
    }
    
    public static int[] veriOlustur() {
        Random rnd = new Random();
        int[] dizi = new int[AY_SAYISI];
        for (int i = 0; i < AY_SAYISI; i++) {
            dizi[i] = rnd.nextInt(10) + 1;
        }
        return dizi;
    }
    
    public static void yatayGrafikCiz(int[] veriler) {
        System.out.println("\n--- Yatay Grafik ---");
        for (int i = 0; i < veriler.length; i++) {
            System.out.printf("%2d.: ", (i + 1));
            for (int j = 0; j < veriler[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void dikeyGrafikCiz(int[] veriler) {
        System.out.println("\n--- Dikey Grafik ---");
        int maxDeger = 0;
        for (int v : veriler) {
            if (v > maxDeger) maxDeger = v;
        }
        
        for (int i = maxDeger; i > 0; i--) {
            for (int j = 0; j < veriler.length; j++) {
                if (veriler[j] >= i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        
        for (int i = 1; i <= veriler.length; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
    }
}
