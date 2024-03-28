package heroPraktikum;
import java.util.Scanner;

public class mainHero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Permainan Adu Hero");
        System.out.println("=====================================");
        Hero hero1 = new Hero();
        Hero.buatHero1(hero1, scan);

        Hero hero2 = Hero.buatHero2(scan);

        int round = 1;
        while (hero1.getHp() > 0 && hero2.getHp() > 0) {
            System.out.println("Ronde " + round++);
            hero1.attackHero2(hero1, hero2);
            if (hero2.getHp() <= 0) {
                System.out.println("=====================================");
                System.out.println(hero2.getName() + " mengakui kekalahannya!");
                System.out.println(hero1.getName() + " adalah pemenangnya!");
                break;
            }
            System.out.println("Ronde " + round++);
            hero2.attackHero1(hero1, hero2);
            if (hero1.getHp() <= 0) {
                System.out.println("=====================================");
                System.out.println(hero1.getName() + " mengakui kekalahannya!");
                System.out.println(hero2.getName() + " adalah pemenangnya!");
                break;
            }
        }
    }
}
