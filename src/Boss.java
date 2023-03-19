public class Boss extends GameEntity{
    private Weapons weapon;
    public Boss(){
        super();
    }
    public Boss(int health, int damage, Weapons weapon, String ability) {
        super();
        setHealth(health);
        setDamage(damage);
        setAbility(ability);
        this.weapon = weapon;
    }
    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return "Boss health: "+ getHealth()+", damage: "+ getDamage() + ", ability: "+getAbility()+
                ", weapon type: "+getWeapon().getType()+", weapon name: " + getWeapon().getName()+ ".";
    }
}
