package com.java2.oo;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class VendingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine vm = new VendingMachine();
		FileReader fr;
		try {
			fr = new FileReader("Vending.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] tokens = line.split(",");
			int count = Integer.parseInt(tokens[0]);
			for(int i = 0; i < count; i++) {
				String name = tokens[i*2+1];
				int price = Integer.parseInt(tokens[i*2+2]);
				vm.drinks.add(new Drink(i+1,name,price));
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

