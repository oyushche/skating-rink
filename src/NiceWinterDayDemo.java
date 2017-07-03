import java.util.Random;

/**
 * Task -> https://youtu.be/OwSGT0NF8og
 * Answer -> https://youtu.be/ZxXlb41UQtA
 */
public class NiceWinterDayDemo
{

    public static void main(String[] args) throws Exception
    {
        System.out.println("Good Morning everyone we are opened!");

        SkatingRink skatingRink = new SchoolSkatingRink();

        Random random = new Random();

        for (int i = 0; i < 10; i++)
        {
            Skater skater = new Skater("Skater-" + i);

            new Thread(() -> skating(skatingRink, skater, random.nextInt(2000))).start();

            sleep(random.nextInt(1000));

        }
    }

    private static void skating(SkatingRink skatingRink, Skater skater, int timeout)
    {
        Skates skates = skatingRink.getSkates(skater);
        sleep(timeout);
        skatingRink.returnSkates(skater, skates);
    }

    private static void sleep(int timeout)
    {
        try
        {
            Thread.sleep(timeout);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
