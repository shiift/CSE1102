/*
Lab 02: Debugging a Program in Eclipse
CSE1102 Spring 2013
William S. Dickson
1/30/2013
TA: Samir Elsayed
Section: 003L
Instructor: Jeffrey A. Meunier
 */
import java.util.Scanner;


public class Balloon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Please enter the start time: ");
		double tStart = sc.nextDouble();
		System.out.printf("Please enter the end time: ");
		double tEnd = sc.nextDouble();
		System.out.printf("Please sample interval: ");
		double sampInt = sc.nextDouble();
		for(double t = tStart; t <= tEnd; t += sampInt) {
			double alt = altitude(t);
			double vel = velocity(t) / 3600;
			System.out.println(t + "\t" + alt + "\t" + vel);
		}
		sc.close();
	}
	public static double altitude(double t) {
		double alt = -0.12 * Math.pow(t, 4) + 12 * Math.pow(t, 3) - 380 * t * t + 4100 * t + 220;
		return alt;
	}
	public static double velocity(double t) {
		double vel = -0.48 * Math.pow(t, 3) + 36 * t * t - 760 * t + 4100;
		return vel;
	}

}
