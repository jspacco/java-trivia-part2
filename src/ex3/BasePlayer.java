package ex3;

public abstract class BasePlayer 
{
    protected String name;
    protected int health;
    protected int meleeAttack;

    public BasePlayer(String name, int health, int meleeAttack)
    {
        this.name = name;
        this.health = health;
        this.meleeAttack = meleeAttack;
    }

    public String getName()
    {
        return name;
    }

    public int getHealth()
    {
        return health;
    }

    public int getMeleeAttack()
    {
        return meleeAttack;
    }

    public abstract String battleCry();
}
