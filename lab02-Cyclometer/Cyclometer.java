//Paige Howes
//Lab 02
//January 30, 2015
//
//Bicycle cyclometer record time (s) and number of rotations of wheel
//Find number of minutes, number of counts, distance of each trip and trips combined
//
//define the class
public class Cyclometer {
    //main method required for java
    public static void main (String [] args) {
       
        //input data
        int secsTrip1 = 480;
        int secsTrip2 = 3220;
        int countsTrip1 = 1561;
        int countsTrip2 = 9037;
       
        //intermediate variables and output data
        double wheelDiameter = 27.0,
        PI = 3.14159,
        feetPerMile = 5280,
        inchesPerFoot = 12,
        secondsPerMinute = 60;
        double distanceTrip1, distanceTrip2, totalDistance;
       
        //print number of seconds and counts
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + (countsTrip1) + " counts.");
        System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + (countsTrip2) + " counts.");
        
        //compute values for distances of each trip in miles and total distance
        distanceTrip1 = countsTrip1 * wheelDiameter * PI / inchesPerFoot / feetPerMile;
        distanceTrip2 = countsTrip2 * wheelDiameter * PI / inchesPerFoot / feetPerMile;
        totalDistance = distanceTrip1 + distanceTrip2;
        
        //print distances
        System.out.println("Trip 1 was " + distanceTrip1 + " miles");
        System.out.println("Trip 2 was " + distanceTrip2 + " miles");
        System.out.println("The total distance was " + totalDistance + " miles");
        
    } //end main method
} //end class
        
        
        