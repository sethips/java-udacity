import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LargestCountries
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String filename = "population.txt";
        File inputFile = new File(filename);
        Scanner in = new Scanner(inputFile);

        String country = in.next();
        String largestCountry = country;
        double population = in.nextDouble();
        double largest = population;
        // HINT: What else do you need to remember?
        // What variable(s) should you add so you can
        // print the population and the country name at the end?
        while (in.hasNext())
        {
            country = in.next();
            population = in.nextDouble();
            if (population > largest)
            {
                largestCountry = country;
                largest = population;
            }
        }
        System.out.println("The country with the largest population is " + largestCountry);
        System.out.println("The largest population is " + largest);
    }
}
