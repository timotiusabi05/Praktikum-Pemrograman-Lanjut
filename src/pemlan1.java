class PantheraTigris {
    String id; //field, implementing attribute
    String colour;
    int yearOfBirth;
    String eat(){
        return "krauk";
    }
    void roar (){
        System.out.println("roar");
    }
    //idealnya dibuat konsisten, mending yg atas aja (STRING)
}
//^^ diatas ni buat ngasi spesifikasi dan behaviior apa saja yg bs ditampilkan = field
public class pemlan1 {
    public static void main(String[] args) {
        int x;
        x = 13;
        //kalo class sbenernya sama aja kek  declare variabel ^^

        PantheraTigris tiger1, tiger2, tiger3;
        // ^^ buat declare si object (tiger1, tiger2) dri class mana. tiger1, tiger2 itu referensi object
        tiger1 = new PantheraTigris();
        tiger1.id = "t1";
        tiger1.colour = "coklat";
        tiger1.yearOfBirth = 2019;
        //new PantheraTigris () ini buat bikin object
        tiger2 = new PantheraTigris();
        tiger2.id = "t2";
        tiger2.colour = "putih";
        tiger2.yearOfBirth = 2021;
        tiger3 = new PantheraTigris();
        tiger3.id = "t3";
        tiger3.colour = "putih";
        tiger3.yearOfBirth = 2021;

        System.out.println("Spesifikasi harimau 1");
        System.out.println("ID: " + tiger1.id);
        System.out.println("Warna: " + tiger1.colour);
        System.out.println("Tahun lahir: " + tiger1.yearOfBirth);
        System.out.println("Harimau makan: " + tiger1.eat());
        tiger1.roar();
        //si eat ditaro dlm sout karena dia string, jd harus didalem
        //kalo si roar harus diluar soalnya void, dia tipe dan gabisa dikonversi jdi string
        //string concatenation = mengabungkan string -> "dsjkdj" + "dkdsjkj"
        // di java atribut jdi field, operation jdi method
    }
}
//Notes - SI C 12.02.2024
//
//        Objek (Object):
//        - entitas (entity)
//        - individu (individual)
//        - instan (instance) -> contoh nyata sesuatu
//
//        Contoh:
//        - Saya
//        - Laptop saya yang sedang saya operasikan
//        - Anda masing-masing
//        - Kursi yang sedang saya duduki
//
//        An object has
//        - Attributes, or properties -> each has a pair of name and value
//        - Operations, or capabilities -> usually in the form of verbs
//        - Well defined boundaries
//
//        Objek:
//        sebuah entitas/individu/instan yang memiliki atribut dan operasi serta memiliki batasan yang terdefinisi dengan jelas.
//
//        Kelas:
//        Deskripsi atau abstraksi objek-objek yang memiliki kesamaan (atau yang memiliki/berasal dari tipe yang sama)
//        Class:
//        description or abstraction of objects of the same type