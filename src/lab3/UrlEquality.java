package lab3;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlEquality {
	public static void main(String[] args) {
		try {
			URL www = new URL("https://www.iamsajan.com");
			URL http = new URL("https://iamsajan.com");
			if (http.equals(www)) {
				System.out.println(http + " is the same as " + www);
			} else {
				System.out.println(http + " is not the same as " + www);
			}
		} catch (MalformedURLException ex) {
			System.err.println(ex);
		}
	}
}