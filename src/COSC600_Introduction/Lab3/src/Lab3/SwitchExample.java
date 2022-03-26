package Lab3;

import java.util.Locale;
import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        char city;
        char hotel;
        double costHotel = 0;
        System.out.print("Choose Saskatoon(S) or Regina(R): ");
        city= scanner.next().charAt(0);

        System.out.print("Choose TravelLogde(T), Super8(S) or Comfort Inn(C): ");
        hotel = scanner.nextLine().charAt(0);
        //           Regina	   Saskatoon
        // TravelLodge	89	    99
        // Super8	    69	    75
        // Comfort Inn	63	    68


        switch(hotel){
            case 'S': case 's':
                System.out.println("At Saskatoon");
            {
                switch(hotel){
                    case 'T': case 't':
                        System.out.println("Travellodge");
                        costHotel=99;
                        break;
                    case 'S': case 's':
                        System.out.println("Super 8");
                        costHotel=75;
                        break;
                    case 'C': case 'c':
                        System.out.println("Comfort Inn");
                        costHotel=68;
                        break;
                    default:
                        System.out.println("Invalid Hotel");
                }
            }

            case 'R': case 'r':
                System.out.println("At Regina");
            {
                switch(hotel){
                    case 'T': case 't':
                        System.out.println("Travellodge");
                        costHotel=89;
                        break;
                    case 'S': case 's':
                        System.out.println("Super 8");
                        costHotel=69;
                        break;
                    case 'C': case 'c':
                        System.out.println("Comfort Inn");
                        costHotel=63;
                        break;
                    default:
                        System.out.println("Invalid Hotel");
                }
            }
            default:
                System.out.println("Invalid City");

        }
        if(costHotel>0)
            System.out.println("Your Cost is " + costHotel);
        else
            System.out.println("Invalid input");

    }
}
