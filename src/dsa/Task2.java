package dsa;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the our name");
		String name=sc.nextLine();
		name=name.toLowerCase().trim().replaceAll( " +","_").replaceAll("[^a-z0-9_]","");
		System.out.println(name);
		
	}

}
