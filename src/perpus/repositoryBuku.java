package perpus;

public class repositoryBuku {
    private String[][] kategoriTeknologi = {
            {"Keamanan Jaringan: Konsep dan Implementasi", "480", "9786020297488", "Budiono Darsono", "Penerbit Andi", "2016"},
            {"Pemrograman Web Modern dengan HTML5 dan CSS3", "350", "9786027179636", "Rifki Sadikin", "Penerbit Media Kita", "2017"},
            {"Algorithms to Live By: The Computer Science of Human Decisions", "368", "9781627790369", "Brian Christian, Tom Griffiths", "Henry Holt and Co.", "2016"},
            {"The Everything Store: Jeff Bezos and the Age of Amazon", "392", "9780316219266", "Brad Stone", "Little, Brown and Company", "2013"},
            {"Big Data: Konsep dan Implementasi", "450", "9789792915631", "Ary Setijadi Prihatmanto", "Penerbit Elex Media Komputindo", "2018"},
    };
    private String[][] kategoriFilsafat = {
            {"Filosofi Teras", "298", "582312136", "Henry Manampiring", "Penerbit Buku Kompas", "2023"},
            {"Musa dan Monoteisme", "240", "9786236699614", "Sigmund Freud", "Ircisod", "2023"},
            {"The Philosophy of the Moon", "272", "9786231630346", "Carrin Fu", "Transmedia Pustaka", "2024"},
            {"Seni Berperang Sun Tzu", "192", "9786020400624", "Amber Books", "Elex Media Komputindo", "2017"},
            {"Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future", "400", "9780062301253", "Ashlee Vance", "Ecco", "2015"}
    };

    private String[][] kategoriSejarah = {
            {"Sejarah Global: Menelaah Dunia Dalam 6.000 Tahun", "668", "9789792546370", "L. S. Stavrianos", "KPG", "2002"},
            {"Sejarah Dunia: Antara Bangkit dan Runtuhnya Peradaban", "368", "9786026703664", "Mochtar Lutfi", "Buku Kompas", "2014"},
            {"Sejarah Jepang", "224", "9786020052857", "Catharina Raudvere", "Bentang Pustaka", "2013"},
            {"Indonesia: Dari Desa ke Desa", "514", "9789792203897", "Clifford Geertz", "Serambi", "2009"},
            {"Sejarah Indonesia Modern: 1200-2008", "366", "9789792903446", "Adrian Vickers", "KPG", "2008"},
    };

    private String[][] kategoriAgama = {
            {"Mistik Sufi: Renungan Puisi Rumi", "220", "9786020304983", "Jalal al-Din Rumi", "Pustaka Al-Kautsar", "2014"},
            {"Hadits Sahih Bukhari: Panduan Hidup Berdasarkan Ajaran Nabi Muhammad SAW", "400", "9786020309186", "Imam Bukhari", "Pustaka Ibnu Katsir", "2019"},
            {"Injil Lukas: Kisah Yesus dan Ajaran-Nya", "200", "9789792813052", "Anonim", "Gandum Mas", "2016"},
            {"Bhagavad Gita: Pesan Sang Kusir", "250", "9789792799561", "W. D. Perry", "Pustaka Nusantara", "2007"},
            {"Tao Te Ching: Ajaran Klasik Lao Zi tentang Kebijaksanaan", "180", "9786020309995", "Lao Zi", "Narasi", "2018"},
    };
    private String[][] kategoriPsikologi = {
            {"Mindset: Cara Berpikir yang Membentuk Hidup, Karier, dan Cinta Anda", "320", "9789792251971", "Carol S. Dweck", "KPG", "2007"},
            {"Psikologi Eksperimental", "416", "9789796929063", "Barry H. Kantowitz, Henry L. Roediger III, David G. Elmes", "Salemba Humanika", "2017"},
            {"Psikologi Evolusioner", "320", "9786020410887", "David M. Buss", "Bhuana Ilmu Populer", "2016"},
            {"Blink: Kekuatan Berpikir Tanpa Berpikir", "296", "9789794335235", "Malcolm Gladwell", "Bentang Pustaka", "2015"},
            {"Perilaku Tidak Rasional: Kekuatan Tersembunyi yang Membentuk Keputusan Kita", "336", "9786026318094", "Dan Ariely", "Noura Books", "2013"},
    };
    private String[][] kategoriPolitik = {
            {"G30S/PKI: Sarinah Tak Lagi Terbakar", "436", "9786020248028", "John Roosa", "Yayasan Pustaka Obor Indonesia", "2008"},
            {"Hari Kebangkitan Nasional: Sebuah Memoar", "480", "9786020306520", "Soedjatmoko", "Kepustakaan Populer Gramedia", "2016"},
            {"Indonesia Etc.: Exploring the Improbable Nation", "416", "9786020301099", "Elizabeth Pisani", "Kepustakaan Populer Gramedia", "2014"},
            {"Negara Kebudayaan: Kritik atas Budaya Modern", "240", "9789792231997", "Nurcholish Madjid", "Paramadina", "2000"},
            {"Reformasi Politik dan Konstitusi: Era Baru Indonesia", "352", "9789794210111", "Jimly Asshiddiqie", "Kencana", "2008"},
    };
    private String[][] kategoriFiksi = {
            {"Yang Fana adalah Waktu", "152", "9786020383057", "Sapardi Djoko Damono", "Gramedia Pustaka Utama", "2022", },
            {"Pasutri Gaje", "232", "9786026714923", "IyoniAe", "Falcon Publishing", "2024"},
            {"Rumah untuk Alie", "300", "9786230979613", "Lenn Liu", "Tekad", "2024"},
            {"Asavella", "372", "9786237191346", "Alfida Nurhayati Adiana", "Moka Media", "2024"},
            {"Unit 183, I Love You", "332", "9789797946630", "Chikita", "Mediakita", "2022"}
    };

    public String[][] getTeknologi() {
        return kategoriTeknologi;
    }

    public String[][] getFilsafat() {
        return kategoriFilsafat;
    }

    public String[][] getSejarah() {
        return kategoriSejarah;
    }


    public String[][] getAgama() {
        return kategoriAgama;
    }

    public String[][] getPsikologi() {
        return kategoriPsikologi;
    }

    public String[][] getPolitik() {
        return kategoriPolitik;
    }

    public String[][] getFiksi() {
        return kategoriFiksi;
    }

    public void detailBuku(String[][] listBuku) {
        for (int i = 0; i < 5; i++) {
            System.out.printf("\n%-13s: %s\n", "Judul", listBuku[i][0]);
            System.out.printf("%-13s: %s\n", "Halaman", listBuku[i][1]);
            System.out.printf("%-13s: %s\n", "ISBN", listBuku[i][2]);
            System.out.printf("%-13s: %s\n", "Penulis", listBuku[i][3]);
            System.out.printf("%-13s: %s\n", "Penerbit", listBuku[i][4]);
            System.out.printf("%-13s: %s\n", "Tahun Terbit", listBuku[i][5]);
        }
    }

    public int banyakBuku(String[][] listBuku) {
        return listBuku.length;
    }
}

