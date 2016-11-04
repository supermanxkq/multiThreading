package com.ticket;

public class TicketDemo {
	public static void main(String[] args) {
		
		
		/**
		 * 问题：当多条语句操作同一个线程共享数据时：会出现多卖票，卖重复票的后果。
		 * 同步的前提：必须要有两个或者两个以上的线程，必须是多个线程使用同一个锁。
		 */
		// 卖票
		Ticket ticketRunnable = new Ticket();
		// 窗口卖票1
		Thread ticketThread1 = new Thread(ticketRunnable);
		ticketThread1.setName("九龙坡区");
		// 窗口卖票2
		Thread ticketThread2 = new Thread(ticketRunnable);
		ticketThread2.setName("沙坪坝区");
		// 窗口卖票3
		Thread ticketThread3 = new Thread(ticketRunnable);
		ticketThread3.setName("江北区");
		
		
		ticketThread1.start();
		ticketThread2.start();
		ticketThread3.start();
	}
}
