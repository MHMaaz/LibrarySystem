import Books.Book1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello world! Hello library!");

        //first step is planning it out

        // instantiating each book along with setting attributes
        Book1 b1 = new Book1("Paladins Watchtower", "Julius", true);
        Book1 b2 =  new Book1(1990, "Julius's Word", "Mark", true);
        Book1 b3 =  new Book1(2025, "New Year New Person", "Johnny", true);


        b2.toBorrow("Julius's Word");
        b2.toBorrow("Julius's Word"); // attempting to borrow again = fail
        // returning

        b2.toRetrieve("Julius's Word");
        b3.toRetrieve("New Year New Person");

        b1.displayInfo();
        b2.displayInfo(); // summary of each book
        b3.displayInfo();

    }
}