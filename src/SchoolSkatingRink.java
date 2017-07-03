
public class SchoolSkatingRink implements SkatingRink
{
    @Override
    public Skates getSkates(Skater skater)
    {
        System.out.println(skater.getName() + " got skates");
        return new Skates();
    }

    @Override
    public void returnSkates(Skater skater, Skates skates)
    {
        System.out.println(skater.getName() + " returned skates");
    }
}
