package ex1;

import java.util.HashMap;
import java.util.Map;

public class WeaponTracker
{
    private Map<String, Integer> weapons = new HashMap<>();
    
    public void addWeapon(String weapon, int power)
    {
        weapons.put(weapon, power);
    }

    public int getPower(String weapon)
    {
        return weapons.get(weapon);
    }

    public int getPower2(String weapon)
    {
        return weapons.getOrDefault(weapon, -1);
    }
}
