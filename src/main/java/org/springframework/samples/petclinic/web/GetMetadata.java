package org.springframework.samples.petclinic.web;


import java.net.*;
import java.io.*;
import javax.servlet.http.*;

public class GetMetadata {
	
public static String getHostName() throws Exception {

	      URL url = new URL("http://metadata.google.internal/computeMetadata/v1/instance/hostname");
	      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	      conn.setRequestMethod("GET");
	      conn.setRequestProperty("Metadata-Flavor", "Google");
	      BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	      String line = rd.readLine();
//	      while ((line = rd.readLine()) != null) {
//	    	System.out.println(line);
//	      }
	      rd.close();
	      return line;
 }

 
 public static String getInstanceName() throws Exception {
     URL url = new URL("http://metadata.google.internal/computeMetadata/v1/instance/name");
     HttpURLConnection conn = (HttpURLConnection) url.openConnection();
     conn.setRequestMethod("GET");
     conn.setRequestProperty("Metadata-Flavor", "Google");
     BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
     String line = rd.readLine();
     rd.close();
     return line;
}
 
 public static String getZone() throws Exception {
     URL url = new URL("http://metadata.google.internal/computeMetadata/v1/instance/zone");
     HttpURLConnection conn = (HttpURLConnection) url.openConnection();
     conn.setRequestMethod("GET");
     conn.setRequestProperty("Metadata-Flavor", "Google");
     BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
     String line = rd.readLine();
     rd.close();
     return line;
} 
 
public static String getInternalIP() throws Exception {
    URL url = new URL("http://metadata.google.internal/computeMetadata/v1/instance/network-interfaces/0/ip");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    conn.setRequestProperty("Metadata-Flavor", "Google");
    BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    String line = rd.readLine();
    rd.close();
    return line;
} 	 
	 

public static String getExternalIP() throws Exception {
   URL url = new URL("http://metadata.google.internal/computeMetadata/v1/instance/network-interfaces/0/access-configs/0/external-ip");
   HttpURLConnection conn = (HttpURLConnection) url.openConnection();
   conn.setRequestMethod("GET");
   conn.setRequestProperty("Metadata-Flavor", "Google");
   BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
   String line = rd.readLine();
   rd.close();
   return line;
} 	 
	 

public static String getNetworkType() throws Exception {
   URL url = new URL("http://metadata.google.internal/computeMetadata/v1/instance/network-interfaces/0/access-configs/0/type");
   HttpURLConnection conn = (HttpURLConnection) url.openConnection();
   conn.setRequestMethod("GET");
   conn.setRequestProperty("Metadata-Flavor", "Google");
   BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
   String line = rd.readLine();
   rd.close();
   return line;
} 	 



public static String getNetwork() throws Exception {
   URL url = new URL("http://metadata.google.internal/computeMetadata/v1/instance/network-interfaces/0/network");
   HttpURLConnection conn = (HttpURLConnection) url.openConnection();
   conn.setRequestMethod("GET");
   conn.setRequestProperty("Metadata-Flavor", "Google");
   BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
   String line = rd.readLine();
   rd.close();
   return line;
} 	 


public static String getTag() throws Exception {
   URL url = new URL("http://metadata.google.internal/computeMetadata/v1/instance/tags");
   HttpURLConnection conn = (HttpURLConnection) url.openConnection();
   conn.setRequestMethod("GET");
   conn.setRequestProperty("Metadata-Flavor", "Google");
   BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
   String line = rd.readLine();
   rd.close();
   return line;
}

public static String getRemoteAddr(HttpServletRequest request) throws Exception {
	String remoteaddr = "Blank";
//	InetAddress inetaddr;
//	inetaddr = InetAddress.getLocalHost();
	remoteaddr = request.getRemoteAddr();
//	remoteaddr = inetaddr.toString();
	return remoteaddr;
} 	 

}

