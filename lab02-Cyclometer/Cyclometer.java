//Will Gilbert
//February 5, 2016
//lab 2
//Cyclometer lab
//
//  first compile the program
//      javac Cyclometer.java 
//  run the program
//      java Cyclometer//
//  define a class
public class Cyclometer{
// add main method
public static void main(String[] args){
    int secsTrip1=500; //amount of seconds for trip 1
    int secsTrip2=5000; //amount of seconds for trip 2
    int countsTrip1=2000; //number of counts for trip 1
    int countsTrip2=9000; //number of counts for trip 2
    double wheelDiameter=27.0, //diameter of bicycle wheel
    PI=3.14159, //variable for the number PI
    feetPerMile=5280, //variable for the amount of feet there are in a mile
    inchesPerFoot=12, //variable for the how many inches there are in a foot
    secondsPerMinute=60; //variable for how seconds there are in a minute
    double distanceTrip1, distanceTrip2, totalDistance; //three variables for distance
    System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1 +" counts."); //prints out how many minutes and counts there were in Trip 1
    System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2 +" counts."); //prints out how many minutes and counts there were in Trip 2
    distanceTrip1=countsTrip1*wheelDiameter*PI; //calculates the distance in trip 1 
    distanceTrip1/=inchesPerFoot*feetPerMile; //calculates the distance in trip 1
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //calculates the distance in trip 2
    totalDistance=distanceTrip1+distanceTrip2; //calculates the total distance
    System.out.println("Trip 1 was "+distanceTrip1+" miles."); 
    System.out.println("Trip 2 was "+distanceTrip2+" miles."); 
    System.out.println("The total distance was "+totalDistance+" miles."); 
} //end of main method
} //end of class