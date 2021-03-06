package com.swarna.cj.basics.oops;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Manager {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		int N=189;
		Player[] players=new Player[N];
		Scanner sc=new Scanner(new File("data/ipl_2021.csv"));
		sc.nextLine();//to skip headers
		int count=0;
		while(sc.hasNext()) {
			int i=0;
			String line=sc.nextLine();
			String[] arr=line.split(",");
			String name=arr[i++];
			String role=arr[i++];
			String country=arr[i++];
			String teamname=arr[i++];
			double price=Double.parseDouble(arr[i++]);
			
			//invoking parameterized constructor
			Player player=new Player(name,teamname,country,role,price);
			
			//passing player object to players array
			players[count++]=player;
		}
		
		System.out.println("Total Players :"+players.length);
		
		//can you print names of all the players
		for(Player player:players) {
			System.out.println(player.getName());
			
		}
		
		//Display all the players of RCB
		
		System.out.println("-----------Players of RCB----------------");
		
		for(int i=0;i<players.length;i++) {
			Player player=players[i];
			if(player.getTeamname().equals("RCB")) {
				player.showDetails();
				
				System.out.println("----------------------------------------");
			}
				
		}
		
		//Display Total, avg,count,Max,Min amounts of the RCB
		
		int rcb_count=0;
		for(Player player:players) {
			if(player.getTeamname().equals("RCB")) {
				rcb_count++;
				
				}
		}
		
		Player[] player_rcb=new Player[rcb_count];
		int c=0;
		for(Player player:players) {
			if(player.getTeamname().equals("RCB")) {
				player_rcb[c++]=player;
			}	
		}
			
		//Max,min,Total,avg
		double max=player_rcb[0].getPrice(),min=player_rcb[0].getPrice(),total=0,avg=0;
		
		for(Player player:player_rcb) {
			double price=player.getPrice();
			if(max<price) {
				max=price;
			}
			if(min>price) {
				min=price;
			}
			total+=price;
				
		}
		avg=total/(float)player_rcb.length;
		
		System.out.println("Max Paid of RCB :"+max);
		System.out.println("Min Paid of RCB :"+min);
		System.out.println("Total number of RCB Players :"+player_rcb.length);
		System.out.println("Average amount of RCB :"+avg);
		
}//End of main
}//End of class Manager
