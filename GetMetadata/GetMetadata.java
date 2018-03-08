//package org.springframework.samples.petclinic.web;

import java.net.*;
import java.io.*;

public class GetMetadata{

   public static void getHonstname() throws Exception {

	      URL url = new URL("http://metadata.google.internal/computeMetadata/v1/instance/hostname");
	      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	      conn.setRequestMethod("GET");
	      conn.setRequestProperty("Metadata-Flavor", "Google");
	      BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	      String line;
	      while ((line = rd.readLine()) != null) {
	    	System.out.println(line);
	      }
	      rd.close();	
   }
   
   public static void main(String[] args) throws Exception {
//	   GetMetadata hostname = new GetMetadata();
//	   hostname.getHostname();
	   GetMetadata.getHonstname();
   
	   
   }
   
   

}
