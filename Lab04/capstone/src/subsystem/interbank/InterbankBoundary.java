package subsystem.interbank;

import common.exception.UnrecognizeException;
import utils.API;

public class InterbankBoundary {
	String query(String url, String data) {
		String response = null;
		try {
			String token = "abcnguyenbadduc";
			response = API.post(url, data,token);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new UnrecognizeException();
		}
		return response;
	}
}
