package com.bank;

import java.util.Random;

/**
 * @ClassName: Bank
 * @Description: 银行
 * @author Administrator
 * @date 2016年11月4日 下午3:03:12
 * @modifier
 * @modify-date 2016年11月4日 下午3:03:12
 * @version 1.0
 */

public class Bank {
	// 银行的金库
	private int sum;

	
	//同步方法
	public synchronized void add(int money) {
		sum += money;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"金库余额为：" + sum);
	}
}
