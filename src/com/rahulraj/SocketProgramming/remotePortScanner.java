package com.rahulraj.SocketProgramming;

import java.io.IOException;
import java.net.Socket;

public class remotePortScanner {

  public static void main(String[] args) {
    int port = 1;
    String ip_address = "111.91.50.250";
    for (int i = port; i < 100; i++) {
        try {
          Socket socket = new Socket(ip_address, port);
          System.out.println("port " + port + " is in listening state");
          socket.close();
        } catch (IOException e) {
//        e.printStackTrace();

          System.out.println("port "+i+"is opened");
        }
        port++;

      }
    }
  }

