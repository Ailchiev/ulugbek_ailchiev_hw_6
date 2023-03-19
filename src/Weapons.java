public class Weapons {
    private String name;
    public enum WeaponType{
        PISTOL,SNIPER,ASSAULT_RIFLE
    }
    private WeaponType type;
    public Weapons(String name,WeaponType type){
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }
}
