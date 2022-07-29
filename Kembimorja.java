import java.util.*;
import java.text.DecimalFormat;

public class Kembimorja
{
    public static void main(String[] args)
    { 
        double shuma;
        double albanianlek, dollar, pound, euro, yen, swissfranc;
        int zgjidhja;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Following are the Choices:");
        System.out.println("Enter 1: Albanian Lek");
        System.out.println("Enter 2: US Dollars");
        System.out.println("Enter 3: UK Pounds");
        System.out.println("Enter 4: Euro");
        System.out.println("Enter 5: Japan Yen");
        System.out.println("Enter 5: Swiss Franc");

        System.out.print("\nZgjedhni valuten qe deshironi te konvertoni: ");
        zgjidhja = sc.nextInt();

        System.out.println("Shtypeni shumen qe deshironi te konvertoni: ");
        shuma = sc.nextFloat();
    }
}
