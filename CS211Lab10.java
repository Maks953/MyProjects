package CS211;
//Haversine Formula
/*
 * The haversine formula determines the great-circle distance between
 *  two points on a sphere given their longitudes and latitudes. 
 *  Important in navigation, it is a special case of a more general formula in spherical trigonometry, 
 *  the law of haversines, that relates the sides and angles of spherical triangles
 */
//Maksymilian Glowacki
//12/04/2022
import java.util.*;
import java.util.Arrays;

public class CS211Lab10 {
	
	private static int earthRadius = 6371;// the earths radius in kilometers
             
	public static void main(String args[]) {
            	 Scanner sc = new Scanner(System.in);
            	//double values for the fist location
            	 double latitude1 =  51.62497513;
            	 double longitude1 = -8.887028344;
            	//double values for the second location
            	 double latitude2 = 51.94026835;
            	 double longtitude2 = -10.24088642;
            	 //double values for third location
            	 double latitude3 = 52.178285;
            	 double longtitude3 = -8.911617;
            	 //double values for fourth location
            	 double latitude4 = 52.33356304;
            	 double longtitude4 = -6.463963364;
            	 //double values for fifth location
            	 double latitude5 =52.4736608 ;
            	 double longtitude5 = -8.4346524;
            	 //double values for sixth location
            	 double latitude6 = 52.86618127 ;
            	 double longtitude6 = -6.942840109;
            	 //double values for seventh location
            	 double latitude7 = 52.909722;
            	 double longtitude7 = -6.839167;
            	 
            	 double distance1 = DistanceFrom(latitude1, latitude2, longitude1, longtitude2);
            	 double distance2 = DistanceFrom(latitude1,latitude3,longitude1,longtitude3);
            	 double distance3 = DistanceFrom(latitude1,latitude4,longitude1, longtitude4);
            	 double distance4 = DistanceFrom(latitude1,latitude5,longitude1,longtitude5);
            	 double distance5 = DistanceFrom(latitude1,latitude6,longitude1,longtitude6);
            	 double distance6 = DistanceFrom(latitude1,latitude7,longitude1,longtitude7);
            	 
            	// double distance4 = DistanceFrom();
            	 
            	 //first outputs
            	 System.out.println(distance1); 
            	 
            	 System.out.println();
            	 Double [] array = new Double[] {distance1,distance2,distance3,distance4,distance5,distance6};//array to store distances
            	 
            	 for(int i = 0; i<array.length; i++) { //for loop to check for shortest distance
            		 if(array[i]<array[0]) {
            			 double shortestDistance = array[i];
            			System.out.println("Shortest Distance: " +shortestDistance+"Km");//secound output
            		 }
            	 }
             }
             //The distance method to get between two locations
           public static double DistanceFrom(double latitudeA, double latitudeB, double longtitudeA, double longtitudeB) {
        	   double Pi = 3.14; //pi value
        	   double e = Pi/180; //pi / 180
        	   double Formula = 0.5 - Math.cos((latitudeB-latitudeA)*e)/2 + Math.cos(latitudeA*e)*Math.cos(latitudeB*e) * (1-Math.cos((longtitudeB-longtitudeA)*e)) / 2;
        	   double d = 0;
        	   d = 2 * earthRadius * Math.asin(Math.sqrt(Formula)); //result in kilometers
        	   
	           return d;
             }
}
