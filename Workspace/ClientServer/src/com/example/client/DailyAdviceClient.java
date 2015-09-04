package com.example.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {

		public void go(){
//			make a connection to the socket
			try{
			Socket s = new Socket("127.0.0.1", 4242);
			
			//Define an input stream to convert all the bits to characters
			InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
			
			//Convert all bits to characters
			BufferedReader reader = new BufferedReader(streamReader);
			
			String advice = reader.readLine();
			
			System.out.println("Today you should "+advice);
			
			reader.close();
			s.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		public static void main(String[] args) {
			DailyAdviceClient client = new DailyAdviceClient();
			client.go();
		}
}
