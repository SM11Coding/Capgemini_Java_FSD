package practice1;

import java.util.*;

class User{
	String name;
	int balance;
	
	User(String name,int balance){
		this.name=name;
		this.balance=balance;
	}
	
	public void addBalance(int amount){
		this.balance = balance + amount;
	}
	
	public String currentBalance() {
		return ("Hello " + name + ", your current balance is " + this.balance );
	}
}

class Game{
	
	HashMap<String,Integer> map = new HashMap<String,Integer>();
	
	String playGame(String gameName,User details){
		
		for(Map.Entry elements : map.entrySet()) {
			if(elements.getKey() == gameName) {
				
				int val = (int) elements.getValue();
				details.balance = details.balance - val;			}
		}
		System.out.println(details.name + " thanks for playing "+ gameName +" and your current balance is " + details.balance);
		return "";
	}
	
	public void addGame(String gameName,int gamePrice) {
		map.put(gameName,gamePrice);
	}
	
	
}

public class Game_HashMap{
	public static void main(String[]Args) {
		
		User user = new User("Steve",500);
		Game play = new Game();
		
		user.addBalance(500);
		play.addGame("Ludo",20);
		play.addGame("Chess",10);
		play.addGame("Hangman",30);
		
		play.playGame("Chess", user);
		System.out.println(user.currentBalance());
	}
}
