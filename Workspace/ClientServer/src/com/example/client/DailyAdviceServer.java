package com.example.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
	
	String[] adviceList = {"Take smaller bites","Go for the tight jeans.No they do not make you look fat.","One word:inappropriate","Just for today, be honest. Tell your bosswhat you *really* think","You might want to rethink that haircut"};
	
	public void go(){
		try {
			//this makes the serversocket listen to client requests coming on 4242
			ServerSocket serverSock = new ServerSocket(4242);
			
			while(true){
				//the server keeps waiting for a request from the client and the accept methos of server socket returns a socket for communicating with the client
				Socket sock = serverSock.accept();
				
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
				serverSock.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//close go
	
	private String getAdvice(){
		int random = (int) (Math.random() * adviceList.length);
		return adviceList[random];
	}
	
	public static void main(String[] args) {
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
	}
	
}