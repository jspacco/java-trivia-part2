package ex1;

import java.util.Random;

import org.junit.Test;

public class WeaponTest
{
    @Test
    public void testNPE() throws Exception
    {
        WeaponTracker tracker = new WeaponTracker();
        tracker.addWeapon("Sword", 10);
        tracker.addWeapon("Axe", 15);
        tracker.addWeapon("Bow", 12);
        tracker.addWeapon("Spear", 8);

        // this throw a NPE! But how?
        int axePower = tracker.getPower("axe");
    }

    @Test
    public void test2() throws Exception
    {
        WeaponTracker tracker = new WeaponTracker();
        tracker.addWeapon("Sword", 10);
        tracker.addWeapon("Axe", 15);
        tracker.addWeapon("Bow", 12);
        tracker.addWeapon("Spear", 8);

        // th source of the error is the getPower2() method
        int axePower = tracker.getPower2("axe");

        // what if we forget to check the return value?
        Random random = new Random(1L);

        int numSuccesses = 0;
        for (int i = 0; i < 10; i++)
        {
            // But we do not see the error until here
            int attack = random.nextInt(axePower);
            if (attack > 5)
            {
                numSuccesses++;
            }
        }

        System.out.println("Number of successes: " + numSuccesses);
        


    }
}
