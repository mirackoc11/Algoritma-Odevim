public class Soru3 {

    public static void main(String[] args) {
        System.out.println("--- Gezegen Bob Geçerli İsimleri ---");
        gecerliIsimleriBul();
    }
    
    public static void gecerliIsimleriBul() {
        char[] alfabe = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int sayac = 1;
        
        for (char c1 : alfabe) {
            for (char c2 : alfabe) {
                for (char c3 : alfabe) {
                    
                    if (c1 != c3) continue;
                    
                    if (!formatUygunMu(c1, c2, c3)) continue;
                    
                    int asciiToplam = (int)c1 + (int)c2 + (int)c3;
                    if (asalMi(asciiToplam)) {
                        System.out.printf("%d. %c%c%c (Toplam: %d)\n", sayac++, c1, c2, c3, asciiToplam);
                    }
                }
            }
        }
    }

    public static boolean formatUygunMu(char c1, char c2, char c3) {
        boolean c1Unlu = unluMu(c1);
        boolean c2Unlu = unluMu(c2);
        boolean c3Unlu = unluMu(c3);
        
        if (c1Unlu && !c2Unlu && c3Unlu) return true;
        if (!c1Unlu && c2Unlu && !c3Unlu) return true;

        return false;
    }

    public static boolean unluMu(char c) {
        return "aeiou".indexOf(c) != -1; 
    }

    public static boolean asalMi(int sayi) {
        if (sayi < 2) return false;
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) return false;
        }
        return true;
    }
}
