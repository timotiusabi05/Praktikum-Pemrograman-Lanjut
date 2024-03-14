package Zoo;

public class PantheraTigris {
    public String id;
    public String nama;
    String colour;
    String konfirmasi;
    int yearOfBirth;
    int getAge(){
        int currentYear = 2024;
        return currentYear-yearOfBirth;
    }
    int getAge(int currentYear){
        return currentYear - yearOfBirth;
    }
    String eat(){
        return "krauk";
    }
    void roar () {
        System.out.println("Roooaaar...!");
    }
}
//menulis uml (Unified Modelling Language) dengan Diagram Class

//PantheraLeo                      (Class Name)
//--------------------
// - id: String                      (Attributes/Fields)
// ~ colour: String
// ~ gender: String
// + yearOfBirth: int
//---------------------
// + roar () : String             (Operations/Methods)
// + eat() : String
// + getAge(): int
// + getAge (year : int) : int

// private = -
// package = ~
// public = +

// field kalo gada keperluan khusus jadiin private. Why? Field kan ngegambarin keadaan, jadi gaperlu diubah sama class lain.
// method kalo gada keperluan khusus jadiin public. Why? method nggambarin perilaku. Org gabisa tau keadaan kalo perilakunya ga keliatan, jd harus PUBLIC.


// Members of a class:
// - Attributes/fields
// - Operations/Methods

// dua sifat class: public, package, private
// sifat public: bisa diakses sama package lain. harus import nama package juga/akses dgn nama lengkap.
// sifat package: bisa diakses oleh file lain dalam satu package, tp kalo udh beda package gabisa.
//sifat private: hanya bisa diakses oleh satu file private tsb, meskipn satu package. Ex: kalo di pantheratigris private, si vet gbs akses methodnya.
