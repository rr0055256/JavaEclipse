package com.example.chat;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.*;

public class SimpleChatClientA {
	
	JTextArea incoming;
	JTextField outgoing;
	PrintWriter writer;
	BufferedReader reader;
	Socket sock;
	
	public void go(){
		JFrame frame = new JFrame("Ludicrously Simple Chat Client");//Ludicrous - causing laughter because of absurdity, ridiculous, laughable
		JPanel mainPanel = new JPanel();
		incoming = new JTextArea(15,50);
		incoming.setLineWrap(true);
		incoming.setWrapStyleWord(true);
		incoming.setEditable(false);
		JScrollPane qScroller = new JScrollPane(incoming);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		outgoing = new JTextField(20);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonListener());
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		mainPanel.add(qScroller);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		setUpNetworking();
		
		Thread readerThread = new Thread(new IncomingReader());
		readerThread.start();
		
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(400,500);
		frame.setVisible(true);
		
	}//close go

	private void setUpNetworking() {
		//we are using local host so that we test the client and server on one machine
		try{
		sock = new Socket("127.0.0.1",6000);
		InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
		reader = new BufferedReader(streamReader);
		writer = new PrintWriter(sock.getOutputStream());
		System.out.println("Networking established");
		}catch(IOException e){
			e.printStackTrace();
		}
	}// close setUpNetworking
	
	public class SendButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			writer.println(outgoing.getText());
			writer.flush();
			
			outgoing.setText("");
			outgoing.requestFocus();
		}
		
	}//close SendButtonListener inner class
	
	public class IncomingReader implements Runnable{
		public void run(){
			String message;
			try{
				while((message = reader.readLine()) != null ){
					System.out.println("read" + message);
					incoming.append(message + "\n");
				}
			}catch(Exception e){ e.printStackTrace();}
		}
	}//close inner class
	
	public static void main(String[] args) {
		new SimpleChatClientA().go();
	}
	
}//close outer class
