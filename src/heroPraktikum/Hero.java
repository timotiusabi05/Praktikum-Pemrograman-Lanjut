package heroPraktikum;
import java.util.Scanner;

public class Hero {

    private String name;
    private double hp;
    private double attack;
    private double defense;

    public Hero() {
    }
    public Hero(String name, double hp, double attack, double defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }
    public static void buatHero1(Hero hero, Scanner scan) {
        System.out.println("Player 1: Masukkan data hero Anda!");
        System.out.println("Untuk bagian angka, masukkan angka antara 0 hingga 500");
        System.out.print("Nama Hero: ");
        String name = scan.nextLine();
        hero.setName(name);

        double hp1;
        do {
            System.out.print("Health Point: ");
            hp1 = scan.nextDouble();
            if (hp1 < 0 || hp1 > 500) {
                System.out.println("Input tidak valid. Masukkan angka antara 0 dan 500.");
            }
        } while (hp1 < 0 || hp1 > 500);
        hero.setHp(hp1);

        double attack1;
        do {
            System.out.print("Attack: ");
            attack1 = scan.nextDouble();
            if (attack1 < 0 || attack1 > 500) {
                System.out.println("Input tidak valid. Masukkan angka antara 0 dan 500.");
            }
        } while (attack1 < 0 || attack1 > 500);
        hero.setAttack(attack1);

        double defense1;
        do {
            System.out.print("Defense: ");
            defense1 = scan.nextDouble();
            if (defense1 < 0 || defense1 > 500) {
                System.out.println("Input tidak valid. Masukkan angka antara 0 dan 500.");
            }
        } while (defense1 < 0 || defense1 > 500);
        hero.setDefense(defense1);
        scan.nextLine();
    }
    public static Hero buatHero2(Scanner scan) {
        System.out.println("Player 2: Masukkan data hero Anda!");
        System.out.println("Untuk bagian angka, masukkan angka antara 0 hingga 500");
        System.out.print("Nama Hero: ");
        String name2 = scan.nextLine();

        double hp2;
        do {
            System.out.print("Health Point: ");
            hp2 = scan.nextDouble();
            if (hp2 < 0 || hp2 > 500) {
                System.out.println("Input tidak valid. Masukkan angka antara 0 dan 500.");
            }
        } while (hp2 < 0 || hp2 > 500);

        double attack2;
        do {
            System.out.print("Attack: ");
            attack2 = scan.nextDouble();
            if (attack2 < 0 || attack2 > 500) {
                System.out.println("Input tidak valid. Masukkan angka antara 0 dan 500.");
            }
        } while (attack2 < 0 || attack2 > 500);

        double defense2;
        do {
            System.out.print("Defense: ");
            defense2 = scan.nextDouble();
            if (defense2 < 0 || defense2 > 500) {
                System.out.println("Input tidak valid. Masukkan angka antara 0 dan 500.");
            }
        } while (defense2 < 0 || defense2 > 500);

        scan.nextLine();

        return new Hero(name2, hp2, attack2, defense2);
    }
    public void attackHero2(Hero hero1, Hero hero2) {
        double damage = Math.max(hero1.getAttack() - hero2.getDefense(), 0);
        System.out.println(hero1.getName() + " menyerang " + hero2.getName());
        System.out.println(hero1.getName() + " menyerang sebesar " + hero1.getAttack());
        System.out.println(hero2.getName() + " memiliki pertahanan sebesar " + hero2.getDefense());
        hero2.receiveDamageHero2(damage, hero2);
    }

    public void attackHero1(Hero hero1, Hero hero2) {
        double damage = Math.max(hero2.getAttack() - hero1.getDefense(), 0);
        System.out.println(hero2.getName() + " menyerang " + hero1.getName());
        System.out.println(hero2.getName() + " menyerang sebesar " + hero2.getAttack());
        System.out.println(hero1.getName() + " memiliki pertahanan sebesar " + hero1.getDefense());
        hero1.receiveDamageHero1(damage, hero1);
    }
    public void receiveDamageHero1(double damage, Hero hero1) {
        double damageMasuk = Math.max(damage, 0);
        double hpKurang = hero1.getHp() - damageMasuk;
        if (hpKurang < 0) {
            hpKurang = 0;
        }
        hero1.setHp(hpKurang);
        System.out.println(hero1.getName() + " menerima serangan sebesar " + damageMasuk);
        System.out.println("Health " + hero1.getName() + " saat ini " + hero1.getHp());
        System.out.println();
        hero1.setDefense(Math.max(hero1.getDefense() - 5, 0));
    }

    public void receiveDamageHero2(double damage, Hero hero2) {
        double damageMasuk = Math.max(damage, 0);
        double hpKurang = hero2.getHp() - damageMasuk;
        if (hpKurang < 0) {
            hpKurang = 0;
        }
        hero2.setHp(hpKurang);
        System.out.println(hero2.getName() + " menerima serangan sebesar " + damageMasuk);
        System.out.println("Health " + hero2.getName() + " saat ini " + hero2.getHp());
        System.out.println();
        hero2.setDefense(Math.max(hero2.getDefense() - 5, 0));
    }
}
