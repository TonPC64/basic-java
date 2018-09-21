import java.net.*;
import java.io.*;
import org.apache.http.client.*;
import org.apache.http.impl.client.*;
import org.apache.http.client.methods.*;
import org.apache.http.*;

public class JsonJava {
  public static void main(String[] args) throws Exception {
    URL url = new URL("https://swapi.co/api/people/1/");
    System.out.println(url + " TonTon");
    // HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    // conn.addRequestProperty("User-Agent", "Java/1.8.1");
    // conn.setRequestProperty("Content-Type", "application/json");

    // BufferedReader br;
    // if (200 <= conn.getResponseCode() && conn.getResponseCode() <= 299) {
    // br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

    // } else {
    // br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
    // }
    // String response = new String();
    // for (String line; (line = br.readLine()) != null; response += line);
    // System.out.println(response);
    HttpClient client = new DefaultHttpClient();
    HttpGet request = new HttpGet(url + "");
    request.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
    HttpResponse res = client.execute(request);
    BufferedReader br = new BufferedReader(new InputStreamReader(res.getEntity().getContent()));

    String response = new String();
    for (String line; (line = br.readLine()) != null; response += line);
    System.out.println(response);
  }
}
