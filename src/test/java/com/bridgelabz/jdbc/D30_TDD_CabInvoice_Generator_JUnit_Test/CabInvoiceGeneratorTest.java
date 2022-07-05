package com.bridgelabz.jdbc.D30_TDD_CabInvoice_Generator_JUnit_Test;
import org.junit.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CabInvoiceGeneratorTest {
		
		@Test
	    public void givenDistanceAndTime_ShouldReturnTotalFare() {
	        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
	        double TotalFare = cabInvoiceGenerator.CalculateFare(5.0, 4);
	        Assert.assertEquals(54, TotalFare, TotalFare);
	    }

	    @Test
	    public void givenDistanceAndTime_ShouldReturnMinFare() {
	        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
	        double TotalFare = cabInvoiceGenerator.CalculateFare(0.1, 2);
	        Assert.assertEquals(5, TotalFare, TotalFare);
	    }
    
  
}
