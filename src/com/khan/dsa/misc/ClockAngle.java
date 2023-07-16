package com.khan.dsa.misc;

public class ClockAngle {

	public static String calculateAngleTrick(int hour, int minute) {
		double angle = Math.abs(30 * hour - 5.5 * minute);
		return Math.min(360 - angle, angle) + " degree";
	}

	public static String calculateAngleConcept(int hour, int minute) {
		double initialAngle = 30 * hour;
		double hourAngle = 0.5 * minute;
		double minuteAngle = 6 * minute;
		double angle = Math.abs(minuteAngle - (initialAngle + hourAngle));
		return Math.min(360 - angle, angle) + " degree";
	}

	public static void main(String[] args) {
		System.out.println(calculateAngleTrick(12, 0));
		System.out.println(calculateAngleConcept(12, 0));
	}
}
