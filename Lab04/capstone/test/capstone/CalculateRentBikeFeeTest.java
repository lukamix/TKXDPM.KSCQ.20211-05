package capstone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.GiveBikeBackController;

class CalculateRentBikeFeeTest {

	private GiveBikeBackController mGiveBikeBackController;
	@BeforeEach
	void setUp() throws Exception {
		mGiveBikeBackController = new GiveBikeBackController();
	}

	@ParameterizedTest
	@CsvSource({
		"-10,0",
		"5,0",
		"10,0",
		"35,10000",
		"40,10000",
		"50,13000",
		"70,19000",
	})
	void test(int time,int expected) {
		int isValided = mGiveBikeBackController.calculateRentBikeFee(time);
		assertEquals(expected,isValided);
	}
}
