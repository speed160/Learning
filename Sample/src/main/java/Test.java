package main.java;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		// TODO Auto-generated method stub

		/*
		 * 1. There are five publishers. 2. Each publisher in initialized with a name
		 * and a time interval. 3. A publisher creates a message at regular interval
		 * defined by the time intrval assigned to it and puts that message(Name of the
		 * publisher & timeStamp) to a queue. 4. A consumer is reading the messages from
		 * the queue and printing the message on the terminal message has two fields,
		 * publisher's name and the timestamp at which the message was generated
		 * 
		 */

	}

}

class Publisher {

	ArrayList<String> al = new ArrayList<String>();
	private Date timeStamp;
	private String Name;
	
	Test t = new Test();

	public Publisher(Date dt, String name) {
		this.timeStamp = dt;
		this.Name = name;
	}

	public void createMessage() {

		String s = timeStamp + " " + Name;
		al.add(s);
	}

	public void sendMessage(String s) {

	}

}

class Receiver {

	public void printMessage(ArrayList<String> s) {

		for (int i = 0; i < s.size(); i++) {
			System.out.println("Message Is: " + s.get(0));
		}
		
		// 
		
		
	}

}
