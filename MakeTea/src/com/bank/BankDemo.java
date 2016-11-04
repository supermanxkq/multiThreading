package com.bank;

public class BankDemo {
	public static void main(String[] args) {
		Save sa = new Save();
		
		//第一个窗户
		Thread t1 = new Thread(sa);
		Thread t2 = new Thread(sa);
		t1.start();
		t2.start();
	}
}
