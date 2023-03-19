public class Main {
    public static void main(String[] args) {
        Weapons weapon=new Weapons("M416",Weapons.WeaponType.ASSAULT_RIFLE);
        weapon.setName("M716(BERIL)");
        weapon.setType(Weapons.WeaponType.ASSAULT_RIFLE);
        Boss boss = new Boss(1000, 88, weapon, "Golem");
        System.out.println(boss.printInfo());
    }
}