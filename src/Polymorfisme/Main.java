package Polymorfisme;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Selamat datang di Toko Kue Timothy Bakery!%nList Menu Timothy Bakery:%n");
        Kue[] MenuKue = new Kue[20];

        MenuKue[0] = new KuePesanan("Basque Cheesecake", 50000, 2);
        MenuKue[1] = new KueJadi("Chocolate Shortcake", 25000, 5);
        MenuKue[2] = new KuePesanan("Matchamisu", 35000, 2);
        MenuKue[3] = new KueJadi("Butter Croissant", 27500, 10);
        MenuKue[4] = new KuePesanan("Strawberry Cromboloni", 45000, 3);
        MenuKue[5] = new KueJadi("Churros", 12500, 20);
        MenuKue[6] = new KuePesanan("Mille Crepe", 40000, 2);
        MenuKue[7] = new KueJadi("Cinnamon Roll", 30000, 7);
        MenuKue[8] = new KuePesanan("Eclair", 26000, 3);
        MenuKue[9] = new KueJadi("Baklava", 90000, 15);
        MenuKue[10] = new KuePesanan("Creampuff", 25000, 4);
        MenuKue[11] = new KueJadi("Lemon Tart", 35000, 12);
        MenuKue[12] = new KuePesanan("Chocolate Tiramisu", 35000, 3);
        MenuKue[13] = new KueJadi("Panini", 50000, 4);
        MenuKue[14] = new KuePesanan("Apple Pie", 12000, 1);
        MenuKue[15] = new KueJadi("Macaron", 5000, 37);
        MenuKue[16] = new KuePesanan("Muffin", 15000, 3);
        MenuKue[17] = new KueJadi("Banana Split", 30000, 21);
        MenuKue[18] = new KuePesanan("Fruit Tart", 60000, 1);
        MenuKue[19] = new KueJadi("Danish", 20000, 4);

        for (Kue kue : MenuKue) {
            System.out.println(kue);
        }

        double totalHargaMenu = 0;
        for (Kue kue : MenuKue) {
            totalHargaMenu += kue.hitungHarga();
        }
        System.out.printf("Total Harga Menu Timothy Bakery\t: Rp%,.2f%n%n", totalHargaMenu);


        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        for (Kue value : MenuKue) {
            if (value instanceof KueJadi) {
                KueJadi kueJadi = (KueJadi) value;
                totalHargaJadi += kueJadi.hitungHarga();
                totalJumlahJadi += kueJadi.getJumlah();
            }
        }
        System.out.printf("Total Harga Semua Kue Jadi\t: Rp%,.2f%n", totalHargaJadi);
        System.out.printf("Total Jumlah Semua Kue Jadi\t: %,.2f%n%n", totalJumlahJadi);

        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        for (Kue kue : MenuKue) {
            if (kue instanceof KuePesanan) {
                KuePesanan kuePesanan = (KuePesanan) kue;
                totalHargaPesanan += kuePesanan.hitungHarga();
                totalBeratPesanan += kuePesanan.getBerat();
            }
        }
        System.out.printf("Total Harga Semua Kue Pesanan\t: Rp%,.2f%n", totalHargaPesanan);
        System.out.printf("Total Berat Semua Kue Pesanan\t: %.2f kg%n%n", totalBeratPesanan);


        double hargaMaksimum = MenuKue[0].hitungHarga();
        Kue hargaTermahal = null;
        for (int i = 1; i < MenuKue.length; i++) {
            if (MenuKue[i].hitungHarga() > hargaMaksimum) {
                hargaMaksimum = MenuKue[i].hitungHarga();
                hargaTermahal = MenuKue[i];
            }
        }
        System.out.printf("Kue dengan harga termahal di Timothy Bakery adalah:%n%s%n", hargaTermahal);

    }

}