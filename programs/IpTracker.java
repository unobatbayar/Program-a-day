// //Get detailed information such as geolocation and more of any ip address.
// //@author unobatbayar 2019 May 31
// import java.net.*; 
// import java.io.*; 
// import java.util.*; 
// import java.net.InetAddress; 


  
// public class IpTracker { 
//     public static void main(String args[]) throws Exception { 
//         InetAddress localhost = InetAddress.getLocalHost(); 
//         System.out.println("System IP Address : " + 
//                       (localhost.getHostAddress()).trim()); 
  
//         // Find public IP address 
//         String systemipaddress = ""; 
//         try
//         { 
//             URL url_name = new URL("http://bot.whatismyipaddress.com"); 
  
//             BufferedReader sc = 
//             new BufferedReader(new InputStreamReader(url_name.openStream())); 
  
//             // reads system IPAddress 
//             systemipaddress = sc.readLine().trim(); 
//         } 
//         catch (Exception e) 
//         { 
//             systemipaddress = "Cannot Execute Properly"; 
//         } 
//         System.out.println("Public IP Address: " + systemipaddress +"\n"); 
//     } 
// } 