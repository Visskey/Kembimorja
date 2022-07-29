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
        
        switch (zgjidhja)
        {
            case 1:  // Albanian Lek
                dollar = shuma * 0.0088;
                System.out.println(shuma + " Albanian Lek = " + f.format(dollar) + " US Dollar");

                pound = shuma * 0.0073;
                System.out.println(shuma + " Albanian Lek = " + f.format(pound) + " Pound");

                euro = shuma * 0.0086;
                System.out.println(shuma + " Albanian Lek = " + f.format(euro) + " Euro");

                yen = shuma * 1.18;
                System.out.println(shuma + " Albanian Lek = " + f.format(yen) + " Yen");

                swissfranc = shuma * 0.0084;
                System.out.println(shuma + " Albanian Lek = " + f.format(swissfranc) + " Swiss Franc");
                break;
                
            case 2:  // Dollar Conversion
                albanianlek = shuma * 114.15;
                System.out.println(shuma + " Dollar = " + f.format(albanianlek) + " Albanian Lek");

                pound = shuma * 0.83;
                System.out.println(shuma + " Dollar = " + f.format(pound) + " Pound");

                euro = shuma * 0.98;
                System.out.println(shuma + " Dollar = " + f.format(euro) + " Euro");

                yen = shuma * 134.29;
                System.out.println(shuma + " Dollar = " + f.format(yen) + " Yen");

                swissfranc = shuma * 0.96;
                System.out.println(shuma + " Dollar = " + f.format(swissfranc) + " Swiss Franc");
                break;
                
                default:
                System.out.println("Invalid Input");
        }
    }
}
