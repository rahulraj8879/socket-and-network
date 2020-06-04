package com.rahulraj.SocketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

  public static void main(String[] args) {


    try {
      InetAddress inetAddress = InetAddress.getByName("localhost");
      Socket socket = new Socket(inetAddress,9091);
      PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      System.out.println(bufferedReader.readLine());
      out.println("yoo");
      bufferedReader.close();
      out.close();
      socket.close();

    } catch (UnknownHostException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
