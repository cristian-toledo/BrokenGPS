/**Cristian Toledo
 * CSC201
 * Assigment 1 Chapter 1
 * Broken GPS
 * Due: 9-3-17
 */
import java.util.Random;

public class BrokenGPS {
    public static void main(String[] args) {
        //Assigned each variable a integer to later use in the program
        int North = 0;
        int South = 1;
        int East = 2;
        int West = 3;
        int x = 0;
        int y = 0;
        int minutes = 0;
        //Import Random class to create "rng"
        Random rng = new Random();
        //Creating a loop that will go from the beginning of time 0 to the end 60 in increments of 5
        while (minutes<60){
           int dir = rng.nextInt(4);
           //direction is then given by the rng class
           if (dir==North){
               System.out.println("North");
               y+=5;
           }
           else if (dir==South){
               System.out.println("South");
               y-=5;
           }
           else if (dir==East){
               System.out.println("East");
               x+=5;
           }
           else if (dir==West){
               System.out.println("West");
               x-=5;
           }

           minutes+=5;
           //we repeat until it has done it 12 times
        }
        System.out.println("Your Final Position in terms of (x,y) are ("+x+","+y+")");
        double travel = Math.sqrt(x*x+y*y);
        //using the distance formula we can then calculate the total distance traveled
        System.out.println("you have traveled a total of "+travel+" miles");

    }
}