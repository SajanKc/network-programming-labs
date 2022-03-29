package lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlDataReader {

	public static void main(String[] args) {

		try {
			URL portfolio = new URL("https://www.kcsajan.com.np");
			BufferedReader in = new BufferedReader(new InputStreamReader(portfolio.openStream()));

			String inputLine;

			while ((inputLine = in.readLine()) != null)
				System.out.println(inputLine);

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
