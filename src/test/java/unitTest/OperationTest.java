package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationTest {

	@Test
	public void TrueTest() {
		Operation operation = new Operation();
		int valueA = 2;
		int valueB = 4;
		int total = operation.sumOperation(valueA, valueB);
		assertTrue(total==valueA+valueB);
	}
	
	@Test
	public void FalseTest() {
		Operation operation = new Operation();
		int valueA = 2;
		int valueB = 4;
		int total = operation.sumOperation(valueA, valueB);
		assertFalse(total==valueA-valueB);
	}

}
