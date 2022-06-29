package com.cg.assignment;

import java.util.ArrayList;

public class Q8Thread {
	public static void main(String[] args) {
		thread execute = new thread();
		System.out.println(Thread.currentThread());
		execute.start();
	}
}

class thread extends Thread {
	public void run() {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(75);
		numbers.add(65);
		numbers.add(179);
		numbers.add(44);
		numbers.add(83);
		numbers.add(28);
		numbers.add(345);
		numbers.forEach(t -> System.out.println(t));
	}
}
