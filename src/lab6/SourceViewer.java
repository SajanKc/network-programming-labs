package lab6;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SourceViewer {
	public static void main(String[] args) {
		String urlPath = "https://kcsajan.com.np";
		try {
			URL u = new URL(urlPath);
			HttpURLConnection uc = (HttpURLConnection) u.openConnection();
			int code = uc.getResponseCode();
			String response = uc.getResponseMessage();

			System.out.println("HTTp 1.X " + code + " " + response);

			for (int j = 1;; j++) {
				String header = uc.getHeaderField(j);
				String key = uc.getHeaderFieldKey(j);
				if (header == null || key == null)
					break;
				System.out.println(uc.getHeaderField(j) + " : " + header);
			}

			InputStream in = new BufferedInputStream(uc.getInputStream());
			Reader r = new InputStreamReader(in);
			int c;
			while ((c = r.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
