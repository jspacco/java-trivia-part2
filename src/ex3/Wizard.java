package ex3;

public class Wizard extends BasePlayer
{
    protected int mana;
    protected int spellPower;

    public Wizard(String name, int health, int meleeAttack, int mana, int spellPower)
    {
        super(name, health, meleeAttack);
        this.mana = mana;
        this.spellPower = spellPower;
    }

    @Override
    public String battleCry()
    {
        return "Eat my fireballs!";s
    }

    public int getMana()
    {
        return mana;
    }

    public int getSpellPower()
    {
        return spellPower;
    }

    public boolean castSpell()
    {
        if (mana >= 10) {
            mana -= 10;
            return true;
        }
        return false;
    }
}
