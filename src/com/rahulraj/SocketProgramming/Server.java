package com.rahulraj.SocketProgramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
	// write your code here
      try {
        ServerSocket serverSocket = new ServerSocket(9091);

        boolean stop = false;
        int counter = 1;
        while (!stop) {

          int clientcount = counter;
          counter++;
          System.out.println("waiting for clients");
          Socket socket = serverSocket.accept();
          System.out.println("connected to client");
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
