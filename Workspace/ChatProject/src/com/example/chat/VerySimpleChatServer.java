package com.example.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class VerySimpleChatServer {

		ArrayList ClientOutputStreams;
		
		public class ClientHandler implements Runnable{
			BufferedReader reader;
			Socket sock;
			
			public ClientHandler(Socket clientSocket){
				try{
					sock = clientSocket;
					InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
					reader = new BufferedReader(streamReader);
					
				}catch(Exception e){e.printStackTrace();}
			}//close constructor
			
			@Override
			public void run() {
				String message;
				try{
					while((message = reader.readLine()) != null){
						System.out.println("read " + message);
						tellEveryone(message);
					}
				}catch(Exception e){e.printStackTrace();}
			}//close run
			
			}//close inner class - clientHandler
		
		public static void main(String[] args) {
			new VerySimpleChatServer().go();
		}
		
		private void go() {
			ClientOutputStreams = new ArrayList();
			try{
				ServerSocket serverSock = new ServerSocket(6000);
				
				while(true)
				{
					Socket clientSocket = serverSock.accept();
					PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
					ClientOutputStreams.add(writer);
					
					Thread t = new Thread(new ClientHandler(clientSocket));
					t.start();
					System.out.println("Got a connection");
				}
			}catch(Exception e){e.printStackTrace();}
			
		}//close go method
		
		public void tellEveryone(String message) {
			
			Iterator it = ClientOutputStreams.iterator();
			while(it.hasNext()){
				try{
				PrintWriter writer = (PrintWriter)it.next();
				writer.println(message);
				writer.flush();
				}catch(Exception e) { e.printStackTrace();}
			}//close while
			
	}//close server

}//close tellEveryone