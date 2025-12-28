public class Soru5 {
    private static final int BOYUT = 5;

    public static void main(String[] args) {
        int[][] labirent = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 1, 1, 1},
                {1, 1, 1, 0, 1}
        };

        System.out.println("Labirent Çözülüyor...");
        
        int[][] cozumYolu = new int[BOYUT][BOYUT];

        if (yolBul(labirent, 0, 0, cozumYolu)) { 
            System.out.println("Çıkış yolu bulundu:");
            matrisYazdir(cozumYolu);
        } else {
            System.out.println("Çıkış yolu bulunamadı!");
        }
    }
    
    public static boolean yolBul(int[][] labirent, int x, int y, int[][] yol) {
        if (x == BOYUT - 1 && y == BOYUT - 1 && labirent[x][y] == 1) {
            yol[x][y] = 1;
            return true;
        }
        
        if (gecerliMi(labirent, x, y)) {
            yol[x][y] = 1;
            
            if (yolBul(labirent, x, y + 1, yol)) return true;
            
            if (yolBul(labirent, x + 1, y, yol)) return true;
            
            if (yolBul(labirent, x, y - 1, yol)) return true;
            
            if (yolBul(labirent, x - 1, y, yol)) return true;
            
            yol[x][y] = 0;
            return false;
        }

        return false;
    }

    public static boolean gecerliMi(int[][] labirent, int x, int y) {
        return (x >= 0 && x < BOYUT && y >= 0 && y < BOYUT && labirent[x][y] == 1);
    }

    public static void matrisYazdir(int[][] matris) {
        for (int[] satir : matris) {
            for (int hucre : satir) {
                System.out.print(hucre); 
            }
            System.out.println();
        }
    }
}
