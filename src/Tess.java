public class Tess {
    public static String[]datasiswa(String[] nama) {
        String[] siswa = new String[3];
        siswa[0] = nama[0];
        siswa[1] = nama[1];
        siswa[2] = nama [2];
        return nama;
    }
    public static void main(String[] args) {
        String[] nama = {"abi" , "kaok" , "kaoka"};
        datasiswa(nama);

        for (int i = 0; i < datasiswa(nama).length; i++) {
            System.out.println(datasiswa(nama)[i]);
        }
    }
}
