package com.rahulraj.SocketProgramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
	// write your code here
      try {
	      
	      //open cmd and check if telnet is installed by typing telnet .if not activate it from 
	      //controlpanel/program-and-feature/turn-window-feature-on-and-off/select telnet and activate
	      //then type telnet localhost 9091 to start listening for client
        ServerSocket serverSocket = new ServerSocket(9091);

        boolean stop = false;
        int counter = 1;
        while (!stop) {

          int clientcount = counter;
          counter++;
          System.out.println("waiting for clients");
          Socket socket = serverSocket.accept();
          System.out.println("connected to client");
		
			// PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			//       out.println("hello bhai jaan");


			//       BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//       String clientInput = input.readLine();
			//       System.out.println(clientInput);
			//       out.close();
			//       input.close();
			//       socket.close();
		
		
		//comment below two lines if you want to run client.java other than clientThread
		//also uncomment above lines..run the program and open cmd and type telnet localhost 9091
		//then cmd will show u server msg printed and whatever u type and print will be show in  ide as client message
		
          clientThread clientThread = new clientThread(socket);
          clientThread.start();
          System.out.println(clientcount);
        }
      }

      catch (IOException e) {
        e.printStackTrace();
      }
    }
}
