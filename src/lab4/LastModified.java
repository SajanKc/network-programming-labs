package lab4;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class LastModified {
	public static void main(String[] args) {
		String urlPath = "https://kcsajan.com.np";
		try {
			URL u = new URL(urlPath);
			HttpURLConnection http = (HttpURLConnection) u.openConnection();
			http.setRequestMethod("HEAD");
			System.out.println(u + " was last modified at " + new Date(http.getLastModified()));
		} catch (MalformedURLException ex) {
			System.err.println(urlPath + " is not a URL I understand");
		} catch (IOException ex) {
			System.err.println(ex);
		}
		System.out.println();
	}
}