package com.rahulraj.SocketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class urlWebScraping {
  public static void main(String[] args) throws IOException {

    URL url = new URL("http://rahulraj2.offyoucode.co.uk/");
    URLConnection myURL = url.openConnection();
    BufferedReader in = new BufferedReader(new InputStreamReader(myURL.getInputStream()));
    String inputLine;
    String pattern = "<a href=\"MathsProject/\">(.*?)</a>";
    Pattern r = Pattern.compile(pattern);

//    <a href="MathsProject/">Go to Maths Project</a>
    while ((inputLine = in.readLine()) != null)
    {
//      System.out.println(inputLine);
      if(inputLine.contains("MathsProject"))
      {
        Matcher m = r.matcher(inputLine);
        if (m.find( )) {
          System.out.println(m.group(1));
        }
      }
    }
    in.close();
  }
}
