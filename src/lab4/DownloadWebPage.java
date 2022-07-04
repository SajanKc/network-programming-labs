package lab4;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownloadWebPage {

	public static void main(String[] args) {
		downloadPage("https://kcsajan.com.np");
	}

	private static void downloadPage(String url) {
		try {
			URL u = new URL(url);
			URLConnection uCon = u.openConnection();
			InputStream in = uCon.getInputStream();
			Reader r = new InputStreamReader(in);
			int c;
			while ((c = r.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (MalformedURLException ex) {
			System.err.println(url + " is not a parseable URL");
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
}