package com.bridgelabz.jdbc.D30_TDD_CabInvoice_Generator_JUnit_Test;
import org.junit.*;
import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorTest {
		
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
		double totalFare = cabInvoiceGenerator.calculateFare(5.0, 4);
		Assert.assertEquals(54, totalFare, totalFare);
	}

	@Test
	public void givenDistanceAndTime_ShouldReturnMinFare() {
		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
		double totalFare = cabInvoiceGenerator.calculateFare(0.1, 2);
		Assert.assertEquals(5, totalFare, totalFare);
	}

	@Test
	public void givenMultipleRides_ShouldCalculateAggregateTotal() {

		Rides[] rides = { new Rides(5, 4), new Rides(0.1, 2) };

		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
		double totalFare = cabInvoiceGenerator.calculateFare(rides);
		Assert.assertEquals(54, totalFare, totalFare);
	}

	@Test
	public void ReturnTotalRidesTotalFareandAverageFareperRide() {
		Rides[] rides = { new Rides(5, 4), new Rides(0.1, 2) };

		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
		double totalFare = cabInvoiceGenerator.calculateFare(rides);
		int noOfRides = cabInvoiceGenerator.numberOfRides(rides);
		double averageFare = cabInvoiceGenerator.calculateAverageFarePerRide(rides);

		Assert.assertEquals(54, totalFare, totalFare);
		Assert.assertEquals(2, noOfRides);
		Assert.assertEquals(27, averageFare, averageFare);
	}

	@Test
	public void givenUserIdReturnTheInvoice() {
		String userID = "Driver1";
		Rides[] rides = new Rides[] { new Rides(5, 4)};
		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
		cabInvoiceGenerator.addRides(userID, rides);
		double rideDetails = cabInvoiceGenerator.getRidesDetails(userID);
		int noOfRides = cabInvoiceGenerator.numberOfRides(rides);
		Assert.assertEquals(1, noOfRides);
	}
}
