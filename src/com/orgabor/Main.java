package com.orgabor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {

	public static void main(String[] args) {
		try(Socket socket = new Socket("localhost", 5000)) {
			BufferedReader echoes = new BufferedReader(
									new InputStreamReader(socket.getInputStream()));
			PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);
			
		} catch(IOException e) {
			System.out.println("Client exception: " + e.getMessage());
		}
	}

}
