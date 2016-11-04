package com.ticket2;

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
	private  int number = 100;
	Object  obj=new Object();
	
	@Override
	public void run() {
		while (true) {
			//加锁防止出现多卖票，买重复票的错误
			synchronized (obj) {
				if(number>0){
					try {
						Thread.sleep(new Random().nextInt(10)*10);
						System.out.println(Thread.currentThread().getName()+"卖："+number--);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			
		}
	}

}
