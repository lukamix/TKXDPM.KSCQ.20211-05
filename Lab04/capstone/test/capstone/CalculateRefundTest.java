package capstone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.GiveBikeBackController;

class CalculateRefundTest {

	private GiveBikeBackController mGiveBikeBackController;
	@BeforeEach
	void setUp() throws Exception {
		mGiveBikeBackController = new GiveBikeBackController();
	}

	@ParameterizedTest
	@CsvSource({
		"0,1000000,400000",
		"0,1750000,700000",
		"0,1375000,550000",
		"10000,1000000,390000",
		"19000,1750000,681000",
		"370000,1750000,330000",
		"418000,1000000,-18000",
	})
	void test(int rentfee,int bike_cost,int expected) {
		int isValided = mGiveBikeBackController.calculateRefund(rentfee,bike_cost);
		assertEquals(expected,isValided);
	}

}
