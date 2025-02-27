/*
 * Find Distance by Donovan Acosta
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class FindDistance {
    
    //method calculates the distance between 2 points
    public static double getDistance(double x1, double y1, double x2, double y2){
        //calculating the x and y position and squaring them
        double xDelta = Math.pow((x2 - x1), 2);
        double yDelta = Math.pow((y2 - y1), 2);
        //returns the result of squaring the sum of the squared values
        return Math.sqrt(xDelta + yDelta);
    }

    //method classifies the distance found in the getDistance Method
    public static String classifyDistance(double distance){
        if(distance < 5){
            return "Short";
        }
        else if(distance > 5 && distance < 15){
            return "Medium";
        }
        else{
            return "Long";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, x2, y1, y2, distance;
        //decimal format for 2 points after decimal
        DecimalFormat df = new DecimalFormat("#.##");

        //user input
        System.out.println("Please enter the x and y values for the first point.\nx:");
        x1 = input.nextDouble();
        System.err.println("y:");
        y1 = input.nextDouble();
        System.out.println("Please enter the x and y values for the second point.\nx:");
        x2 = input.nextDouble();
        System.err.println("y:");
        y2 = input.nextDouble();
        input.close();
        
        distance = getDistance(x1,y1,x2,y2);

        //printing results
        System.err.println("The distance between the two points is " + df.format(distance));
        System.err.println("Classification: " + classifyDistance(distance));
    }
    
}
