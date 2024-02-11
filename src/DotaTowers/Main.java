package DotaTowers;

public class Main {
    public static void main(String[] args) {
        System.out.println("Здоровье существ по умолчанию:\n  У героя - 750hp\n  У крипа-мечника - 300hp\n  У крипа-мага - 200hp\n");
        Hero hero = new Hero();
        MeleeCreep meleeCreep = new MeleeCreep();
        MageCreep mageCreep = new MageCreep();

        Tower towerLevel1 = new TowerLevel1();
        Tower towerLevel2 = new TowerLevel2();
        Tower towerLevel3 = new TowerLevel3();
        Tower towerLevel4 = new TowerLevel4();

//        System.out.println("Башня 3 уровня + глиф, крип-мечник + глиф");
//        towerLevel3.activateGlyph();
//        meleeCreep.activateGlyph();
//        towerLevel3.attack(meleeCreep);
//        System.out.println("HP крипа-мечника после атаки: " + meleeCreep.getHp() + "\n");
//
        System.out.println("Башня 4 уровня, крип-маг");
        towerLevel4.attack(mageCreep);
        System.out.println("HP крипа-мага после атаки: " + mageCreep.getHp() + "\n");
//
//        System.out.println("Башня 1 уровня + глиф, крип-мечник");
//        towerLevel1.activateGlyph();
//        towerLevel1.attack(meleeCreep);
//        System.out.println("HP крипа-мечника после атаки: " + meleeCreep.getHp() + "\n");
//
//        System.out.println("Башня 2 уровня, герой");
//        towerLevel2.attack(hero);
//        System.out.println("HP героя после атаки: " + hero.getHp() + "\n");
    }
}
