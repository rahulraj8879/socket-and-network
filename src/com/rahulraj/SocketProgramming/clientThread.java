package com.rahulraj.SocketProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class clientThread extends Thread {
private Socket socket= null;

  public clientThread(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {
    try {

      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
      out.println("hello bhai jaan");


      BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      String clientInput = input.readLine();
      System.out.println(clientInput);
      out.close();
      input.close();
      socket.close();

    }catch (Exception e){
      System.out.println(e);
    }

  }
}
