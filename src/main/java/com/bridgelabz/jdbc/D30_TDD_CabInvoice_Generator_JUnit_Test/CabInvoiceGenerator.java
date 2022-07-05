package com.bridgelabz.jdbc.D30_TDD_CabInvoice_Generator_JUnit_Test;

public class CabInvoiceGenerator{
	private final int COST_PER_KM = 10;
	private final int COST_PER_MINUTE = 1;
	public int MIN_FARE = 5;
	double totalFare;

	public double calculateFare(double DISTANCE, int TIME) {

		totalFare = COST_PER_KM * DISTANCE + COST_PER_MINUTE * TIME;
		if (totalFare < MIN_FARE)
			totalFare = MIN_FARE;
		return totalFare;
	}

	public double calculateFare(Rides[] rides) {
		double totalFare = 0.0;
		for (Rides ride : rides)
			totalFare = totalFare + this.calculateFare(ride.distance, ride.time);
		return totalFare;
	}
}
