package ex3;

public class Warrior extends BasePlayer
{
    protected int berserkerRage;

    public Warrior(String name, int health, int meleeAttack, int berserkerRage)
    {
        super(name, health, meleeAttack);
        this.berserkerRage = berserkerRage;
    }

    @Override
    public String battleCry()
    {
        return "For the Alliance!";
    }

    public boolean rage()
    {
        if (berserkerRage >= 10) {
            berserkerRage -= 10;
            
            return true;
        }
        // you can't go into a rage if you don't have enough rage
        return false;
    }

}
