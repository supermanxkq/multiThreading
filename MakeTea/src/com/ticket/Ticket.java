package com.ticket;

import java.util.Random;

/**
 * @ClassName: Ticket
 * @Description: 卖票
 * @author Administrator
 * @date 2016年11月4日 下午2:09:38
 * @modifier
 * @modify-date 2016年11月4日 下午2:09:38
 * @version 1.0
 */

public class Ticket implements Runnable {
	// 票的数量
	private static int number = 10;

	// private int number = 10;
	@Override
	public void run() {
		try {

			// 需要被同步的代码
			while (number > 0) {
				// 解决同步问题，放对象
				synchronized (Thread.currentThread()) {
					System.out.println(Thread.currentThread().getName() + "卖:"
							+ (number--));
					// 卖票休眠
					Thread.sleep(500);
					// Thread.sleep(new Random().nextInt(10)*1000);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
