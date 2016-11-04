package com.ticket2;

public class TicketDemo {
	public static void main(String[] args) {
		
		
		/**
		 * 问题：当多条语句操作同一个线程共享数据时：会出现多卖票，卖重复票的后果。
		 * 同步的前提：必须要有两个或者两个以上的线程，必须是多个线程使用同一个锁。
		 */
		// 卖票
		Ticket tick = new Ticket();
		for (int i = 0; i <4; i++) {
			Thread t=new Thread(tick);
			t.start();
		}
	}
}
